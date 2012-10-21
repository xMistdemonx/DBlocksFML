package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class PeridotFragment extends Item
{
        protected PeridotFragment(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(4, 2);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
}