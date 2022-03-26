package dev.onyxstudios.minefactoryrenewed.registry;

import dev.onyxstudios.minefactoryrenewed.MinefactoryRenewed;
import dev.onyxstudios.minefactoryrenewed.block.ConveyorBeltBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MinefactoryRenewed.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinefactoryRenewed.MODID);

    public static final RegistryObject<Block> CONVEYOR_BELT = BLOCKS.register("conveyor_belt", ConveyorBeltBlock::new);
    public static final RegistryObject<BlockItem> CONVEYOR_BELT_ITEM = ITEMS.register("conveyor_belt", () ->
            new BlockItem(CONVEYOR_BELT.get(), new Item.Properties().stacksTo(16).tab(MinefactoryRenewed.TAB)));
}