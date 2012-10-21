package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;





public class CitrineFragment extends Item
{
        protected CitrineFragment(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(1, 2);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
}