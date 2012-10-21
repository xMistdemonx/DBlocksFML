package DBlocks.GemTools;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemAxe;
import DBlocks.Common.CommonProxy;

public class AzurAxe extends ItemAxe
{

	public AzurAxe(int itemID, EnumToolMaterial toolMaterial)
	{

		super(itemID, toolMaterial);
		
		setIconCoord(8, 14);
		}


	
			public String getTextureFile()
			{
				return CommonProxy.ITEMS_PNG;
			}
	}