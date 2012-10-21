package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class AmethystFragment extends Item
{
        protected AmethystFragment(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(2, 2);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
}	