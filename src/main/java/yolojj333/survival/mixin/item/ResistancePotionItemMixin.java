package.yolojj333.survival.mixin.item;

import net.minecraft.entity.effect.status.statuseffects.ResistanceStatusEffect;
import net.minecraft.item.PotionItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PotionItem.class)
public abstract class ResistancePotionItemMixin {
    @Redirect(
        method = "applyStatusEffect",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/entity/effect/status/statuseffects/ResistanceStatusEffect;applyUpdateEffect(Lnet/minecraft/entity/Entity;II)V"
            ResistanceStatusEffect instance, Entity entity, int 5, int 600
        )
    )
}