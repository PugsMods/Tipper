package com.pugzarecute.tipper.events;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TextComponent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.UUID;

public class FirstJoinMessage {

    final String NBT_TAG = "tipper.joinedBefore";

    @SubscribeEvent
    public void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {
        CompoundTag playerData = event.getPlayer().getPersistentData();
        if (playerData.get(NBT_TAG) != null) return;
        event.getPlayer().sendMessage(new TextComponent("The power of the enchanting table has been lost to time. Seek out the relics from the depths of dungeons."), UUID.randomUUID());
        playerData.putBoolean(NBT_TAG, true);
    }
}
