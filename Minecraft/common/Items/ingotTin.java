package DBlocks.Items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import DBlocks.Common.CommonProxy;

public class ingotTin extends Item{
	
	protected ingotTin(int par1)
    {
            super(par1);
            this.setItemName("Tin Ingot");
          
          setTextureFile(CommonProxy.ITEMS_PNG);
          setIconCoord(0, 15);
          setCreativeTab(CreativeTabs.tabMaterials);
    }
}