package net.therjabee.moremekanized.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.therjabee.moremekanized.MoreMekanized;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreMekanized.MOD_ID);

    public static final RegistryObject<Item> ALLOY_CREATIVE = ITEMS.register("alloy_creative",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CREATIVE_CONTROL_CIRCUIT = ITEMS.register("creative_control_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALLOY_HELIOSIUM = ITEMS.register("alloy_heliosium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HELIOSIUM_CONTROL_CIRCUIT = ITEMS.register("heliosium_control_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALLOY_UMBRITECH = ITEMS.register("alloy_umbritech",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UMBRITECH_CONTROL_CIRCUIT = ITEMS.register("umbritech_control_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALLOY_GRAPHITECH = ITEMS.register("alloy_graphitech",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRAPHITECH_CONTROL_CIRCUIT = ITEMS.register("graphitech_control_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALLOY_SOLARIUM = ITEMS.register("alloy_solarium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SOLARIUM_CONTROL_CIRCUIT = ITEMS.register("solarium_control_circuit",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
