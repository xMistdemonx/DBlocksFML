package DBlocks.Common;

import cpw.mods.fml.common.registry.GameRegistry;
import DBlocks.Blocks.DBlocksReg;
import DBlocks.Items.DBlocksItemReg;
import net.minecraft.src.ItemStack;
import ic2.api.Ic2Recipes;
import ic2.api.Items;


public class RecipesIC2 
{

	public static void Init()
	{

	//Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksReg.TinOre), new ItemStack(Items.getItem("tinDust").getItem(), 2));
	//Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksReg.CopperOre), new ItemStack(Items.getItem("copperDust").getItem(), 2));	
	//Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksReg.SilverOre), new ItemStack(Items.getItem("silverDust").getItem(), 2));


	Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksReg.TinOre), new ItemStack(DBlocksItemReg.dustTin, 2));
	Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksReg.CopperOre), new ItemStack(DBlocksItemReg.dustCopper, 2));
	Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksReg.SilverOre), new ItemStack(DBlocksItemReg.dustSilver, 2));
	
	
	
	
	Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksItemReg.CitrineShard), new ItemStack(DBlocksItemReg.CitrineDust, 2));
	Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksItemReg.AmethystShard), new ItemStack(DBlocksItemReg.AmethystDust, 2));
	Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksItemReg.AzurShard), new ItemStack(DBlocksItemReg.AzurDust, 2));
	Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksItemReg.TopazShard), new ItemStack(DBlocksItemReg.TopazDust, 2));
	Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksItemReg.PeridotShard), new ItemStack(DBlocksItemReg.PeridotDust, 2));
	Ic2Recipes.addMaceratorRecipe(new ItemStack(DBlocksItemReg.AquamarineShard), new ItemStack(DBlocksItemReg.AquamarineDust, 2));
	

	GameRegistry.addSmelting(DBlocksIDS.DarkCobbleStone_BLOCK_ID, new ItemStack(DBlocksReg.DarkStone), 0);
	GameRegistry.addSmelting(DBlocksIDS.LightCobbleStone_BLOCK_ID, new ItemStack(DBlocksReg.LightStone), 0);
	

	GameRegistry.addSmelting(DBlocksItemReg.dustTin.shiftedIndex, new ItemStack(DBlocksItemReg.ingotTin), 0);
	GameRegistry.addSmelting(DBlocksItemReg.dustCopper.shiftedIndex, new ItemStack(DBlocksItemReg.ingotCopper), 0);
	GameRegistry.addSmelting(DBlocksItemReg.dustSilver.shiftedIndex, new ItemStack(DBlocksItemReg.ingotSilver), 0);
	
	
	GameRegistry.addSmelting(DBlocksIDS.TinOre_BLOCK_ID, new ItemStack(DBlocksItemReg.ingotTin), 0);
	GameRegistry.addSmelting(DBlocksIDS.CopperOre_BLOCK_ID, new ItemStack(DBlocksItemReg.ingotCopper), 0);
	GameRegistry.addSmelting(DBlocksIDS.SilverOre_BLOCK_ID, new ItemStack(DBlocksItemReg.ingotSilver), 0);

	}

}