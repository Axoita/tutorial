package trey.mod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import trey.mod.Main;
import trey.mod.init.ModItems;
import trey.mod.util.IHasModel;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
