package kevlaris.molo.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.THALINIUM_ORE, new ItemStack(ModItems.THALINIUM_INGOT, 1), 2.5f);
	}
	
}
