package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class AmethystBlock extends Block {

	public AmethystBlock (int id) {
		super(id, 20, Material.rock);
		this.setHardness(1.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("AmethystBlock");
	}
	
	public int idDropped(int par1, Random raandom, int par2)
{
return DBlocksIDS.AmethystBlock_BLOCK_ID;
}
	
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

}