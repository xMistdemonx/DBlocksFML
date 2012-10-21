package DBlocks.GemTools;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;
import DBlocks.Common.CommonProxy;

public class AmethystSword extends ItemSword
{

	public AmethystSword(int itemID, EnumToolMaterial toolMaterial)
	{

		super(itemID, toolMaterial);
		
		setIconCoord(10, 11);
		}


	
			public String getTextureFile()
			{
				return CommonProxy.ITEMS_PNG;
			}
	}