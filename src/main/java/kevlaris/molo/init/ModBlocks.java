package kevlaris.molo.init;

import java.util.ArrayList;
import java.util.List;

import kevlaris.molo.blocks.ThaliniumBlock;
import kevlaris.molo.blocks.ThaliniumOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block THALINIUM_BLOCK = new ThaliniumBlock("thalinium_block", Material.IRON);
	public static final Block THALINIUM_ORE = new ThaliniumOre("thalinium_ore", Material.ROCK);
}
