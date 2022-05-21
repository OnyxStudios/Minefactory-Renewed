package dev.terrarium.minefactoryrenewed.block.machine.enchantment;

import dev.terrarium.minefactoryrenewed.block.machine.MachineBlock;
import dev.terrarium.minefactoryrenewed.blockentity.machine.MachineBlockEntity;
import dev.terrarium.minefactoryrenewed.blockentity.machine.enchantment.AutoAnvilBlockEntity;
import dev.terrarium.minefactoryrenewed.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class AutoAnvilBlock extends MachineBlock {

    public AutoAnvilBlock() {
        super();
    }

    @Override
    public BlockEntityType<? extends MachineBlockEntity> getBlockEntityType() {
        return ModBlockEntities.AUTO_ANVIL.get();
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new AutoAnvilBlockEntity(pos, state);
    }
}