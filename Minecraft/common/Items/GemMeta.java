/*package DBlocks.Items;

import java.util.List;

import DBlocks.Common.CommonProxy;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;






public class GemMeta extends Item {

	public GemMeta(int par1) {
		super(par1);
		setHasSubtypes(true);
        setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.ITEMS_PNG;
	
	}
	
	@SideOnly(Side.CLIENT)
	public int getIconFromDamage(int i){
		switch(i){
		    case 0:return 0;
		    case 1:return 1;
		    case 2:return 2;
		    case 3:return 3;
		    case 4:return 4;
		    case 5:return 5;
		    default:return 1;
		}
	}
	
	public String getItemNameIS(ItemStack i){
		switch(i.getItemDamage()){
		case 0:return "Azur Shard";
		case 1:return "Amethyst Shard";
		case 2:return "Citrine Shard";
		case 3:return "Topaz Shard";
		case 4:return "Peridot Shard";
		case 5:return "Aquamarine Shard";
		default:return "Default";
		}
	}
	
    @SideOnly(Side.CLIENT)
    public void getSubItems(int i, CreativeTabs tab, List list)
    {
    	list.add(new ItemStack(i, 1, 0));
    	list.add(new ItemStack(i, 1, 1));
    	list.add(new ItemStack(i, 1, 2));
    	list.add(new ItemStack(i, 1, 3));
    	list.add(new ItemStack(i, 1, 4));
    	list.add(new ItemStack(i, 1, 5));
    }
    
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
    
    
    
    @SideOnly(Side.CLIENT)

    *//**
     * allows items to add custom lines of information to the mouseover description
     *//*
    
    public void addInformation(ItemStack par1ItemStack, List par2List)
    {
    	int i = par1ItemStack.getItemDamage();
    	switch(i){
    	case 0: par2List.add("This Has Great Power");
    	
    	
    	
    	//default: par2List.add("Shit Blows");
    	}
    }


    
    
    

    @SideOnly(Side.CLIENT)

    *//**
     * Return an item rarity from EnumRarity
     *//*
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.rare;
    }

}
*/