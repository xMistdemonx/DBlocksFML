package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class AquamarineFragment extends Item
{
        protected AquamarineFragment(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(5, 2);
              setTabToDisplayOn(CreativeTabs.tabMaterials);
        }
}