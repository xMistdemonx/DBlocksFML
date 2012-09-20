package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class LampFrame extends Item
{
        protected LampFrame(int par1)
        {
                super(par1);
                
              setIconCoord(15, 1);
              setTextureFile(CommonProxy.ITEMS_PNG);
              setTabToDisplayOn(CreativeTabs.tabMaterials);
        }
}	