package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class DarkStone extends Block {

	public DarkStone (int id) {
		super(id, 1, Material.rock);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Dark Stone");
	}
	
	
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	
	@Override
	public boolean isGenMineableReplaceable(World world, int x, int y, int z) {
		return true;
	}

	
	public int idDropped(int par1, Random random, int par2) {
		return DBlocksIDS.DarkCobbleStone_BLOCK_ID;
	
	
	
	
	
	}
}