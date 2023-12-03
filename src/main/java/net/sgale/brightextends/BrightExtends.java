package net.sgale.brightextends;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sgale.brightextends.item.ModCreativeTab;
import net.sgale.brightextends.item.ModItems;
import net.sgale.brightextends.potion.ModPotions;

@Mod(net.sgale.brightextends.BrightExtends.MODID)
public class BrightExtends {

    public static final String MODID = "brightextends";

    public BrightExtends() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeTab.register(modEventBus);
        ModItems.register(modEventBus);
        ModPotions.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
