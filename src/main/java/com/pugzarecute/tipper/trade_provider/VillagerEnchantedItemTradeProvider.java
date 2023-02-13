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

public class VillagerEnchantedItemTradeProvider implements VillagerTrades.ItemListing {
    @Nullable
    @Override
    public MerchantOffer getOffer(Entity entity, Random random) {
        Map<Integer, Item> allocatableItemsMap = new HashMap<>();
        allocatableItemsMap.put(0,Items.IRON_AXE);
        allocatableItemsMap.put(1,Items.IRON_PICKAXE);
        allocatableItemsMap.put(2,Items.IRON_SHOVEL);
        allocatableItemsMap.put(3,Items.IRON_HOE);
        allocatableItemsMap.put(4,Items.GOLDEN_AXE);
        allocatableItemsMap.put(5,Items.GOLDEN_PICKAXE);
        allocatableItemsMap.put(6,Items.GOLDEN_SHOVEL);
        allocatableItemsMap.put(7,Items.GOLDEN_HOE);
        allocatableItemsMap.put(8,Items.DIAMOND_AXE);
        allocatableItemsMap.put(9,Items.DIAMOND_PICKAXE);
        allocatableItemsMap.put(10,Items.DIAMOND_SHOVEL);
        allocatableItemsMap.put(11,Items.DIAMOND_HOE);
        allocatableItemsMap.put(12,Items.NETHERITE_HOE);
        return new MerchantOffer(new ItemStack(Items.EMERALD, ThreadLocalRandom.current().nextInt(1,21)),new ItemStack(allocatableItemsMap.get(ThreadLocalRandom.current().nextInt(0,allocatableItemsMap.size()+1)),1),12,5,0.2F);
    }
}
