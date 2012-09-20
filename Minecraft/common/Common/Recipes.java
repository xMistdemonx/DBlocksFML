package DBlocks.Common;

import DBlocks.Blocks.DBlocksReg;
import DBlocks.Items.DBlocksItemReg;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
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
	
	GameRegistry.addRecipe(new ItemStack(DBlocksReg.DarkStoneBrick, 4), new Object[]
            {
                "XX","XX", 'X', DBlocksReg.DarkStone
                });


GameRegistry.addRecipe(new ItemStack(DBlocksReg.LightStoneBrick, 4), new Object[]
            {
                "XX","XX", 'X', DBlocksReg.LightStone
                });


GameRegistry.addRecipe(new ItemStack(DBlocksReg.AzurBlock, 1), new Object[]
            {
                "XXX","XYX","XXX", 'X', DBlocksItemReg.AzurDust, 'Y', Item.blazePowder
                });



    GameRegistry.addRecipe(new ItemStack(DBlocksReg.AzurLamp, 1), new Object[]
            {
                "ZXZ","XYX","ZXZ", 'X', DBlocksItemReg.LampFrame, 'Y', DBlocksReg.AzurBlock, 'Z', Item.redstone
            });




    GameRegistry.addRecipe(new ItemStack(DBlocksReg.CitrineLamp, 1), new Object[]
            {
                "ZXZ","XYX","ZXZ", 'X', DBlocksItemReg.LampFrame, 'Y', DBlocksReg.CitrineBlock, 'Z', Item.redstone
            });


GameRegistry.addRecipe(new ItemStack(DBlocksReg.CitrineBlock, 1), new Object[]
            {
                "XXX","XYX","XXX", 'X', DBlocksItemReg.CitrineDust, 'Y', Item.blazePowder
                });


GameRegistry.addRecipe(new ItemStack(DBlocksReg.AmethystBlock, 1), new Object[]
            {
                "XXX","XYX","XXX", 'X', DBlocksItemReg.AmethystDust, 'Y', Item.blazePowder
                });




    GameRegistry.addRecipe(new ItemStack(DBlocksReg.AmethystLamp, 1), new Object[]
            {
                "ZXZ","XYX","ZXZ", 'X', DBlocksItemReg.LampFrame, 'Y', DBlocksReg.AmethystBlock, 'Z', Item.redstone
            });





//Recipes Items---------------------------------------------------------------

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

//GameRegistry.addRecipe(new ItemStack(DBlocksReg.LightStoneSlab, 6), new Object[]
//            {
//                "XXX", 'X', DBlocksReg.LightStone
//                });

GameRegistry.addRecipe(new ItemStack(DBlocksReg.DarkStoneSlab, 6), new Object[]
            {
                "XXX", 'X', DBlocksReg.DarkStone
                });







//Smelting Recipes, IF Block do .BlockID ELSE ITEM do .ShiftedIndex
//ModLoader.addSmelting(DBlocksReg.DarkCobbleStone.blockID, new ItemStack(DBlocksReg.DarkStone));
//ModLoader.addSmelting(DBlocksReg.LightCobbleStone.blockID, new ItemStack(DBlocksReg.LightStone));
//ModLoader.addSmelting(DBlocksReg.NetherIron.blockID, new ItemStack(Item.ingotIron));
}


}

