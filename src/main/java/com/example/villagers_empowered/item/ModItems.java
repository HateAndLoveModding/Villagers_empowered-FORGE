package com.example.villagers_empowered.item;

import com.example.villagers_empowered.villagers_empowered;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, villagers_empowered.MOD_ID);

    public static final RegistryObject<Item> BASE_SPAWN_EGG = ITEMS.register("base_spawn_egg",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHARGED_CREEPER_SPAWN_EGG = ITEMS.register("charged_creeper_spawn_egg",
            () -> new ChargedCreeperSpawnEgg(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
