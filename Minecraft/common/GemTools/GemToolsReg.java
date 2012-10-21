package DBlocks.GemTools;

import cpw.mods.fml.common.registry.LanguageRegistry;
import DBlocks.Common.DBlocksIDS;
import DBlocks.Items.DBlocksToolEnum;
import net.minecraft.src.Item;

public class GemToolsReg {
	
	public static Item AzurPick;
	public static Item AzurAxe;
	public static Item AzurHoe;
	public static Item AzurSpade;
	public static Item AzurSword;

	public static Item AmethystPick;
	public static Item AmethystAxe;
	public static Item AmethystHoe;
	public static Item AmethystSpade;
	public static Item AmethystSword;

	public static Item CitrinePick;
	public static Item CitrineAxe;
	public static Item CitrineHoe;
	public static Item CitrineSpade;
	public static Item CitrineSword;

	public static Item TopazPick;
	public static Item TopazAxe;
	public static Item TopazHoe;
	public static Item TopazSpade;
	public static Item TopazSword;

	public static Item PeridotPick;
	public static Item PeridotAxe;
	public static Item PeridotHoe;
	public static Item PeridotSpade;
	public static Item PeridotSword;

	public static Item AquamarinePick;
	public static Item AquamarineAxe;
	public static Item AquamarineHoe;
	public static Item AquamarineSpade;
	public static Item AquamarineSword;
	
	
	public static void Init() {
		
		
		
		
		
		AzurPick = new AzurPick(DBlocksIDS.AzurPick_ID, DBlocksToolEnum.toolAzur)
		.setItemName("Azur Pickaxe");


		AzurAxe = new AzurAxe(DBlocksIDS.AzurAxe_ID, DBlocksToolEnum.toolAzur)
		.setItemName("Azur Axe");


		AzurHoe = new AzurHoe(DBlocksIDS.AzurHoe_ID, DBlocksToolEnum.toolAzur)
		.setItemName("Azur Hoe");


		AzurSpade = new AzurSpade(DBlocksIDS.AzurSpade_ID, DBlocksToolEnum.toolAzur)
		.setItemName("Azur Spade");


		AzurSword = new AzurSword(DBlocksIDS.AzurSword_ID, DBlocksToolEnum.toolAzur)
		.setItemName("Azur Sword");
		
		//------------------------------------------------------------------------------------------------------------------------------

		AmethystPick = new AmethystPick(DBlocksIDS.AmethystPick_ID, DBlocksToolEnum.toolAmethyst)
		.setItemName("Amethyst Pickaxe");


		AmethystAxe = new AmethystAxe(DBlocksIDS.AmethystAxe_ID, DBlocksToolEnum.toolAmethyst)
		.setItemName("Amethyst Axe");


		AmethystHoe = new AmethystHoe(DBlocksIDS.AmethystHoe_ID, DBlocksToolEnum.toolAmethyst)
		.setItemName("Amethyst Hoe");


		AmethystSpade = new AmethystSpade(DBlocksIDS.AmethystSpade_ID, DBlocksToolEnum.toolAmethyst)
		.setItemName("Amethyst Spade");


		AmethystSword = new AmethystSword(DBlocksIDS.AmethystSword_ID, DBlocksToolEnum.toolAmethyst)
		.setItemName("Amethyst Sword");
		
		//------------------------------------------------------------------------------------------------------------------------------

		CitrinePick = new CitrinePick(DBlocksIDS.CitrinePick_ID, DBlocksToolEnum.toolCitrine)
		.setItemName("Citrine Pickaxe");


		CitrineAxe = new CitrineAxe(DBlocksIDS.CitrineAxe_ID, DBlocksToolEnum.toolCitrine)
		.setItemName("Citrine Axe");


		CitrineHoe = new CitrineHoe(DBlocksIDS.CitrineHoe_ID, DBlocksToolEnum.toolCitrine)
		.setItemName("Citrine Hoe");


		CitrineSpade = new CitrineSpade(DBlocksIDS.CitrineSpade_ID, DBlocksToolEnum.toolCitrine)
		.setItemName("Citrine Spade");


		CitrineSword = new CitrineSword(DBlocksIDS.CitrineSword_ID, DBlocksToolEnum.toolCitrine)
		.setItemName("Citrine Sword");
		
		//------------------------------------------------------------------------------------------------------------------------------

		TopazPick = new TopazPick(DBlocksIDS.TopazPick_ID, DBlocksToolEnum.toolTopaz)
		.setItemName("Topaz Pickaxe");


		TopazAxe = new TopazAxe(DBlocksIDS.TopazAxe_ID, DBlocksToolEnum.toolTopaz)
		.setItemName("Topaz Axe");


		TopazHoe = new TopazHoe(DBlocksIDS.TopazHoe_ID, DBlocksToolEnum.toolTopaz)
		.setItemName("Topaz Hoe");


		TopazSpade = new TopazSpade(DBlocksIDS.TopazSpade_ID, DBlocksToolEnum.toolTopaz)
		.setItemName("Topaz Spade");


		TopazSword = new TopazSword(DBlocksIDS.TopazSword_ID, DBlocksToolEnum.toolTopaz)
		.setItemName("Topaz Sword");
		
		//------------------------------------------------------------------------------------------------------------------------------

		PeridotPick = new PeridotPick(DBlocksIDS.PeridotPick_ID, DBlocksToolEnum.toolPeridot)
		.setItemName("Peridot Pickaxe");


		PeridotAxe = new PeridotAxe(DBlocksIDS.PeridotAxe_ID, DBlocksToolEnum.toolPeridot)
		.setItemName("Peridot Axe");


		PeridotHoe = new PeridotHoe(DBlocksIDS.PeridotHoe_ID, DBlocksToolEnum.toolPeridot)
		.setItemName("Peridot Hoe");


		PeridotSpade = new PeridotSpade(DBlocksIDS.PeridotSpade_ID, DBlocksToolEnum.toolPeridot)
		.setItemName("Peridot Spade");


		PeridotSword = new PeridotSword(DBlocksIDS.PeridotSword_ID, DBlocksToolEnum.toolPeridot)
		.setItemName("Peridot Sword");
		
		//------------------------------------------------------------------------------------------------------------------------------

		AquamarinePick = new AquamarinePick(DBlocksIDS.AquamarinePick_ID, DBlocksToolEnum.toolAquamarine)
		.setItemName("Aquamarine Pickaxe");


		AquamarineAxe = new AquamarineAxe(DBlocksIDS.AquamarineAxe_ID, DBlocksToolEnum.toolAquamarine)
		.setItemName("Aquamarine Axe");


		AquamarineHoe = new AquamarineHoe(DBlocksIDS.AquamarineHoe_ID, DBlocksToolEnum.toolAquamarine)
		.setItemName("Aquamarine Hoe");


		AquamarineSpade = new AquamarineSpade(DBlocksIDS.AquamarineSpade_ID, DBlocksToolEnum.toolAquamarine)
		.setItemName("Aquamarine Spade");


		AquamarineSword = new AquamarineSword(DBlocksIDS.AquamarineSword_ID, DBlocksToolEnum.toolAquamarine)
		.setItemName("Aquamarine Sword");
		
		
		
		
		LanguageRegistry.addName(AzurPick, "Azur Pickaxe");
		LanguageRegistry.addName(AzurAxe, "Azur Axe");
		LanguageRegistry.addName(AzurHoe, "Azur Hoe");
		LanguageRegistry.addName(AzurSpade, "Azur Spade");
		LanguageRegistry.addName(AzurSword, "Azur Sword");

		LanguageRegistry.addName(AmethystPick, "Amethyst Pickaxe");
		LanguageRegistry.addName(AmethystAxe, "Amethyst Axe");
		LanguageRegistry.addName(AmethystHoe, "Amethyst Hoe");
		LanguageRegistry.addName(AmethystSpade, "Amethyst Spade");
		LanguageRegistry.addName(AmethystSword, "Amethyst Sword");

		LanguageRegistry.addName(CitrinePick, "Citrine Pickaxe");
		LanguageRegistry.addName(CitrineAxe, "Citrine Axe");
		LanguageRegistry.addName(CitrineHoe, "Citrine Hoe");
		LanguageRegistry.addName(CitrineSpade, "Citrine Spade");
		LanguageRegistry.addName(CitrineSword, "Citrine Sword");

		LanguageRegistry.addName(TopazPick, "Topaz Pickaxe");
		LanguageRegistry.addName(TopazAxe, "Topaz Axe");
		LanguageRegistry.addName(TopazHoe, "Topaz Hoe");
		LanguageRegistry.addName(TopazSpade, "Topaz Spade");
		LanguageRegistry.addName(TopazSword, "Topaz Sword");

		LanguageRegistry.addName(PeridotPick, "Peridot Pickaxe");
		LanguageRegistry.addName(PeridotAxe, "Peridot Axe");
		LanguageRegistry.addName(PeridotHoe, "Peridot Hoe");
		LanguageRegistry.addName(PeridotSpade, "Peridot Spade");
		LanguageRegistry.addName(PeridotSword, "Peridot Sword");

		LanguageRegistry.addName(AquamarinePick, "Aquamarine Pickaxe");
		LanguageRegistry.addName(AquamarineAxe, "Aquamarine Axe");
		LanguageRegistry.addName(AquamarineHoe, "Aquamarine Hoe");
		LanguageRegistry.addName(AquamarineSpade, "Aquamarine Spade");
		LanguageRegistry.addName(AquamarineSword, "Aquamarine Sword");
	}

}
