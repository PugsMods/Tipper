package com.pugzarecute.tipper.events;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ArmorEventSubscriber {
    static AttributeModifier lvl1 = new AttributeModifier("3f1109ab-edcd-4a86-aed6-a0a3a587bd8a", -0.15F, AttributeModifier.Operation.MULTIPLY_TOTAL);
    static AttributeModifier lvl2 = new AttributeModifier("3f1109ab-edcd-4a86-aed6-a0a3a587bd8a", -0.3F, AttributeModifier.Operation.MULTIPLY_TOTAL);

    @SubscribeEvent
    public void onChangeEquipment(LivingEquipmentChangeEvent event) {
        double armorLevelCorrect = 0;
        for (ItemStack armorItem : event.getEntity().getArmorSlots()) {
            for (AttributeModifier ma : armorItem.getAttributeModifiers(EquipmentSlot.HEAD).get(Attributes.ARMOR)) {
                armorLevelCorrect += ma.getAmount();
            }
            for (AttributeModifier ma : armorItem.getAttributeModifiers(EquipmentSlot.CHEST).get(Attributes.ARMOR)) {
                armorLevelCorrect += ma.getAmount();
            }
            for (AttributeModifier ma : armorItem.getAttributeModifiers(EquipmentSlot.LEGS).get(Attributes.ARMOR)) {
                armorLevelCorrect += ma.getAmount();
            }
            for (AttributeModifier ma : armorItem.getAttributeModifiers(EquipmentSlot.FEET).get(Attributes.ARMOR)) {
                armorLevelCorrect += ma.getAmount();
            }
        }

        if (armorLevelCorrect >= 12 && armorLevelCorrect <= 17) {
            event.getEntityLiving().getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(lvl1);
            event.getEntityLiving().getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(lvl2);
            event.getEntityLiving().getAttribute(Attributes.MOVEMENT_SPEED).addPermanentModifier(lvl1);
        } else if (armorLevelCorrect >= 18 && armorLevelCorrect <= 20) {
            event.getEntityLiving().getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(lvl1);
            event.getEntityLiving().getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(lvl2);
            event.getEntityLiving().getAttribute(Attributes.MOVEMENT_SPEED).addPermanentModifier(lvl2);
        } else {
            event.getEntityLiving().getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(lvl1);
            event.getEntityLiving().getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(lvl2);
        }
    }
}
