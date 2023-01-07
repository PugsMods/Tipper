package com.pugzarecute.tipper.mixin;

import net.minecraft.world.item.enchantment.ArrowDamageEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ArrowDamageEnchantment.class)
public class PowerMixin {
    /**
     * @author PugzAreCute
     * @reason Disable power levels 3+
     */
    @Overwrite
    public int getMaxLevel() {
        return 2;
    }

}
