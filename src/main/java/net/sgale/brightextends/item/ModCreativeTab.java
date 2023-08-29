package net.sgale.brightextends.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sgale.brightextends.BrightExtends;
import net.sgale.brightextends.potion.ModPotions;

import java.awt.*;

import static net.minecraft.world.item.Items.NETHER_STAR;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BrightExtends.MODID);

    public static final RegistryObject<CreativeModeTab> BRIGHTEXTENDS_TAB = CREATIVE_MODE_TABS.register("brightextends_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(NETHER_STAR))
                    .title(Component.translatable("creativetab.brightextends.brightextends_tab"))
                    .displayItems((param, output) -> {
                        output.accept(ModItems.ANCIENT_PICKAXE.get());
                        output.accept(ModItems.ANCIENT_BOOK.get());
                        output.accept(ModItems.ANCIENT_TEMPLATE.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
