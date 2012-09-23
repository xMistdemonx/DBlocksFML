package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class LavaStone extends Block {

	public LavaStone (int id) {
		super(id, 239, Material.rock);
		this.setHardness(20.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("LavaStone");
		this.setLightValue(1.0F);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

	
	public int idDropped(int par1, Random random, int par2) {
		return DBlocksIDS.LavaStone_BLOCK_ID;
	
	
	
	
	
	}
}