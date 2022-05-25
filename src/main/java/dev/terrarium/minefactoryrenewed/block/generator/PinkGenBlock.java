package dev.terrarium.minefactoryrenewed.block.generator;

import dev.terrarium.minefactoryrenewed.blockentity.generator.GeneratorBlockEntity;
import dev.terrarium.minefactoryrenewed.blockentity.generator.PinkGenBlockEntity;
import dev.terrarium.minefactoryrenewed.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PinkGenBlock extends GeneratorBlock {

    @Override
    public BlockEntityType<? extends GeneratorBlockEntity> getBlockEntityType() {
        return ModBlockEntities.PINK_GENERATOR.get();
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new PinkGenBlockEntity(pos, state);
    }
}
