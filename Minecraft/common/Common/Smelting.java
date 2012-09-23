package DBlocks.Common;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import DBlocks.Blocks.DBlocksReg;
import cpw.mods.fml.common.registry.GameRegistry;

public class Smelting {

	public static void Init() {
		GameRegistry.addSmelting(DBlocksIDS.DarkCobbleStone_BLOCK_ID, new ItemStack(DBlocksReg.DarkStone), 0);
		GameRegistry.addSmelting(DBlocksIDS.LightCobbleStone_BLOCK_ID, new ItemStack(DBlocksReg.LightStone), 0);
		GameRegistry.addSmelting(DBlocksIDS.NetherIron_BLOCK_ID, new ItemStack(Item.ingotIron), 0);
		GameRegistry.addSmelting(DBlocksIDS.NetherGold_BLOCK_ID, new ItemStack(Item.ingotGold), 0);
		
		
	}
}
