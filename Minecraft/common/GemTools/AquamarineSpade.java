package DBlocks.GemTools;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSpade;

public class AquamarineSpade extends ItemSpade
{

	public AquamarineSpade(int itemID, EnumToolMaterial toolMaterial)
	{

		super(itemID, toolMaterial);
		
		setIconCoord(13, 12);
		}


	
			public String getTextureFile()
			{
				return CommonProxy.ITEMS_PNG;
			}
	}