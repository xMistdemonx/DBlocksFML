package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class WoodFrameStrip extends Item
{
        protected WoodFrameStrip(int par1)
        {
                super(par1);
                
              setIconCoord(14, 1);
              setTextureFile(CommonProxy.ITEMS_PNG);
              setTabToDisplayOn(CreativeTabs.tabMaterials);
        }
}	