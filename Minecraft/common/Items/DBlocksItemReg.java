package DBlocks.Items;

import DBlocks.Common.DBlocksIDS;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;

public class DBlocksItemReg {
	
	
	public static Item AmethystShard;
	public static Item AzurShard;
	public static Item CitrineShard;
	

	public static Item TopazShard;
	public static Item PeridotShard;
	public static Item AquamarineShard;
	
	
	public static Item AmethystDust;
	public static Item AzurDust;
	public static Item CitrineDust;
	
	
	public static Item TopazDust;
	public static Item PeridotDust;
	public static Item AquamarineDust;
	
	
	public static Item AmethystFragment;
	public static Item AzurFragment;
	public static Item CitrineFragment;
	
	
	public static Item TopazFragment;
	public static Item PeridotFragment;
	public static Item AquamarineFragment;
	
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
		
		AmethystShard = new AmethystShard(DBlocksIDS.AmethystShard_ID)
		.setItemName("Amethyst Shard");
		
		AzurShard = new AzurShard(DBlocksIDS.AzurShard_ID)
		.setItemName("Azur Shard");
		
		
		CitrineShard = new CitrineShard(DBlocksIDS.CitrineShard_ID)
		.setItemName("Citrine Shard");
		
		TopazShard = new TopazShard(DBlocksIDS.TopazShard_ID)
		.setItemName("Topaz Shard");
		
		PeridotShard = new PeridotShard(DBlocksIDS.PeridotShard_ID)
		.setItemName("Peridot Shard");
		
		
		AquamarineShard = new AquamarineShard(DBlocksIDS.AquamarineShard_ID)
		.setItemName("Aquamarine Shard");
		
		AmethystDust = new AmethystDust(DBlocksIDS.AmethystDust_ID)
		.setItemName("Amethyst Dust");

		AzurDust = new AzurDust(DBlocksIDS.AzurDust_ID)
		.setItemName("Azur Dust");


		CitrineDust = new CitrineDust(DBlocksIDS.CitrineDust_ID)
		.setItemName("Citrine Dust");
		
		TopazDust = new TopazDust(DBlocksIDS.TopazDust_ID)
		.setItemName("Topaz Dust");
		
		PeridotDust = new PeridotDust(DBlocksIDS.PeridotDust_ID)
		.setItemName("Peridot Dust");
		
		
		AquamarineDust = new AquamarineDust(DBlocksIDS.AquamarineDust_ID)
		.setItemName("Aquamarine Dust");
		
		
		
		
		
		
		
		
		
		
		
		AmethystFragment = new AmethystFragment(DBlocksIDS.AmethystFragment_ID)
		.setItemName("Amethyst Fragment");

		AzurFragment = new AzurFragment(DBlocksIDS.AzurFragment_ID)
		.setItemName("Azur Fragment");


		CitrineFragment = new CitrineFragment(DBlocksIDS.CitrineFragment_ID)
		.setItemName("Citrine Fragment");
		
		TopazFragment = new TopazFragment(DBlocksIDS.TopazFragment_ID)
		.setItemName("Topaz Fragment");
		
		PeridotFragment = new PeridotFragment(DBlocksIDS.PeridotFragment_ID)
		.setItemName("Peridot Fragment");
		
		
		AquamarineFragment = new AquamarineFragment(DBlocksIDS.AquamarineFragment_ID)
		.setItemName("Aquamarine Fragment");
		
		
		
		
		
		
		
		
		
		
		
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
		LanguageRegistry.addName(AmethystShard, "Amethyst Shard");
		LanguageRegistry.addName(AzurShard, "Azur Shard");
		LanguageRegistry.addName(CitrineShard, "Citrine Shard");
		

		LanguageRegistry.addName(TopazShard, "Topaz Shard");
		LanguageRegistry.addName(PeridotShard, "Peridot Shard");
		LanguageRegistry.addName(AquamarineShard, "Aquamarine Shard");
		
		
		LanguageRegistry.addName(AmethystDust, "Amethyst Dust");
		LanguageRegistry.addName(AzurDust, "Azur Dust");
		LanguageRegistry.addName(CitrineDust, "Citrine Dust");
		

		LanguageRegistry.addName(TopazDust, "Topaz Dust");
		LanguageRegistry.addName(PeridotDust, "Peridot Dust");
		LanguageRegistry.addName(AquamarineDust, "Aquamarine Dust");
		
		
		
		LanguageRegistry.addName(AmethystFragment, "Amethyst Fragment");
		LanguageRegistry.addName(AzurFragment, "Azur Fragment");
		LanguageRegistry.addName(CitrineFragment, "Citrine Fragment");
		

		LanguageRegistry.addName(TopazFragment, "Topaz Fragment");
		LanguageRegistry.addName(PeridotFragment, "Peridot Fragment");
		LanguageRegistry.addName(AquamarineFragment, "Aquamarine Fragment");
		
		
		
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
