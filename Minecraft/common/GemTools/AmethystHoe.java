package DBlocks.GemTools;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemHoe;
import DBlocks.Common.CommonProxy;

public class AmethystHoe extends ItemHoe
{

	public AmethystHoe(int itemID, EnumToolMaterial toolMaterial)
	{

		super(itemID, toolMaterial);
		
		setIconCoord(10, 15);
		}


	
			public String getTextureFile()
			{
				return CommonProxy.ITEMS_PNG;
			}
	}