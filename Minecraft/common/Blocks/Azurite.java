package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Items.DBlocksItemReg;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class Azurite extends Block {

	public Azurite (int id) {
		super(id, 2, Material.rock);
		this.setHardness(3.5F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Azurite");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

		
		public int quantityDropped(Random random)
		{
			return 1 + random.nextInt(8);
			}

		public int idDropped(int par1, Random random, int par2) {
		return DBlocksItemReg.AzurShard.shiftedIndex;
	}
}