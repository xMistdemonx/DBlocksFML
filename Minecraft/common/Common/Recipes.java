package DBlocks.Common;

import DBlocks.Blocks.DBlocksReg;
import DBlocks.GemTools.GemToolsReg;
import DBlocks.Items.DBlocksItemReg;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;



public class Recipes 
{

	public static void Init()
	{

		//Brick----------------------------------------------------------------------------------------
		GameRegistry.addRecipe(new ItemStack(DBlocksReg.DarkStoneBrick, 4), new Object[]
				{
			"XX","XX", 'X', DBlocksReg.DarkStone
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksReg.LightStoneBrick, 4), new Object[]
				{
			"XX","XX", 'X', DBlocksReg.LightStone
				});





		//Lamp Crafting Blocks-------------------------------------------------------------------------------------------------
		GameRegistry.addRecipe(new ItemStack(DBlocksReg.AmethystBlock, 1), new Object[]
				{
			"XXX","XYX","XXX", 'X', DBlocksItemReg.AmethystDust, 'Y', Item.lightStoneDust
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksReg.AzurBlock, 1), new Object[]
				{
			"XXX","XYX","XXX", 'X', DBlocksItemReg.AzurDust, 'Y', Item.lightStoneDust
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksReg.CitrineBlock, 1), new Object[]
				{
			"XXX","XYX","XXX", 'X', DBlocksItemReg.CitrineDust, 'Y', Item.lightStoneDust
				});




		GameRegistry.addRecipe(new ItemStack(DBlocksReg.TopazBlock, 1), new Object[]
				{
			"XXX","XYX","XXX", 'X', DBlocksItemReg.TopazDust, 'Y', Item.lightStoneDust
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksReg.PeridotBlock, 1), new Object[]
				{
			"XXX","XYX","XXX", 'X', DBlocksItemReg.PeridotDust, 'Y', Item.lightStoneDust
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksReg.AquamarineBlock, 1), new Object[]
				{
			"XXX","XYX","XXX", 'X', DBlocksItemReg.AquamarineDust, 'Y', Item.lightStoneDust
				});


		//Lamps--------------------------------------------------------------------------------------------------------------
		GameRegistry.addRecipe(new ItemStack(DBlocksReg.AzurLamp, 1), new Object[]
				{
			"ZXZ","XYX","ZXZ", 'X', DBlocksItemReg.LampFrame, 'Y', DBlocksReg.AzurBlock, 'Z', Item.redstone
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksReg.CitrineLamp, 1), new Object[]
				{
			"ZXZ","XYX","ZXZ", 'X', DBlocksItemReg.LampFrame, 'Y', DBlocksReg.CitrineBlock, 'Z', Item.redstone
				});

		GameRegistry.addRecipe(new ItemStack(DBlocksReg.AmethystLamp, 1), new Object[]
				{
			"ZXZ","XYX","ZXZ", 'X', DBlocksItemReg.LampFrame, 'Y', DBlocksReg.AmethystBlock, 'Z', Item.redstone
				});    
		GameRegistry.addRecipe(new ItemStack(DBlocksReg.TopazLamp, 1), new Object[]
				{
			"ZXZ","XYX","ZXZ", 'X', DBlocksItemReg.LampFrame, 'Y', DBlocksReg.TopazBlock, 'Z', Item.redstone
				});

		GameRegistry.addRecipe(new ItemStack(DBlocksReg.PeridotLamp, 1), new Object[]
				{
			"ZXZ","XYX","ZXZ", 'X', DBlocksItemReg.LampFrame, 'Y', DBlocksReg.PeridotBlock, 'Z', Item.redstone
				});

		GameRegistry.addRecipe(new ItemStack(DBlocksReg.AquamarineLamp, 1), new Object[]
				{
			"ZXZ","XYX","ZXZ", 'X', DBlocksItemReg.LampFrame, 'Y', DBlocksReg.AquamarineBlock, 'Z', Item.redstone
				});






		//Items---------------------------------------------------------------
		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.Plank, 8), new Object[]
				{
			"X", 'X', Block.planks
				});

		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.WoodFrameStrip, 16), new Object[]
				{
			"X", 'X', DBlocksItemReg.Plank
				});

		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.WoodFrame, 1), new Object[]
				{
			"XXX","X X","XXX", 'X', DBlocksItemReg.WoodFrameStrip
				});

		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.LampFrame, 1), new Object[]
				{
			" X ","XYX"," X ", 'X', DBlocksItemReg.WoodFrame, 'Y', Block.glass
				});





		//Shards-------------------------------------------------------------------------------------
		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.AmethystShard, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.AmethystFragment
				});



		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.AzurShard, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.AzurFragment
				});



		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.CitrineShard, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.CitrineFragment
				});



		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.TopazShard, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.TopazFragment
				});



		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.PeridotShard, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.PeridotFragment
				});



		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.AquamarineShard, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.AquamarineFragment
				});




		//Gems-------------------------------------------------------------------------------------------    
		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.AmethystGem, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.AmethystShard
				});



		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.AzurGem, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.AzurShard
				});



		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.CitrineGem, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.CitrineShard
				});



		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.TopazGem, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.TopazShard
				});



		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.PeridotGem, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.PeridotShard
				});



		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.AquamarineGem, 1), new Object[]
				{
			"XX","XX", 'X', DBlocksItemReg.AquamarineShard
				});







		//Dark Stone Tools-------------------------------------------------------------------------

		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.DSP, 1), new Object[]
				{
			"XXX"," Y "," Y ", 'X', DBlocksReg.DarkCobbleStone, 'Y', Item.stick
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.DSA, 1), new Object[]
				{
			"XX ","XY "," Y ", 'X', DBlocksReg.DarkCobbleStone, 'Y', Item.stick
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.DSH, 1), new Object[]
				{
			"XX "," Y "," Y ", 'X', DBlocksReg.DarkCobbleStone, 'Y', Item.stick
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.DSS, 1), new Object[]
				{
			" X "," Y "," Y ", 'X', DBlocksReg.DarkCobbleStone, 'Y', Item.stick
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.DSSw, 1), new Object[]
				{
			" X "," X "," Y ", 'X', DBlocksReg.DarkCobbleStone, 'Y', Item.stick
				});





		//Light Stone Tools------------------------------------------------------------

		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.LSP, 1), new Object[]
				{
			"XXX"," Y "," Y ", 'X', DBlocksReg.LightCobbleStone, 'Y', Item.stick
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.LSA, 1), new Object[]
				{
			"XX ","XY "," Y ", 'X', DBlocksReg.LightCobbleStone, 'Y', Item.stick
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.LSH, 1), new Object[]
				{
			"XX "," Y "," Y ", 'X', DBlocksReg.LightCobbleStone, 'Y', Item.stick
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.LSS, 1), new Object[]
				{
			" X "," Y "," Y ", 'X', DBlocksReg.LightCobbleStone, 'Y', Item.stick
				});


		GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.LSSw, 1), new Object[]
				{
			" X "," X "," Y ", 'X', DBlocksReg.LightCobbleStone, 'Y', Item.stick
				});



		


		//Slabs----------------------------------------------------------------------

		GameRegistry.addRecipe(new ItemStack(DBlocksReg.LightStoneBrickSlab, 6), new Object[]
				{
			"XXX", 'X', DBlocksReg.LightStoneBrick
				});

		GameRegistry.addRecipe(new ItemStack(DBlocksReg.DarkStoneBrickSlab, 6), new Object[]
				{
			"XXX", 'X', DBlocksReg.DarkStoneBrick
				});

		GameRegistry.addRecipe(new ItemStack(DBlocksReg.LightCobbleStoneSlab, 6), new Object[]
				{
			"XXX", 'X', DBlocksReg.LightCobbleStone
				});

		GameRegistry.addRecipe(new ItemStack(DBlocksReg.DarkCobbleStoneSlab, 6), new Object[]
				{
			"XXX", 'X', DBlocksReg.DarkCobbleStone
				});

		GameRegistry.addRecipe(new ItemStack(DBlocksReg.LightStoneSlab, 6), new Object[]
				{
			"XXX", 'X', DBlocksReg.LightStone
				});

		GameRegistry.addRecipe(new ItemStack(DBlocksReg.DarkStoneSlab, 6), new Object[]
				{
			"XXX", 'X', DBlocksReg.DarkStone
				});


		/*
GameRegistry.addRecipe(new ItemStack(DBlocksItemReg.GemMeta, 1, 0), new Object[]
            {
                "XXX", "XXX", "XXX", 'X', DBlocksItemReg.AzurFragment
                });
	}*/

	}
}

