package DBlocks.Blocks;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;

public class CopperOre extends Block {

	public CopperOre (int id) {
		super(id, 49, Material.rock);
		this.setHardness(3.5F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Copper Ore");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

	
	public int idDropped(int par1, Random random, int par2) {
		return DBlocksIDS.CopperOre_BLOCK_ID;
	
	
	
	
	
	}
}