package DBlocks.Common;

import DBlocks.Blocks.DBlocksReg;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{

	public static void Init()
	{
	
	GameRegistry.addRecipe(new ItemStack(DBlocksReg.LightStoneBrick, 4), new Object[]
	        {
        "XX","XX", 'X', DBlocksReg.LightStone
        });
	
	
	}
}
