package DBlocks.Blocks;

import java.util.Random;

import cpw.mods.fml.common.SidedProxy;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import DBlocks.Items.DBlocksItemReg;


import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class Amethyst extends Block {
	public Random chance = new Random();
	public int c;
	public int a;

	public Amethyst (int id) {
		super(id, 4, Material.rock);
		this.setHardness(3.5F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("Amethyst");
	}



	/*public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if(world.isRemote) {
			if(proxy.getItemInHand(player) != null) {
				player.sendChatToPlayer(" " + player.getCurrentEquippedItem());
			} else {
				player.sendChatToPlayer("No Item In Hand!");
			}
			
		}

		return true;
	}
*/


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


			return DBlocksItemReg.AmethystShard.shiftedIndex;
		}else{
			return DBlocksItemReg.AmethystFragment.shiftedIndex;
		}
	}
}