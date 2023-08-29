package net.sgale.brightextends.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

import static net.minecraft.world.item.Items.NETHERITE_PICKAXE;
import static net.minecraft.world.level.block.Blocks.BEDROCK;
import static net.sgale.brightextends.item.ModItems.ANCIENT_PICKAXE;

@Mixin(BlockBehaviour.class)
public class DestroyProgressMixin {
    @Shadow @Final protected BlockBehaviour.Properties properties;

    @Inject(method = "getDestroyProgress", at = @At("HEAD"), cancellable = true)
    public void onDestroyProgress(BlockState blockState, Player player, BlockGetter blockGetter, BlockPos blockPos, CallbackInfoReturnable<Float> cir) {
        if(blockState.getBlock() == BEDROCK && player.isHolding(ANCIENT_PICKAXE.get())){
            cir.setReturnValue(player.getDigSpeed(blockState, blockPos) / 210);
        }

/*        @Inject(method = "getDestroyProgress", at = @At("HEAD"), cancellable = true)
        public void onDestroyProgress(BlockState blockState, Player player, BlockGetter blockGetter, BlockPos blockPos, CallbackInfoReturnable<Float> cir) {
            Map<Enchantment, Integer> a = NETHERITE_PICKAXE.getAllEnchantments(NETHERITE_PICKAXE.getDefaultInstance());
            if(blockState.getBlock() == BEDROCK && player.isHolding(NETHERITE_PICKAXE) && a.containsValue(BLOCK_EFFICIENCY)){
                cir.setReturnValue(player.getDigSpeed(blockState, blockPos) / 250);
            }*/
    }
}
