package com.pugzarecute.tipper.trade_provider;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class VillagerEnchantedArmorTradeProvider implements VillagerTrades.ItemListing {
    @Nullable
    @Override
    public MerchantOffer getOffer(Entity p_35706_, Random p_35707_) {
        Map<Integer, Item> allocatableItemsMap = new HashMap<>();
        allocatableItemsMap.put(0,Items.DIAMOND_BOOTS);
        allocatableItemsMap.put(1,Items.DIAMOND_LEGGINGS);
        allocatableItemsMap.put(2,Items.DIAMOND_CHESTPLATE);
        allocatableItemsMap.put(3,Items.DIAMOND_HELMET);
        return new MerchantOffer(new ItemStack(Items.EMERALD, ThreadLocalRandom.current().nextInt(1,21)),new ItemStack(allocatableItemsMap.get(ThreadLocalRandom.current().nextInt(0,allocatableItemsMap.size()+1)),1),12,5,0.2F);
    }
}
