package DBlocks.GemTools;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemAxe;

public class AquamarineAxe extends ItemAxe
{

	public AquamarineAxe(int itemID, EnumToolMaterial toolMaterial)
	{

		super(itemID, toolMaterial);
		
		setIconCoord(13, 14);
		}


	
			public String getTextureFile()
			{
				return CommonProxy.ITEMS_PNG;
			}
	}