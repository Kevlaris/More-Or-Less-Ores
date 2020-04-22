package kevlaris.molo.tabs;

import kevlaris.molo.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MOLOTab extends CreativeTabs {

	public MOLOTab(String label) {
		super("molotab");
		this.setBackgroundImageName("molo.png");}
		public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(ModBlocks.THALINIUM_ORE));}

}