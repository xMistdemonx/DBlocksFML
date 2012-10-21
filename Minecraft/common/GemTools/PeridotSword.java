package DBlocks.GemTools;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;

public class PeridotSword extends ItemSword
{

	public PeridotSword(int itemID, EnumToolMaterial toolMaterial)
	{

		super(itemID, toolMaterial);
		
		setIconCoord(12, 11);
		}


	
			public String getTextureFile()
			{
				return CommonProxy.ITEMS_PNG;
			}
	}