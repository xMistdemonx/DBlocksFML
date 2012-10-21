package DBlocks.Items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;





public class PeridotShard extends Item
{
        protected PeridotShard(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setIconCoord(4, 0);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
        
        
    
}	