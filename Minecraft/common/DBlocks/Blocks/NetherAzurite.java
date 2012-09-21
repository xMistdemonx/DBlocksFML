package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class NetherAzurite extends Block {

	public NetherAzurite (int id) {
		super(id, 250, Material.rock);
		this.setHardness(3.5F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Nether Azurite");
	}
	
	public int idDropped(int par1, Random raandom, int par2)
{
return DBlocksIDS.AzurDust_ID;
}
	
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

}