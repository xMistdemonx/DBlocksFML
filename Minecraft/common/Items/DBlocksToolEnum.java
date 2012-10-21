package DBlocks.Items;

import net.minecraft.src.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class DBlocksToolEnum {
	
	
/*	static EnumToolMaterial yourtoolmaterial = EnumHelper.addToolMaterial("yourmaterial", 2, 500, 7F, 2, 14);
	EnumToolMaterial is the file where all the tool materials from minecraft are stored. To add something to that file you have to use EnumHelper.
	EnumHelper.addToolMaterial adds a new tool material to the EnumToolMaterial file without changing it.
	This material is used for every type of tool so it has several things that are not related to swords.
	"yourmaterial" is the name of your tool material even though this is not used.
	
	2 is the harvest level. This has to do with the blocks it can destroy. 3 can destroy things like diamond gear and 0 like wooden things.
	
	500 is the durability.
	
	7F is the speed it can destroy blocks.
	
	2 is the damage in half hearts the tool does. There are 4 half hearts counted up with this value for swords.
	
	14 is the enchantability. Nobody really knows what this number does. I suggest copying the number of the tool material that is the most the same as yours.
	
	Harvest levels :
	0 = woooden/gold
	1 = stone
	2 = iron
	3 = diamond
	4 = Custom
	*/
	
	
	//Dark Stone Tools
	public static EnumToolMaterial toolDarkStone = EnumHelper.addToolMaterial("toolDarkStone", 1, 231, 5F, 3, 5);
	
	//Light Stone Tools
	public static EnumToolMaterial toolLightStone = EnumHelper.addToolMaterial("toolDarkStone", 1, 75, 3F, 1, 5);
	

	public static EnumToolMaterial toolAzur = EnumHelper.addToolMaterial("toolAzur", 2, 1849, 10F, 4, 50);
	public static EnumToolMaterial toolAmethyst = EnumHelper.addToolMaterial("toolAmethyst", 2, 1967, 10F, 4, 50);
	public static EnumToolMaterial toolCitrine = EnumHelper.addToolMaterial("toolCitrine", 2, 2000, 10F, 4, 50);
	public static EnumToolMaterial toolTopaz = EnumHelper.addToolMaterial("toolTopaz", 2, 2000, 10F, 4, 50);
	public static EnumToolMaterial toolPeridot = EnumHelper.addToolMaterial("toolPeridot", 2, 1798, 10F, 4, 50);
	public static EnumToolMaterial toolAquamarine = EnumHelper.addToolMaterial("toolAquamarine", 2, 1885, 10F, 4, 50);
}
