package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class AmethystShard extends Item
{
        protected AmethystShard(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(2, 0);
              setTabToDisplayOn(CreativeTabs.tabMaterials);
        }
}	