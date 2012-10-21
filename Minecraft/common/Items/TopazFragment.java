package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class TopazFragment extends Item
{
        protected TopazFragment(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(3, 2);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
}