package com.pugzarecute.tipper;

import com.pugzarecute.tipper.events.ArmorEventSubscriver;
import com.pugzarecute.tipper.events.VillagerTradeEventSubscriber;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
@Mod("tipper")
public class Tipper {
    //UUID LIST
    // 3f1109ab-edcd-4a86-aed6-a0a3a587bd8a - Armor slowdown
    public Tipper(){
        MinecraftForge.EVENT_BUS.register(new VillagerTradeEventSubscriber());
        MinecraftForge.EVENT_BUS.register(new ArmorEventSubscriver());
    }
    //Love mixins
}
