package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class CitrineDust extends Item
{
        protected CitrineDust(int par1)
        {
                super(par1);
                
              setIconCoord(1, 1);
              setTextureFile(CommonProxy.ITEMS_PNG);
              setTabToDisplayOn(CreativeTabs.tabMaterials);
        }
}	