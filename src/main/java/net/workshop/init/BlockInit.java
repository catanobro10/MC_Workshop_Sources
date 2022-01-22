package net.workshop.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.workshop.blocks.BlockGildedNetherite;
import net.workshop.main;

public class BlockInit {

    public static final BlockGildedNetherite GILDED_NETHERITE_BLOCK = new BlockGildedNetherite(FabricBlockSettings
            .of(Material.METAL)
            .strength(4.0F)
            .hardness(4.0F)
            .resistance(4.0F)
            .requiresTool());

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(main.MOD_NAME, "gilded_netherite_block"), GILDED_NETHERITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(main.MOD_NAME, "gilded_netherite_block"),
                new BlockItem(GILDED_NETHERITE_BLOCK, new FabricItemSettings()
                                .group(ItemGroup.BUILDING_BLOCKS)
                                .rarity(Rarity.RARE)
                                .fireproof()
                )
        );
    }

    public static void init() {
        BlockInit.registerBlocks();
    }
}
