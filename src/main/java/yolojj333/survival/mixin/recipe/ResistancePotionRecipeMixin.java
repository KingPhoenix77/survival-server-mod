package yolojj333.survival.mixin.recipe;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ResistancePotionItemMixin.class)
public abstract class ResistancePotionItemMixin {

    private final CraftingRecipeInput craftingRecipeInput = new CraftingRecipeInput();

    public ResistancePotionItemMixin() {
        craftingRecipeInput.addItem(Items.AWKWARD_POTION);
        craftingRecipeInput.addItem(Items.ENCHANTED_GOLDEN_APPLE);
    }
}