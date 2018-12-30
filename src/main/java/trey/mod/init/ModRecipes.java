package trey.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 2), 0.4f);
		GameRegistry.addSmelting(ModItems.RUBY,  new ItemStack(Items.REDSTONE, 8), 0.2f);
	}
	
}
