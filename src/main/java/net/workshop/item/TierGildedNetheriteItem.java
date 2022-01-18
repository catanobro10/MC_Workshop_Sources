package net.workshop.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.workshop.init.ItemInit;

public class TierGildedNetheriteItem implements ToolMaterial {

    public static final TierGildedNetheriteItem INSTANCE = new TierGildedNetheriteItem();

    @Override
    public int getDurability() {
        return 2048;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10F;
    }

    @Override
    public float getAttackDamage() {
        return 4.5F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemInit.GILDED_NETHERITE_INGOT);
    }
}
