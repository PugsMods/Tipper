package com.pugzarecute.tipper.mixin;

import net.minecraft.world.item.enchantment.DamageEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DamageEnchantment.class)
public class SharpnessMixin {
    /**
     * @author PugzAreCute
     * @reason Disable sharpness levels 3+
     */
    @Overwrite
    public int getMaxLevel() {
        return 2;
    }

}
