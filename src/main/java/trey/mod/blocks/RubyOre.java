package trey.mod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyOre extends BlockBase 
{

	public RubyOre(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0f);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
