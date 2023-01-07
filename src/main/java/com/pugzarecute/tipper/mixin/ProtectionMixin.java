package com.pugzarecute.tipper.mixin;

import net.minecraft.world.item.enchantment.ProtectionEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ProtectionEnchantment.class)
public class ProtectionMixin {
    /**
     * @author PugzAreCute
     * @reason Disable protection levels 3+
     */
    @Overwrite
    public int getMaxLevel() {
        return 2;
    }

}
