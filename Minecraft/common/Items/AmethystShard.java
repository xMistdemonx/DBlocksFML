package DBlocks.Items;

import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.asm.SideOnly;
import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLightningBolt;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.World;





public class AmethystShard extends Item
{
	//@SidedProxy(clientSide="DBlocks.ClientProxy", serverSide="DBlocks.common.CommonProxy")
	public static CommonProxy proxy;
		
        public AmethystShard(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(2, 0);
              setCreativeTab(CreativeTabs.tabMaterials);
             
        }
     
        
}	