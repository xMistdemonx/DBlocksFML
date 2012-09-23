package DBlocks.Common;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy{
	public static String ITEMS_PNG = "/DBlocks/items.png";
	public static String BLOCK_PNG = "/DBlocks/blocks.png";
	
	
	
	
	// Client stuff
	public void registerRenderers () 
	{
		// Nothing here as this is the server side proxy
  
	}
	
	//Client stuff
	public void initTiles() {
		
	}
}