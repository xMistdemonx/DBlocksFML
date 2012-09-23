package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class NetherCoal extends Block {

	public NetherCoal (int id) {
		super(id, 251, Material.rock);
		this.setHardness(3.5F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Nether Coal");
	}
	
	
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	
	public int quantityDropped(Random random)
	{
		return 1 + random.nextInt(4);
		}

	
	public int idDropped(int par1, Random random, int par2) 
	{
		return Item.coal.shiftedIndex;
		}
}