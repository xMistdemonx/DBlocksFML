package DBlocks.Items;

import DBlocks.Common.DBlocksIDS;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;

public class DBlocksItemReg {
	
	
	public static Item AmethystDust;
	public static Item AzurDust;
	public static Item CitrineDust;
	public static Item Plank;
	public static Item WoodFrameStrip;
	public static Item WoodFrame;
	public static Item LampFrame;
	
	
	public static Item DSP;
	public static Item DSA;
	public static Item DSH;
	public static Item DSS;
	public static Item DSSw;
	
	
	public static Item LSP;
	public static Item LSA;
	public static Item LSH;
	public static Item LSS;
	public static Item LSSw;

	
	
	
	
	public static void Init() {
		
		//Items--------------------------------------------------------------------------------------
		
		AmethystDust = new AmethystDust(DBlocksIDS.AmethystDust_ID)
		.setItemName("Amethyst Dust");
		
		AzurDust = new AzurDust(DBlocksIDS.AzurDust_ID)
		.setItemName("Azur Dust");
		
		
		CitrineDust = new CitrineDust(DBlocksIDS.CitrineDust_ID)
		.setItemName("Citrine Dust");
		
		
		Plank = new Plank(DBlocksIDS.Plank_ID)
		.setItemName("Plank");
		
		
		WoodFrameStrip = new WoodFrameStrip(DBlocksIDS.WoodFrameStrip_ID)
		.setItemName("Wood Frame Strip");
		
	
		WoodFrame = new WoodFrame(DBlocksIDS.WoodFrame_ID)
		.setItemName("Wood Frame");
		
		
		LampFrame = new LampFrame(DBlocksIDS.LampFrame_ID)
		.setItemName("Lamp Frame");
		
		
		
		//DarkStone Tools-------------------------------------------------------------------------------
		DSP = new DSP(DBlocksIDS.DSP_ID, EnumToolMaterial.STONE)
		
		.setItemName("DarkStone Pickaxe");
		
		
		DSA = new DSA(DBlocksIDS.DSA_ID, EnumToolMaterial.STONE)
		.setItemName("DarkStone Axe");
		
		
		DSH = new DSH(DBlocksIDS.DSH_ID, EnumToolMaterial.STONE)
		.setItemName("DarkStone Hoe");
		
		
		DSS = new DSS(DBlocksIDS.DSS_ID, EnumToolMaterial.STONE)
		.setItemName("DarkStone Spade");
		
		
		DSSw = new DSSw(DBlocksIDS.DSSw_ID, EnumToolMaterial.STONE)
		.setItemName("DarkStone Sword");
		
		
		//LightStone Tools----------------------------------------------------------------------------------
		LSP = new LSP(DBlocksIDS.LSP_ID, EnumToolMaterial.STONE)
		.setItemName("LightStone Pickaxe");
		
		
		LSA = new LSA(DBlocksIDS.LSA_ID, EnumToolMaterial.STONE)
		.setItemName("LightStone Axe");
		
		
		LSH = new LSH(DBlocksIDS.LSH_ID, EnumToolMaterial.STONE)
		.setItemName("LightStone Hoe");
		
		
		LSS = new LSS(DBlocksIDS.LSS_ID, EnumToolMaterial.STONE)
		.setItemName("LightStone Spade");
		
		
		LSSw = new LSSw(DBlocksIDS.LSSw_ID, EnumToolMaterial.STONE)
		.setItemName("LightStone Sword");
		
		
		
				
		
		//Language Registry
		LanguageRegistry.addName(AmethystDust, "Amethyst Dust");
		LanguageRegistry.addName(AzurDust, "Azur Dust");
		LanguageRegistry.addName(CitrineDust, "Citrine Dust");
		LanguageRegistry.addName(Plank, "Plank");
		LanguageRegistry.addName(WoodFrameStrip, "Wood Frame Strip");
		LanguageRegistry.addName(WoodFrame, "Wood Frame");
		LanguageRegistry.addName(LampFrame, "Lamp Frame");
		
		
		LanguageRegistry.addName(DSP, "DarkStone Pickaxe");
		LanguageRegistry.addName(DSA, "DarkStone Axe");
		LanguageRegistry.addName(DSH, "DarkStone Hoe");
		LanguageRegistry.addName(DSS, "DarkStone Spade");
		LanguageRegistry.addName(DSSw, "DarkStone Sword");
		
		LanguageRegistry.addName(LSP, "LightStone Pickaxe");
		LanguageRegistry.addName(LSA, "LightStone Axe");
		LanguageRegistry.addName(LSH, "LightStone Hoe");
		LanguageRegistry.addName(LSS, "LightStone Spade");
		LanguageRegistry.addName(LSSw, "LightStone Sword");
		
		
	}
}
