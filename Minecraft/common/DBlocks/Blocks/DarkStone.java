package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class DarkStone extends Block {

	public DarkStone (int id) {
		super(id, 1, Material.rock);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Dark Stone");
	}
	
	public int idDropped(int par1, Random raandom, int par2)
{
return DBlocksIDS.DarkCobbleStone_BLOCK_ID;
}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

}