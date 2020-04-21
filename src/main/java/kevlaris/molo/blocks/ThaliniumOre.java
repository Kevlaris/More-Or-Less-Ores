package kevlaris.molo.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ThaliniumOre extends BlockBase 
{

	public ThaliniumOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(4.0f);
		setResistance(7.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);
	}

}
