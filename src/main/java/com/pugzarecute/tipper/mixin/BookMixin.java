package com.pugzarecute.tipper.mixin;

import net.minecraft.world.item.BookItem;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BookItem.class)
public class BookMixin {
    /**
     * @author PugzAreCute
     * @reason Disable book enchanting
     */
    @Overwrite
    public boolean isEnchantable(ItemStack p_40646_) {
        return false;
    }
}
