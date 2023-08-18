package net.sgale.brightextends.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;

public class Power_of_the_Ancients extends Enchantment {
    public Power_of_the_Ancients(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlot){
        super(pRarity, pCategory, pApplicableSlot);
    }

    public boolean checkCompatibility(Enchantment e) {
        return super.checkCompatibility(e) && e != Enchantments.BLOCK_FORTUNE && e != Enchantments.SILK_TOUCH;
    }
}
