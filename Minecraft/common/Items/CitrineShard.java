package DBlocks.Items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;





public class CitrineShard extends Item
{
        protected CitrineShard(int par1)
        {
                super(par1);
                
              setIconCoord(1, 0);
              setTextureFile(CommonProxy.ITEMS_PNG);
              setCreativeTab(CreativeTabs.tabMaterials);
        }
        

}	