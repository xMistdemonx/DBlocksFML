package DBlocks.Items;

import DBlocks.Common.DBlocksIDS;
import DBlocks.GemTools.AmethystAxe;
import DBlocks.GemTools.AmethystHoe;
import DBlocks.GemTools.AmethystPick;
import DBlocks.GemTools.AmethystSpade;
import DBlocks.GemTools.AmethystSword;
import DBlocks.GemTools.AzurAxe;
import DBlocks.GemTools.AzurPick;
import DBlocks.GemTools.AzurSpade;
import DBlocks.GemTools.AzurSword;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class DBlocksItemReg {


	public static Item dustTin;
	public static Item dustCopper;
	public static Item dustSilver;
	
	
	public static Item ingotTin;
	public static Item ingotCopper;
	public static Item ingotSilver;



	public static Item AmethystGem;
	public static Item AzurGem;
	public static Item CitrineGem;
	public static Item TopazGem;
	public static Item PeridotGem;
	public static Item AquamarineGem;


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

	//public static Item GemMeta;





	public static void Init() {




		//Items--------------------------------------------------------------------------------------

		dustTin = new dustTin(DBlocksIDS.dustTin_ID)
		.setItemName("Tin Dust");
		
		dustCopper = new dustCopper(DBlocksIDS.dustCopper_ID)
		.setItemName("Copper Dust");
		
		dustSilver = new dustSilver(DBlocksIDS.dustSilver_ID)
		.setItemName("Silver Dust");
		
		
		ingotTin = new ingotTin(DBlocksIDS.ingotTin_ID)
		.setItemName("Tin Ingot");
		
		ingotCopper = new ingotCopper(DBlocksIDS.ingotCopper_ID)
		.setItemName("Copper Ingot");
		
		ingotSilver = new ingotSilver(DBlocksIDS.ingotSilver_ID)
		.setItemName("Silver Ingot");


		AmethystGem = new AmethystGem(DBlocksIDS.AmethystGem_ID)
		.setItemName("Amethyst Gem");

		AzurGem = new AzurGem(DBlocksIDS.AzurGem_ID)
		.setItemName("Azur Gem");

		CitrineGem = new CitrineGem(DBlocksIDS.CitrineGem_ID)
		.setItemName("Citrine Gem");

		TopazGem = new TopazGem(DBlocksIDS.TopazGem_ID)
		.setItemName("Topaz Gem");

		PeridotGem = new PeridotGem(DBlocksIDS.PeridotGem_ID)
		.setItemName("Peridot Gem");

		AquamarineGem = new AquamarineGem(DBlocksIDS.AquamarineGem_ID)
		.setItemName("Aquamarine Gem");



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
		DSP = new DSP(DBlocksIDS.DSP_ID, DBlocksToolEnum.toolDarkStone)

		.setItemName("DarkStone Pickaxe");


		DSA = new DSA(DBlocksIDS.DSA_ID, DBlocksToolEnum.toolDarkStone)
		.setItemName("DarkStone Axe");


		DSH = new DSH(DBlocksIDS.DSH_ID, DBlocksToolEnum.toolDarkStone)
		.setItemName("DarkStone Hoe");


		DSS = new DSS(DBlocksIDS.DSS_ID, DBlocksToolEnum.toolDarkStone)
		.setItemName("DarkStone Spade");


		DSSw = new DSSw(DBlocksIDS.DSSw_ID, DBlocksToolEnum.toolDarkStone)
		.setItemName("DarkStone Sword");


		//LightStone Tools----------------------------------------------------------------------------------
		LSP = new LSP(DBlocksIDS.LSP_ID, DBlocksToolEnum.toolLightStone)
		.setItemName("LightStone Pickaxe");


		LSA = new LSA(DBlocksIDS.LSA_ID, DBlocksToolEnum.toolLightStone)
		.setItemName("LightStone Axe");


		LSH = new LSH(DBlocksIDS.LSH_ID, DBlocksToolEnum.toolLightStone)
		.setItemName("LightStone Hoe");


		LSS = new LSS(DBlocksIDS.LSS_ID, DBlocksToolEnum.toolLightStone)
		.setItemName("LightStone Spade");


		LSSw = new LSSw(DBlocksIDS.LSSw_ID, DBlocksToolEnum.toolLightStone)
		.setItemName("LightStone Sword");




		//testing meta
		//GemMeta = new GemMeta(DBlocksIDS.GhostShard_ID).setItemName("Win");



		//Ore Dictionary

		OreDictionary.registerOre("dustTin", new ItemStack(dustTin));
		OreDictionary.registerOre("dustCopper", new ItemStack(dustCopper));
		OreDictionary.registerOre("dustSilver", new ItemStack(dustSilver));
		
		
		OreDictionary.registerOre("ingotTin", new ItemStack(ingotTin));
		OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));
		OreDictionary.registerOre("ingotSilver", new ItemStack(ingotSilver));




		//Language Registry

		LanguageRegistry.addName(AquamarineGem, "Aquamarine Gem");
		LanguageRegistry.addName(AmethystGem, "Amethyst Gem");
		LanguageRegistry.addName(AzurGem, "Azur Gem");
		LanguageRegistry.addName(PeridotGem, "Peridot Gem");
		LanguageRegistry.addName(TopazGem, "Topaz Gem");
		LanguageRegistry.addName(CitrineGem, "Citrine Gem");



		LanguageRegistry.addName(dustTin, "Tin Dust");
		LanguageRegistry.addName(dustCopper, "Copper Dust");
		LanguageRegistry.addName(dustSilver, "Silver Dust");
		
		
		
		LanguageRegistry.addName(ingotTin, "Tin Ingot");
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
		LanguageRegistry.addName(ingotSilver, "Silver Ingot");

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



		//meta testing
		// LanguageRegistry.addName(new ItemStack(GemMeta, 1, 0), "Azur Shard");
		// LanguageRegistry.addName(new ItemStack(GemMeta, 1, 1), "Citrine Shard");
		// LanguageRegistry.addName(new ItemStack(GemMeta, 1, 2), "Amethyst Shard");
		// LanguageRegistry.addName(new ItemStack(GemMeta, 1, 3), "Topaz Shard");
		//  LanguageRegistry.addName(new ItemStack(GemMeta, 1, 4), "Peridot Shard");
		// LanguageRegistry.addName(new ItemStack(GemMeta, 1, 5), "Aquamarine Shard");

	}
}
