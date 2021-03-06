package DBlocks.Blocks;

import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class AzurLamp extends Block {

	public final boolean powered;
	
	public AzurLamp (int id, int t, boolean par2) {
		super(id, t, Material.glass);
		this.setStepSound(soundGlassFootstep);
		this.setHardness(0.3F);
		
		powered = par2;
			
		
		
		
		if (par2)
		{
		this.setLightValue(1.0F);
		}else{ //Else, adds the off version to the inventory
	          setCreativeTab(CreativeTabs.tabRedstone);
		}

	}
	
	public int idDropped(int par1, Random raandom, int par2)
{
return DBlocksIDS.AzurLamp_BLOCK_ID;
}
	
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}

	
	/**
* Called whenever the block is added into the world. Args: world, x, y, z
*/
public void onBlockAdded(World par1World, int par2, int par3, int par4)
{
if (!par1World.isRemote)
{
if (this.powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
{
par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
}
else if (!this.powered && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
{
par1World.setBlockWithNotify(par2, par3, par4,DBlocksReg.AzurLampON.blockID);
}
}

}
    /**
* Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
* their own) Args: x, y, z, neighbor blockID
*/
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.isRemote)
        {
            if (this.powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
            }
            else if (!this.powered && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.setBlockWithNotify(par2, par3, par4,DBlocksReg.AzurLampON.blockID);
            }
        }
    }

    /**
* Ticks the block if it's been scheduled
*/
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote && this.powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
        {
            par1World.setBlockWithNotify(par2, par3, par4,DBlocksReg.AzurLamp.blockID);
        }
    }

    

    @SideOnly(Side.CLIENT)

    /**
* only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
*/
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return DBlocksReg.AzurLamp.blockID;
    }
}
