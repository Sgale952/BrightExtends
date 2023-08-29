package net.sgale.brightextends.potion;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sgale.brightextends.BrightExtends;

import static net.minecraft.world.effect.MobEffects.DIG_SPEED;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, BrightExtends.MODID);

    public static final RegistryObject<Potion> HASTE_POTION =POTIONS.register("haste_potion",
            () -> new Potion(new MobEffectInstance(DIG_SPEED, 9600, 3)));

    public static void register (IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
