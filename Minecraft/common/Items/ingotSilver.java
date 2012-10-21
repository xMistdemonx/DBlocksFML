package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ingotSilver extends Item{
	
	protected ingotSilver(int par1)
    {
            super(par1);
            this.setItemName("Silver Ingot");
          
          setTextureFile(CommonProxy.ITEMS_PNG);
          setIconCoord(1, 15);
          setCreativeTab(CreativeTabs.tabMaterials);
    }
}