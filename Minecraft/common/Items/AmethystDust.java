package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class AmethystDust extends Item
{
        protected AmethystDust(int par1)
        {
                super(par1);
                
              setIconCoord(0, 0);
              setTextureFile(CommonProxy.ITEMS_PNG);
              //setCreativeTab(CreativeTabs.tabMaterials);
        }
}	