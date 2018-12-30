package trey.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import trey.mod.blocks.BlockBase;
import trey.mod.blocks.RubyBlock;
import trey.mod.blocks.RubyOre;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block SAPPHIRE_BLOCK = new RubyBlock("sapphire_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.IRON);
	
}
