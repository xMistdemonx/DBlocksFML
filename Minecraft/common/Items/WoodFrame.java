package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class WoodFrame extends Item
{
        protected WoodFrame(int par1)
        {
                super(par1);
                
              setIconCoord(15, 0);
              setTextureFile(CommonProxy.ITEMS_PNG);
              setTabToDisplayOn(CreativeTabs.tabMaterials);
        }
}	