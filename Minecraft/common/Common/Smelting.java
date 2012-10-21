package DBlocks.Common;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import DBlocks.Blocks.DBlocksReg;
import DBlocks.Items.DBlocksItemReg;
import cpw.mods.fml.common.registry.GameRegistry;

public class Smelting {

	public static void Init() {
		GameRegistry.addSmelting(DBlocksIDS.DarkCobbleStone_BLOCK_ID, new ItemStack(DBlocksReg.DarkStone), 0);
		GameRegistry.addSmelting(DBlocksIDS.LightCobbleStone_BLOCK_ID, new ItemStack(DBlocksReg.LightStone), 0);
		
		
		
		GameRegistry.addSmelting(DBlocksIDS.TinOre_BLOCK_ID, new ItemStack(DBlocksItemReg.ingotTin), 0);
		GameRegistry.addSmelting(DBlocksIDS.CopperOre_BLOCK_ID, new ItemStack(DBlocksItemReg.ingotCopper), 0);
		GameRegistry.addSmelting(DBlocksIDS.SilverOre_BLOCK_ID, new ItemStack(DBlocksItemReg.ingotSilver), 0);
		
		
		
		//GameRegistry.addSmelting(DBlocksItemReg.dustTin.shiftedIndex, new ItemStack(DBlocksItemReg.ingotTin), 0);
		//GameRegistry.addSmelting(DBlocksItemReg.dustCopper.shiftedIndex, new ItemStack(DBlocksItemReg.ingotCopper), 0);
		//GameRegistry.addSmelting(DBlocksItemReg.dustSilver.shiftedIndex, new ItemStack(DBlocksItemReg.ingotSilver), 0);
		
		
	}
}
