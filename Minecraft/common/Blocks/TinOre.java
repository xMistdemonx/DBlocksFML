package DBlocks.Blocks;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;

public class TinOre extends Block {

	public TinOre (int id) {
		super(id, 64, Material.rock);
		this.setHardness(4.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Tin Ore");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

	
	public int idDropped(int par1, Random random, int par2) {
		return DBlocksIDS.TinOre_BLOCK_ID;
	
	
	
	
	
	}
}