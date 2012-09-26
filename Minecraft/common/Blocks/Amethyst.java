package DBlocks.Blocks;

import java.util.Random;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import DBlocks.Items.DBlocksItemReg;


import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class Amethyst extends Block {
public Random chance = new Random();
	public int c;

public Amethyst (int id) {
		super(id, 4, Material.rock);
		this.setHardness(3.5F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Amethyst");
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

		
		public int quantityDropped(Random random)
		{
			return random.nextInt(3) + 1;
			}
		
	public int idDropped(int par1, Random random, int par2) {
		
	c = chance.nextInt(10);
	if (c == 3){
		
		
		return DBlocksItemReg.AmethystShard.shiftedIndex;
		}else{
			return DBlocksItemReg.AmethystFragment.shiftedIndex;
		}
	}
}