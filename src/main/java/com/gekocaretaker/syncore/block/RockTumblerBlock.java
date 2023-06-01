package com.gekocaretaker.syncore.block;

import com.gekocaretaker.syncore.block.entity.BlockEntityInit;
import com.gekocaretaker.syncore.block.entity.RockTumblerBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class RockTumblerBlock extends AbstractFurnaceBlock {
    public RockTumblerBlock(BlockBehaviour.Properties p_48687_) {
        super(p_48687_);
    }

    private static VoxelShape SHAPE_NORTH = Stream.of(
            Block.box(3, 0, 0, 13, 8, 4),
            Block.box(4, 8, 4, 12, 16, 12),
            Block.box(3, 0, 4, 13, 5.375, 12),
            Block.box(3, 0, 12, 13, 8, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static VoxelShape SHAPE_EAST = Stream.of(
            Block.box(12, 0, 3, 16, 8, 13),
            Block.box(4, 8, 4, 12, 16, 12),
            Block.box(4, 0, 3, 12, 5.375, 13),
            Block.box(0, 0, 3, 4, 8, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static VoxelShape SHAPE_SOUTH = Stream.of(
            Block.box(3, 0, 12, 13, 8, 16),
            Block.box(4, 8, 4, 12, 16, 12),
            Block.box(3, 0, 4, 13, 5.375, 12),
            Block.box(3, 0, 0, 13, 8, 4)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static VoxelShape SHAPE_WEST = Stream.of(
            Block.box(0, 0, 3, 4, 8, 13),
            Block.box(4, 8, 4, 12, 16, 12),
            Block.box(4, 0, 3, 12, 5.375, 13),
            Block.box(12, 0, 3, 16, 8, 13)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        /*DirectionProperty direction = FACING;
        if (direction.equals(Direction.NORTH)) {
            return SHAPE_NORTH;
        } else if (direction.equals(Direction.EAST)) {
            return SHAPE_EAST;
        } else if (direction.equals(Direction.SOUTH)) {
            return SHAPE_SOUTH;
        } else if (direction.equals(Direction.WEST)) {
            return SHAPE_WEST;
        } else {
            return SHAPE_NORTH;
        }*/
        switch ((Direction)p_60555_.getValue(FACING)) {
            case NORTH:
            default:
                return SHAPE_NORTH;
            case EAST:
                return SHAPE_EAST;
            case SOUTH:
                return SHAPE_SOUTH;
            case WEST:
                return SHAPE_WEST;
        }
    }

    /* BLOCK ENTITY */

    @Override
    protected void openContainer(Level p_48690_, BlockPos p_48691_, Player p_48692_) {
        BlockEntity blockEntity = p_48690_.getBlockEntity(p_48691_);
        if (blockEntity instanceof RockTumblerBlockEntity) {
            p_48692_.openMenu((MenuProvider) blockEntity);
            //p_48692_.awardStat();
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos p_153215_, BlockState p_153216_) {
        return new RockTumblerBlockEntity(p_153215_, p_153216_);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level p_153212_, BlockState p_153213_, BlockEntityType<T> p_153214_) {
        return createFurnaceTicker(p_153212_, p_153214_, BlockEntityInit.ROCK_TUMBLER_BLOCK_ENTITY.get());
    }

    @Override
    public void animateTick(BlockState p_220827_, Level p_220828_, BlockPos p_220829_, RandomSource p_220830_) {
        if ((Boolean)p_220827_.getValue(LIT)) {
            double d0 = (double)p_220829_.getX() + 0.5D;
            double d1 = (double)p_220829_.getY();
            double d2 = (double)p_220829_.getZ() + 0.5D;
            if (p_220830_.nextDouble() < 0.1) {
                p_220828_.playLocalSound(d0, d1, d2, SoundEvents.GRAVEL_STEP, SoundSource.BLOCKS, 1.0F, 1.0F, false);
            }

            Direction direction = (Direction)p_220827_.getValue(FACING);
            Direction.Axis direction$axis = direction.getAxis();
            double d3 = 0.52D;
            double d4 = p_220830_.nextDouble() * 0.6 - 0.3;
            double d5 = direction$axis == Direction.Axis.X ? (double)direction.getStepX() * 0.52D : d4;
            double d6 = p_220830_.nextDouble() * 9.0D / 16.0D;
            double d7 = direction$axis == Direction.Axis.Z ? (double)direction.getStepZ() * 0.52D : d4;
            p_220828_.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
        }
    }
}
