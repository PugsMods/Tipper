package com.pugzarecute.tipper.mixin;

import net.minecraft.world.item.enchantment.MendingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MendingEnchantment.class)
public class MendingMixin {
    /**
     * @author PugzAreCute
     * @reason Disable mending
     */
    @Overwrite
    public int getMaxLevel() {
        return -1;
    }

}
