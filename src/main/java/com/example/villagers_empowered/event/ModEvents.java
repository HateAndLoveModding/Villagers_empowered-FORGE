package com.example.villagers_empowered.event;

import com.example.villagers_empowered.item.ModItems;
import com.example.villagers_empowered.villager.ModVillagers;
import com.example.villagers_empowered.villagers_empowered;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = villagers_empowered.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == ModVillagers.PACKED_LIBRARIAN.get()) {
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, 4)), 2, 25, 0.25f));
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.BLAST_PROTECTION, 4)), 2, 25, 0.25f));
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.PROJECTILE_PROTECTION, 4)), 2, 25, 0.25f));
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.FIRE_PROTECTION, 4)), 2, 25, 0.25f));

            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.THORNS, 3)), 2, 25, 0.25f));
            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.RESPIRATION, 3)), 2, 25, 0.25f));
            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.FALL_PROTECTION, 4)), 2, 25, 0.25f));
            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.FROST_WALKER, 2)), 2, 25, 0.25f));

            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.POWER_ARROWS, 5)), 2, 25, 0.25f));
            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SHARPNESS, 5)), 2, 25, 0.25f));
            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SWEEPING_EDGE, 3)), 2, 25, 0.25f));
            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.MOB_LOOTING, 3)), 2, 25, 0.25f));

            event.getTrades().get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.MENDING, 1)), 2, 25, 0.25f));
            event.getTrades().get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.UNBREAKING, 3)), 2, 25, 0.25f));

            event.getTrades().get(5).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.BLOCK_EFFICIENCY, 5)), 2, 25, 0.25f));
            event.getTrades().get(5).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.SILK_TOUCH, 1)), 2, 25, 0.25f));
            event.getTrades().get(5).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 4), EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.BLOCK_FORTUNE, 3)), 2, 25, 0.25f));
        }



        if(event.getType() == ModVillagers.LIFARMIAN.get()) {
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.STICK, 1), new ItemStack(Items.EMERALD, 1), 25,1,0.01F));
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.PAPER, 1), new ItemStack(Items.EMERALD, 1), 25,1,0.01F));

            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.REDSTONE, 2), 12, 4, 0.04f));
            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.LAPIS_LAZULI, 1), 12, 4, 0.04f));

            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.GOLDEN_CARROT, 3), 12, 7, 0.07f));
            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.ENDER_PEARL, 1), 12, 7, 0.07f));

            event.getTrades().get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), 12, 9, 0.09f));
            event.getTrades().get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.ARROW, 16), 12, 9, 0.09f));

            event.getTrades().get(5).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.QUARTZ_BLOCK, 1), 12, 10, 0.1f));
            event.getTrades().get(5).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.GLASS, 4), 12, 10, 0.1f));
        }



        if(event.getType() == ModVillagers.FLASONIC.get()) {
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.WHEAT, 1), new ItemStack(Items.WHEAT_SEEDS, 2), new ItemStack(Items.EMERALD, 1), 25,1,0.01F));
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.BEETROOT, 1), new ItemStack(Items.BEETROOT_SEEDS, 2), new ItemStack(Items.EMERALD, 1), 25,1,0.01F));
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.CARROT, 2), new ItemStack(Items.EMERALD, 1), 25, 1, 0.01f));
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.POTATO, 2), new ItemStack(Items.EMERALD, 1), 25, 1, 0.01f));

            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.ROTTEN_FLESH, 1), new ItemStack(Items.EMERALD, 1), 25, 2, 0.02f));
            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.GUNPOWDER, 1), new ItemStack(Items.EMERALD, 1), 25, 2, 0.02f));
            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.BONE, 1), new ItemStack(Items.EMERALD, 1), 25, 2, 0.02f));
            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.STRING, 1), new ItemStack(Items.EMERALD, 1), 25, 2, 0.02f));

            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.IRON_INGOT, 1), new ItemStack(Items.EMERALD, 1), 25, 3, 0.03f));
            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.GOLD_INGOT, 1), new ItemStack(Items.EMERALD, 1), 25, 3, 0.03f));

            event.getTrades().get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.PUMPKIN, 1), new ItemStack(Items.EMERALD, 1), 25, 4, 0.04f));
            event.getTrades().get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.MELON, 1), new ItemStack(Items.EMERALD, 1), 25, 4, 0.04f));

            event.getTrades().get(5).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.BOOK, 1), new ItemStack(Items.EMERALD, 1), 24, 5, 0.05f));
            event.getTrades().get(5).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.BOOKSHELF, 1), 8, 5, 0.05f));
        }



        if(event.getType() == ModVillagers.CREATURE_CARRIER.get()) {
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.COW_SPAWN_EGG, 1), 5, 2, 0.02f));
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.SHEEP_SPAWN_EGG, 1), 5, 2, 0.02f));
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.PIG_SPAWN_EGG, 1), 5, 2, 0.02f));
            event.getTrades().get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.CHICKEN_SPAWN_EGG, 1), 5, 2, 0.02f));

            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.CREEPER_SPAWN_EGG, 1), 5, 6, 0.06f));
            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.SPIDER_SPAWN_EGG, 1), 5, 6, 0.06f));
            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.ZOMBIE_SPAWN_EGG, 1), 5, 6, 0.06f));
            event.getTrades().get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.SKELETON_SPAWN_EGG, 1), 5, 6, 0.06f));

            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.HORSE_SPAWN_EGG, 1), 5, 8, 0.08f));
            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.AXOLOTL_SPAWN_EGG, 1), 5, 8, 0.08f));
            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.FROG_SPAWN_EGG, 1), 5, 8, 0.08f));
            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.MOOSHROOM_SPAWN_EGG, 1), 5, 8, 0.08f));
            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.PANDA_SPAWN_EGG, 1), 5, 8, 0.08f));

            event.getTrades().get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(ModItems.CHARGED_CREEPER_SPAWN_EGG.get(), 1), 5, 10, 0.1f));
            event.getTrades().get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.SLIME_SPAWN_EGG, 1), 5, 10, 0.1f));
            event.getTrades().get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.BLAZE_SPAWN_EGG, 1), 5, 10, 0.1f));
            event.getTrades().get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.SHULKER_SPAWN_EGG, 1), 5, 10, 0.1f));
            event.getTrades().get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.ENDERMITE_SPAWN_EGG, 1), 5, 10, 0.1f));

            event.getTrades().get(5).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.WITHER_SKELETON_SPAWN_EGG, 1), 5, 15, 0.15f));
            event.getTrades().get(5).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), new ItemStack(ModItems.BASE_SPAWN_EGG.get(), 1), new ItemStack(Items.VILLAGER_SPAWN_EGG, 1), 5, 15, 0.15f));
        }

    }
}
