package dev.terrarium.minefactoryrenewed.api.item;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public record Frosty(Item item, int energyGen, int burnTime) {

    public static final Codec<Frosty> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Registry.ITEM.byNameCodec().fieldOf("item").forGetter(Frosty::item),
            Codec.INT.fieldOf("energyGen").forGetter(Frosty::energyGen),
            Codec.INT.fieldOf("burnTime").forGetter(Frosty::burnTime)
    ).apply(instance, Frosty::new));
}