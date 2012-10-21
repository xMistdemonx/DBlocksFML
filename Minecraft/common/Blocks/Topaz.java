package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Items.DBlocksItemReg;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class Topaz extends Block {
public Random chance = new Random();
	public int c;

	public Topaz (int id) {
		super(id, 5, Material.rock);
		this.setHardness(3.5F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Topaz");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

	
	public int quantityDropped(Random random)
	{
		return random.nextInt(5) + 1;
	}

	public int idDropped(int par1, Random random, int par2) {

		c = chance.nextInt(10);
		if (c == 10){


			return DBlocksItemReg.TopazShard.shiftedIndex;
	}else{
		return DBlocksItemReg.TopazFragment.shiftedIndex;
	}
	}
}