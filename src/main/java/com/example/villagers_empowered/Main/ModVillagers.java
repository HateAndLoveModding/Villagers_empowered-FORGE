package com.example.villagers_empowered.Main;

import com.example.villagers_empowered.villagers_empowered;
import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, villagers_empowered.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, villagers_empowered.MOD_ID);

    public static final RegistryObject<PoiType> FLASONIC_POI = POI_TYPES.register("flasonic_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.FLASONIC_TABLE.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> FLASONIC = VILLAGER_PROFESSIONS.register("flasonic",
            () -> new VillagerProfession("flasonic", x -> x.get() == FLASONIC_POI.get(),
                    x -> x.get() == FLASONIC_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));
    public static final RegistryObject<PoiType> LIFARMIAN_POI = POI_TYPES.register("lifarmian_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.LIFARMIAN_TABLE.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> LIFARMIAN = VILLAGER_PROFESSIONS.register("lifarmian",
            () -> new VillagerProfession("lifarmian", x -> x.get() == LIFARMIAN_POI.get(),
                    x -> x.get() == LIFARMIAN_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));
    public static final RegistryObject<PoiType> CREATURE_CARRIER_POI = POI_TYPES.register("creature_carrier_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.CREATURE_CARRIER_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> CREATURE_CARRIER = VILLAGER_PROFESSIONS.register("creature_carrier",
            () -> new VillagerProfession("creature_carrier", x -> x.get() == CREATURE_CARRIER_POI.get(),
                    x -> x.get() == CREATURE_CARRIER_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));
    public static final RegistryObject<PoiType> PACKED_LIBRARIAN_POI = POI_TYPES.register("packed_librarian_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.PACKED_BOOKSHELF.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> PACKED_LIBRARIAN = VILLAGER_PROFESSIONS.register("packed_librarian",
            () -> new VillagerProfession("packed_librarian", x -> x.get() == PACKED_LIBRARIAN_POI.get(),
                    x -> x.get() == PACKED_LIBRARIAN_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
