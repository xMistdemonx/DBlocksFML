package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;

public class NetherRedStone extends Block {

	public NetherRedStone (int id) {
		super(id, 251, Material.rock);
		this.setHardness(3.5F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Nether RedStone");
		}	
	
	

		public int quantityDropped(Random random)
		{
			return 8 + random.nextInt(1);
			}
	
	
		
		public int idDropped(int par1, Random raandom, int par2)
		{
			return Item.redstone.shiftedIndex;
			}
	
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

	
}