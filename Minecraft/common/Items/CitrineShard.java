package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class CitrineShard extends Item
{
        protected CitrineShard(int par1)
        {
                super(par1);
                
              setIconCoord(1, 0);
              setTextureFile(CommonProxy.ITEMS_PNG);
              setTabToDisplayOn(CreativeTabs.tabMaterials);
        }
}	