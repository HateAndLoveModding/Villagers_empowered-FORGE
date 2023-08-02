package com.example.villagers_empowered.item;

import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ChargedCreeperSpawnEgg extends Item {
    public ChargedCreeperSpawnEgg(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if (level.isClientSide) {
            return InteractionResultHolder.pass(player.getItemInHand(interactionHand));
        }
        Creeper creeperEntity = new Creeper(EntityType.CREEPER, level);
        if (player.getDirection().equals(Direction.EAST)) {
            creeperEntity.setPos(player.getX() + 8, player.getY(), player.getZ());
        } else if (player.getDirection().equals(Direction.WEST)) {
            creeperEntity.setPos(player.getX() - 8, player.getY(), player.getZ());
        } else if (player.getDirection().equals(Direction.SOUTH)) {
            creeperEntity.setPos(player.getX(), player.getY(), player.getZ() + 8);
        } else if (player.getDirection().equals(Direction.NORTH)) {
            creeperEntity.setPos(player.getX(), player.getY(), player.getZ() - 8);
        }
        level.addFreshEntity(creeperEntity);

        LightningBolt lightningBolt = new LightningBolt(EntityType.LIGHTNING_BOLT, level);
        if (player.getDirection().equals(Direction.EAST)) {
            lightningBolt.setPos(player.getX() + 8, player.getY(), player.getZ());
        } else if (player.getDirection().equals(Direction.WEST)) {
            lightningBolt.setPos(player.getX() - 8, player.getY(), player.getZ());
        } else if (player.getDirection().equals(Direction.SOUTH)) {
            lightningBolt.setPos(player.getX(), player.getY(), player.getZ() + 8);
        } else if (player.getDirection().equals(Direction.NORTH)) {
            lightningBolt.setPos(player.getX(), player.getY(), player.getZ() - 8);
        }
        level.addFreshEntity(lightningBolt);
        ItemStack heldStack = player.getItemInHand(interactionHand);
        heldStack.shrink(1);

        return InteractionResultHolder.success(heldStack);
    }
}

