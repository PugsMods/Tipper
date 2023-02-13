package com.pugzarecute.tipper;

import com.pugzarecute.tipper.events.ArmorEventSubscriber;
import com.pugzarecute.tipper.events.FirstJoinMessage;
import com.pugzarecute.tipper.events.SkilletDebuffer;
import com.pugzarecute.tipper.events.VillagerTradeEventSubscriber;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("tipper")
public class Tipper {
    //UUID LIST
    // 3f1109ab-edcd-4a86-aed6-a0a3a587bd8a - Armor slowdown
    // 4ff94819-b823-4b72-8f0e-e36e11af9eb3 - Skillet debuf
    // RANDOMUUID - Message on first join
    public Tipper(){
        MinecraftForge.EVENT_BUS.register(new VillagerTradeEventSubscriber());
        MinecraftForge.EVENT_BUS.register(new ArmorEventSubscriber());
        MinecraftForge.EVENT_BUS.register(new FirstJoinMessage());
        MinecraftForge.EVENT_BUS.register(new SkilletDebuffer());
    }
}
