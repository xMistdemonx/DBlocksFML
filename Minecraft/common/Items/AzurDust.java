package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class AzurDust extends Item
{
        protected AzurDust(int par1)
        {
                super(par1);
                
              setIconCoord(0, 1);
              setTextureFile(CommonProxy.ITEMS_PNG);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
}