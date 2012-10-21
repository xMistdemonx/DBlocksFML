package DBlocks.GemTools;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemHoe;

public class TopazHoe extends ItemHoe
{

	public TopazHoe(int itemID, EnumToolMaterial toolMaterial)
	{

		super(itemID, toolMaterial);
		
		setIconCoord(11, 15);
		}


	
			public String getTextureFile()
			{
				return CommonProxy.ITEMS_PNG;
			}
	}