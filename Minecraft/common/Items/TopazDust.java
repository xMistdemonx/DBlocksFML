package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class TopazDust extends Item
{
        protected TopazDust(int par1)
        {
                super(par1);
                
              setIconCoord(3, 1);
              setTextureFile(CommonProxy.ITEMS_PNG);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
}