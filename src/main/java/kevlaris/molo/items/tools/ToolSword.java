package kevlaris.molo.items.tools;

import kevlaris.molo.init.ModItems;
import kevlaris.molo.utils.IHasModel;
import kevlaris.molo.Main;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
	
	public ToolSword(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.molotab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
