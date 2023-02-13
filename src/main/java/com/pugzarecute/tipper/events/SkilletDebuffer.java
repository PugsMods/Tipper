package com.pugzarecute.tipper.events;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class SkilletDebuffer {

    AttributeModifier skilletDebuf = new AttributeModifier("4ff94819-b823-4b72-8f0e-e36e11af9eb3",-0.7f, AttributeModifier.Operation.MULTIPLY_TOTAL);
    @SubscribeEvent
    public void onChangeHand(LivingEquipmentChangeEvent event) {
        event.getEntityLiving().getAttribute(Attributes.ATTACK_DAMAGE).removeModifier(skilletDebuf);
        if(event.getEntityLiving().getMainHandItem().getDescriptionId().equals("block.farmersdelight.skillet")){
            event.getEntityLiving().getAttribute(Attributes.ATTACK_DAMAGE).addPermanentModifier(skilletDebuf);
        }
    }
}
