package com.pugzarecute.tipper.trade_provider;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class VillagerBookTradeProvider implements VillagerTrades.ItemListing {
    @Nullable
    @Override
    public MerchantOffer getOffer(Entity entity, Random random) {
        return new MerchantOffer(new ItemStack(Items.EMERALD, ThreadLocalRandom.current().nextInt(1,11)),new ItemStack(Items.BOOK,1),new ItemStack(Items.WRITABLE_BOOK),12,5,0.2F);
    }
}
