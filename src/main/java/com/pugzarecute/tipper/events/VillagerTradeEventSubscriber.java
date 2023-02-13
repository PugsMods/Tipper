package com.pugzarecute.tipper.events;

import com.pugzarecute.tipper.trade_provider.VillagerBookTradeProvider;
import com.pugzarecute.tipper.trade_provider.VillagerEnchantedArmorTradeProvider;
import com.pugzarecute.tipper.trade_provider.VillagerEnchantedItemTradeProvider;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class VillagerTradeEventSubscriber {
    @SubscribeEvent
    public void onVillagerTradesCreate(VillagerTradesEvent event) {
        event.getTrades().forEach((_level, listings) ->
        {
            for (VillagerTrades.ItemListing m:
                 listings) {
                if( m instanceof VillagerTrades.EnchantBookForEmeralds){
                    int x =listings.indexOf(m);
                    listings.remove(x);

                    listings.add(x, new VillagerBookTradeProvider());
                }
                if( m instanceof VillagerTrades.EnchantedItemForEmeralds){
                    if(event.getType() == VillagerProfession.ARMORER){
                        int j =listings.indexOf(m);
                        listings.remove(j);
                        listings.add(j, new VillagerEnchantedArmorTradeProvider());
                    }
                    if(event.getType() == VillagerProfession.TOOLSMITH){
                        int j =listings.indexOf(m);
                        listings.remove(j);
                        listings.add(j, new VillagerEnchantedItemTradeProvider());
                    }
                }
            }
        });
    }
}
