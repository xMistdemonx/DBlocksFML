package DBlocks.Items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import DBlocks.Common.CommonProxy;

public class dustCopper extends Item{
	
	protected dustCopper(int par1)
    {
            super(par1);
            this.setItemName("Copper Dust");
          
          setTextureFile(CommonProxy.ITEMS_PNG);
          setIconCoord(2, 14);
          setCreativeTab(CreativeTabs.tabMaterials);
    }
}