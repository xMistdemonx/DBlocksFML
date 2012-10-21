package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class LightStone extends Block {

	public LightStone (int id) {
		super(id, 0, Material.rock);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Light Stone");
	}

	@Override
	public boolean isGenMineableReplaceable(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}


	public int idDropped(int par1, Random random, int par2) {
		return DBlocksIDS.LightCobbleStone_BLOCK_ID;





	}
}