package DBlocks.Items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import DBlocks.Common.CommonProxy;

public class ingotCopper extends Item{
	
	protected ingotCopper(int par1)
    {
            super(par1);
            this.setItemName("Copper Ingot");
          
          setTextureFile(CommonProxy.ITEMS_PNG);
          setIconCoord(2, 15);
          setCreativeTab(CreativeTabs.tabMaterials);
    }
}