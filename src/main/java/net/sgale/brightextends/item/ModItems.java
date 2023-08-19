package net.sgale.brightextends.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemFrameItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sgale.brightextends.BrightExtends;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BrightExtends.MODID);
    public static final RegistryObject<Item> ANCIENT_PICKAXE = ITEMS.register("ancient_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> ANCIENT_BOOK = ITEMS.register("ancient_book",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANCIENT_TEMPLATE = ITEMS.register("ancient_upgrade_smithing_template",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
