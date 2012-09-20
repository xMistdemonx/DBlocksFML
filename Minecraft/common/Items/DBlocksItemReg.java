package DBlocks.Items;

import DBlocks.Common.DBlocksIDS;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.src.Item;

public class DBlocksItemReg {
	
	
	public static Item AmethystDust;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Init() {
		
		//Item Var Defin
		AmethystDust = new AmethystDust(DBlocksIDS.AmethystDust_ID);
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Language Registry
		LanguageRegistry.addName(AmethystDust, "Amethyst Dust");
	}
}
