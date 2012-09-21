package DBlocks.Items;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSpade;

public class DSS extends ItemSpade
{

	public DSS(int itemID, EnumToolMaterial toolMaterial)
	{

		super(itemID, toolMaterial);
		
		setIconCoord(15, 12);
		}


	
			public String getTextureFile()
			{
				return CommonProxy.ITEMS_PNG;
			}
	}
//static EnumToolMaterial yourtoolmaterial = EnumHelper.addToolMaterial("yourmaterial", 2, 500, 7F, 2, 14);