package net.workshop.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.workshop.item.ArmorGildedNetherite;
import net.workshop.item.PickaxeGildedNetheriteItem;
import net.workshop.item.TierEmeraldItem;
import net.workshop.item.TierGildedNetheriteItem;
import net.workshop.main;

public class ItemInit {

    // Items
    public static final Item BRILLIANT_ALLOY =
            new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item GILDED_NETHERITE_INGOT =
            new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.RARE));

    // Weapons
    public static final SwordItem GILDED_NETHERITE_SWORD =
            new SwordItem(
                    TierGildedNetheriteItem.INSTANCE,
                    3,
                    -2.4F,
                    new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.RARE).fireproof());
    public static final SwordItem EMERALD_SWORD =
            new SwordItem(
                    TierEmeraldItem.INSTANCE,
                    3,
                    -2.4F,
                    new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.RARE));

    // Tools
    public static final PickaxeGildedNetheriteItem GILDED_NETHERITE_PICKAXE =
            new PickaxeGildedNetheriteItem(TierGildedNetheriteItem.INSTANCE,
                    1,
                    -2.8F,
                    new Item.Settings().group(ItemGroup.TOOLS).rarity(Rarity.RARE).fireproof());
    // Armor
    public static final ArmorMaterial GILDED_NETHERITE_ARMOR = new ArmorGildedNetherite();

    public static final Item GILDED_NETHERITE_HELMET =
            new ArmorItem(GILDED_NETHERITE_ARMOR, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).fireproof());

    public static void registerItems() {
        // Items
        Registry.register(Registry.ITEM, new Identifier(main.MOD_NAME, "brilliant_alloy"), BRILLIANT_ALLOY);
        Registry.register(Registry.ITEM, new Identifier(main.MOD_NAME, "gilded_netherite_ingot"), GILDED_NETHERITE_INGOT);

        // Weapons
        Registry.register(Registry.ITEM, new Identifier(main.MOD_NAME, "gilded_netherite_sword"), GILDED_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(main.MOD_NAME, "emerald_sword"), EMERALD_SWORD);

        //Tools
        Registry.register(Registry.ITEM, new Identifier(main.MOD_NAME, "gilded_netherite_pickaxe"), GILDED_NETHERITE_PICKAXE);

        //Armor
        Registry.register(Registry.ITEM, new Identifier(main.MOD_NAME, "gilded_netherite_helmet"), GILDED_NETHERITE_HELMET);

    }

    public static void init() {
        ItemInit.registerItems();
    }
}
