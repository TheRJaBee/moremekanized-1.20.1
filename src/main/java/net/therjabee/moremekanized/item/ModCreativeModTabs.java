package net.therjabee.moremekanized.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.therjabee.moremekanized.MoreMekanized;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreMekanized.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOREMEKANIZED_TAB = CREATIVE_MODE_TABS.register("moremekanized_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALLOY_CREATIVE.get()))
                    .title(Component.translatable("creativetab.moremekanized_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ALLOY_SOLARIUM.get());
                        pOutput.accept(ModItems.SOLARIUM_CONTROL_CIRCUIT.get());
                        pOutput.accept(ModItems.ALLOY_HELIOSIUM.get());
                        pOutput.accept(ModItems.HELIOSIUM_CONTROL_CIRCUIT.get());
                        pOutput.accept(ModItems.ALLOY_GRAPHITECH.get());
                        pOutput.accept(ModItems.GRAPHITECH_CONTROL_CIRCUIT.get());
                        pOutput.accept(ModItems.ALLOY_UMBRITECH.get());
                        pOutput.accept(ModItems.UMBRITECH_CONTROL_CIRCUIT.get());
                        pOutput.accept(ModItems.ALLOY_CREATIVE.get());
                        pOutput.accept(ModItems.CREATIVE_CONTROL_CIRCUIT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
