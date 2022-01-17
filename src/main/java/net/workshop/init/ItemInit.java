package net.workshop.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.workshop.main;

public class ItemInit {

    public static final Item BRILLIANT_ALLOY = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item GILDED_NETHERITE_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.RARE));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(main.modname, "brilliant_alloy"), BRILLIANT_ALLOY);
        Registry.register(Registry.ITEM, new Identifier(main.modname, "gilded_netherite_ingot"), GILDED_NETHERITE_INGOT);
    }

    public static void init() {
        ItemInit.registerItems();
    }
}
