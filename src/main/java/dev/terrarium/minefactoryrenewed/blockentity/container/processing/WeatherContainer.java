package dev.terrarium.minefactoryrenewed.blockentity.container.processing;

import dev.terrarium.minefactoryrenewed.blockentity.container.MachineContainer;
import dev.terrarium.minefactoryrenewed.blockentity.machine.MachineBlockEntity;
import dev.terrarium.minefactoryrenewed.registry.ModBlockEntities;
import net.minecraft.world.entity.player.Inventory;

public class WeatherContainer extends MachineContainer {

    public WeatherContainer(int id, Inventory inventory, MachineBlockEntity blockEntity) {
        super(ModBlockEntities.WEATHER_CONTAINER.get(), id, inventory, blockEntity, false);
        this.addPlayerSlots(inventory, false);
    }
}