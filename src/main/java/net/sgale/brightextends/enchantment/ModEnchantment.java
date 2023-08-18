package net.sgale.brightextends.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sgale.brightextends.BrightExtends;

public class ModEnchantment {
    public static final DeferredRegister<Enchantment> ENCHANT =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BrightExtends.MODID);
    public static RegistryObject<Enchantment> POWER_OF_THE_ANCIENT =
            ENCHANT.register("power_of_the_ancient", () ->
                    new Power_of_the_Ancients(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.DIGGER, EquipmentSlot.MAINHAND));
    public static void register(IEventBus eventBus){
        ENCHANT.register(eventBus);
    }
}
