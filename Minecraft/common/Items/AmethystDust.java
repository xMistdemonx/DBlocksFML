package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;





public class AmethystDust extends Item
{
        protected AmethystDust(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(2, 1);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
}	