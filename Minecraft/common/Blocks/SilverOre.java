package DBlocks.Blocks;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import DBlocks.Blocks.DBlocksReg;

public class SilverOre extends Block {

	public SilverOre (int id) {
		super(id, 48, Material.rock);
		this.setHardness(4.5F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Silver Ore");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

	
	public int idDropped(int par1, Random random, int par2) {
		return DBlocksIDS.SilverOre_BLOCK_ID;
	
	
	
	
	
	}
}