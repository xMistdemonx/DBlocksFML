package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class AzurFragment extends Item
{
        protected AzurFragment(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(0, 2);
              setTabToDisplayOn(CreativeTabs.tabMaterials);
        }
}