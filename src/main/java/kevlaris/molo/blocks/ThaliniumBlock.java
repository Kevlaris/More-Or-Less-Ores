package kevlaris.molo.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ThaliniumBlock extends BlockBase 
{

	public ThaliniumBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(6.0f);
		setResistance(27.0f);
		setHarvestLevel("pickaxe", 2);
	}

}
