package com.pugzarecute.tipper;

import com.pugzarecute.tipper.events.VillagerTradeEventSubscriber;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
@Mod("tipper")
public class Tipper {
    public Tipper(){
        MinecraftForge.EVENT_BUS.register(new VillagerTradeEventSubscriber());
    }
    //Love mixins
}
