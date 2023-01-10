package com.pugzarecute.tipper.events;

import com.pugzarecute.tipper.VillagerBookTradeProvider;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class VillagerTradeEventSubscriber {
    @SubscribeEvent
    public void pickupItem(VillagerTradesEvent event) {
        //int villagerXp = 0;
        event.getTrades().forEach((_level, listings) ->
        {
            for (VillagerTrades.ItemListing m:
                 listings) {


                if( m instanceof VillagerTrades.EnchantBookForEmeralds){
                    int x =listings.indexOf(m);
                    listings.remove(x);

                    listings.add(x, new VillagerBookTradeProvider());
                }
            }
        });
    }
}
