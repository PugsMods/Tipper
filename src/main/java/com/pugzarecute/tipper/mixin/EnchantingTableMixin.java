package com.pugzarecute.tipper.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EnchantmentTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nullable;
import java.util.UUID;

@Mixin(EnchantmentTableBlock.class)
public class EnchantingTableMixin {
    /**
     * @author PugzAreCute
     * @reason Disable the enchanting table.
     */
    @Overwrite
    @Nullable
    public MenuProvider getMenuProvider(BlockState bs, Level lvl, BlockPos bpos) {
        return null;
    }
    /**
     * @author PugzAreCute
     * @reason Send a message to the player
     */
    @Overwrite
    public InteractionResult use(BlockState bs, Level lvl, BlockPos bpos, Player plyr, InteractionHand hand, BlockHitResult res) {
        if (lvl.isClientSide) {
            plyr.playSound(SoundEvents.ENDER_EYE_DEATH,1.0F,1.0F);
            plyr.sendMessage(new TextComponent("Enchanting tables are disabled in this pack. Get books in a dungeon."), UUID.randomUUID());
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.SUCCESS;
    }

}
