package DBlocks.GemTools;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;
import DBlocks.Common.CommonProxy;

public class CitrinePick extends ItemPickaxe
{

	public CitrinePick(int itemID, EnumToolMaterial toolMaterial)
	{

		super(itemID, toolMaterial);
		
		setIconCoord(9, 13);
		}


	
			public String getTextureFile()
			{
				return CommonProxy.ITEMS_PNG;
			}
	}