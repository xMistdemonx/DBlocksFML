package DBlocks.Blocks;

import java.util.List;
import java.util.Random;


import DBlocks.Common.CommonProxy;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class SLABZ extends Block{


boolean isDoubleSlab;
int halfID;
int doubleID;

public SLABZ(int i, int j, boolean k, int l, int m)
{
super(i, j, Material.ground);
setCreativeTab(CreativeTabs.tabBlock);
isDoubleSlab = k;
halfID = l;
doubleID = m;

if (k)
        {
            opaqueCubeLookup[i] = true;
        }
        else
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        }
        
setLightOpacity(0);


}

public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
{
if(par1World.getBlockId(par2, par3 - 1, par4) == halfID)
{
par1World.setBlockWithNotify(par2, par3, par4, 0);
par1World.setBlockWithNotify(par2, par3 - 1, par4, doubleID);
}
}

public boolean isOpaqueCube()
{
return isDoubleSlab;
}

public void updateBlockMetadata(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8)
    {
        if (!this.isDoubleSlab)
        {
            if (par5 == 0 || par5 != 1 && (double)par7 > 0.5D)
            {
                int var9 = par1World.getBlockMetadata(par2, par3, par4) & 7;
                par1World.setBlockMetadataWithNotify(par2, par3, par4, var9 | 8);
            }
        }
    }

public int idDropped(int i, Random random, int j)
{
//change mod_K3Core.BloodCobbleHalfSlab.blockID to your mod_**** block id
return halfID;
}

public int quantityDropped(Random random)
{
if(isDoubleSlab) {
return 2;
} else {
return 1;
}
}

public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
        super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    }

public boolean renderAsNormalBlock()
{
return isDoubleSlab;
}

public void setBlockBoundsForItemRender()
    {
        if (this.isDoubleSlab)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        else
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        }
    }

public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        if (this.isDoubleSlab)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        else
        {
            boolean var5 = (par1IBlockAccess.getBlockMetadata(par2, par3, par4) & 8) != 0;

            if (var5)
            {
                this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            }
            else
            {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            }
        }
    }

@Override
public String getTextureFile() {
return CommonProxy.BLOCK_PNG;
}

public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
{
if (isDoubleSlab)
{
super.shouldSideBeRendered(iblockaccess, i, j, k, l);
}
if (l == 1)
{
return true;
}
if (!super.shouldSideBeRendered(iblockaccess, i, j, k, l))
{
return false;
}
if (l == 0)
{
return true;
}
else
{
return iblockaccess.getBlockId(i, j, k) != blockID;
}
}
}