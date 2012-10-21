package DBlocks.GemTools;

import DBlocks.Common.CommonProxy;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;

public class TopazSword extends ItemSword
{

	public TopazSword(int itemID, EnumToolMaterial toolMaterial)
	{

		super(itemID, toolMaterial);
		
		setIconCoord(11, 11);
		}


	
			public String getTextureFile()
			{
				return CommonProxy.ITEMS_PNG;
			}
	}