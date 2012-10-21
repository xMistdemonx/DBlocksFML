package DBlocks.GemTools;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;
import DBlocks.Common.CommonProxy;

public class AzurSword extends ItemSword
{

	public AzurSword(int itemID, EnumToolMaterial toolMaterial)
	{

		super(itemID, toolMaterial);
		
		setIconCoord(8, 11);
		}


	
			public String getTextureFile()
			{
				return CommonProxy.ITEMS_PNG;
			}
	}