package DBlocks.Items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import DBlocks.Common.CommonProxy;

public class TopazGem extends Item
{
	//@SidedProxy(clientSide="DBlocks.ClientProxy", serverSide="DBlocks.common.CommonProxy")
	//public static CommonProxy proxy;
		
        public TopazGem(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setItemName("Topaz Gem");
              setIconCoord(3, 3);
              setCreativeTab(CreativeTabs.tabMaterials);
              setMaxStackSize(64);
             
        }
        
        
        
        
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack par1ItemStack)
        {
            return true;
        }

        @SideOnly(Side.CLIENT)

        /**
         * Return an item rarity from EnumRarity
         */
        public EnumRarity getRarity(ItemStack par1ItemStack)
        {
            return EnumRarity.rare;
        }
}	