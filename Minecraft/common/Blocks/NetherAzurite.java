package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import DBlocks.Items.AzurShard;
import DBlocks.Items.DBlocksItemReg;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class NetherAzurite extends Block {

	public NetherAzurite (int id) {
		super(id, 250, Material.rock);
		this.setHardness(3.5F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Nether Azurite");
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