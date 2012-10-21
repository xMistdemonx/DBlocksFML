package DBlocks.Blocks;

import DBlocks.Common.DBlocksIDS;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class DBlocksReg 
{	
	

	public static Block TinOre;
	public static Block CopperOre;
	public static Block SilverOre;
	
	public static Block DarkStone;
	public static Block DarkCobbleStone;
	public static Block DarkStoneBrick;
	
	public static Block LightStone;
	public static Block LightCobbleStone;
	public static Block LightStoneBrick;

	public static Block Azurite;
	public static Block AzurBlock;
	public static Block AzurLamp;
	public static Block AzurLampON;

	public static Block Amethyst;
	public static Block AmethystBlock;
	public static Block AmethystLamp;
	public static Block AmethystLampON;
	
	public static Block Citrine;
	public static Block CitrineBlock;
	public static Block CitrineLamp;
	public static Block CitrineLampON;
	

	public static Block Topaz;
	public static Block TopazBlock;
	public static Block TopazLamp;
	public static Block TopazLampON;
	
	public static Block Peridot;
	public static Block PeridotBlock;
	public static Block PeridotLamp;
	public static Block PeridotLampON;
	
	public static Block Aquamarine;
	public static Block AquamarineBlock;
	public static Block AquamarineLamp;
	public static Block AquamarineLampON;
	
	//RENDER--------------------------------
	//public static Block RecordPlayer;
	
	
	//SLABZ---------------------------------
	public static Block DarkStoneSlab;
	public static Block DarkStoneDSlab;
	public static Block DarkCobbleStoneSlab;
	public static Block DarkCobbleStoneDSlab;
	public static Block DarkStoneBrickSlab;
	public static Block DarkStoneBrickDSlab;

	public static Block LightStoneSlab;
	public static Block LightStoneDSlab;
	public static Block LightCobbleStoneSlab;
	public static Block LightCobbleStoneDSlab;
	public static Block LightStoneBrickSlab;
	public static Block LightStoneBrickDSlab;
	
	
	
	// Nether Blocks---------------------------------------
	public static Block NetherAmethyst;
	public static Block NetherAzurite;
	public static Block NetherCitrine;
	public static Block NetherTopaz;
	public static Block NetherPeridot;
	public static Block NetherAquamarine;
	
	

	
	
	
	public static void Init()
	{
		
		// Blocks--------------------------------------------------------------------------------------

		TinOre = (new TinOre(DBlocksIDS.TinOre_BLOCK_ID));
		CopperOre = (new CopperOre(DBlocksIDS.CopperOre_BLOCK_ID));
		SilverOre = (new SilverOre(DBlocksIDS.SilverOre_BLOCK_ID));
		
		DarkStone = (new DarkStone(DBlocksIDS.DarkStone_BLOCK_ID));
		DarkCobbleStone = (new DarkCobbleStone(DBlocksIDS.DarkCobbleStone_BLOCK_ID));
		DarkStoneBrick = (new DarkStoneBrick(DBlocksIDS.DarkStoneBrick_BLOCK_ID));
		
		LightStone = (new LightStone(DBlocksIDS.LightStone_BLOCK_ID));
		LightCobbleStone = (new LightCobbleStone(DBlocksIDS.LightCobbleStone_BLOCK_ID));
		LightStoneBrick = (new LightStoneBrick(DBlocksIDS.LightStoneBrick_BLOCK_ID));
		
		Azurite = (new Azurite(DBlocksIDS.Azurite_BLOCK_ID));
		AzurBlock = (new AzurBlock(DBlocksIDS.AzurBlock_BLOCK_ID));
		AzurLamp = (new AzurLamp(DBlocksIDS.AzurLamp_BLOCK_ID, 34, false).setBlockName("Azur Lamp"));
		AzurLampON = (new AzurLamp(DBlocksIDS.AzurLampON_BLOCK_ID, 50, true).setBlockName("Powered Azur Lamp"));
		
		Amethyst = (new Amethyst(DBlocksIDS.Amethyst_BLOCK_ID));
		AmethystBlock = (new AmethystBlock(DBlocksIDS.AmethystBlock_BLOCK_ID));
		AmethystLamp = (new AmethystLamp(DBlocksIDS.AmethystLamp_BLOCK_ID, 36, false).setBlockName("Amethyst Lamp"));
		AmethystLampON = (new AmethystLamp(DBlocksIDS.AmethystLampON_BLOCK_ID, 52, true).setBlockName("Powered Amethyst Lamp"));
		
		Citrine = (new Citrine(DBlocksIDS.Citrine_BLOCK_ID));
		CitrineBlock = (new CitrineBlock(DBlocksIDS.CitrineBlock_BLOCK_ID));
		CitrineLamp = (new CitrineLamp(DBlocksIDS.CitrineLamp_BLOCK_ID, 35, false).setBlockName("Citrine Lamp"));
		CitrineLampON = (new CitrineLamp(DBlocksIDS.CitrineLampON_BLOCK_ID, 51, true).setBlockName("Powered Citrine Lamp"));
		
		Topaz = (new Topaz(DBlocksIDS.Topaz_BLOCK_ID));
		TopazBlock = (new TopazBlock(DBlocksIDS.TopazBlock_BLOCK_ID));
		TopazLamp = (new TopazLamp(DBlocksIDS.TopazLamp_BLOCK_ID, 37, false).setBlockName("Topaz Lamp"));
		TopazLampON = (new TopazLamp(DBlocksIDS.TopazLampON_BLOCK_ID, 53, true).setBlockName("Powered Topaz Lamp"));

		Peridot = (new Peridot(DBlocksIDS.Peridot_BLOCK_ID));
		PeridotBlock = (new PeridotBlock(DBlocksIDS.PeridotBlock_BLOCK_ID));
		PeridotLamp = (new PeridotLamp(DBlocksIDS.PeridotLamp_BLOCK_ID, 38, false).setBlockName("Peridot Lamp"));
		PeridotLampON = (new PeridotLamp(DBlocksIDS.PeridotLampON_BLOCK_ID, 54, true).setBlockName("Powered Peridot Lamp"));

		Aquamarine = (new Aquamarine(DBlocksIDS.Aquamarine_BLOCK_ID));
		AquamarineBlock = (new AquamarineBlock(DBlocksIDS.AquamarineBlock_BLOCK_ID));
		AquamarineLamp = (new AquamarineLamp(DBlocksIDS.AquamarineLamp_BLOCK_ID, 39, false).setBlockName("Aquamarine Lamp"));
		AquamarineLampON = (new AquamarineLamp(DBlocksIDS.AquamarineLampON_BLOCK_ID, 55, true).setBlockName("Powered Aquamarine Lamp"));
		
		
		//RENDER-----------------------------------------------------------
		//RecordPlayer = new RecordPlayer(DBlocksIDS.RecordPlayer_Block_ID);
		
		
		
		//SLABZ----------------------------------------------------------------
		DarkStoneSlab = (new SLABZ(DBlocksIDS.DarkStoneSlab_ID, 1, false, DBlocksIDS.DarkStoneSlab_ID, DBlocksIDS.DarkStoneDSlab_ID).setBlockName("DarkStone Slab"));
		DarkStoneDSlab = (new SLABZ(DBlocksIDS.DarkStoneDSlab_ID, 1, true, DBlocksIDS.DarkStoneSlab_ID, DBlocksIDS.DarkStoneDSlab_ID).setBlockName("DarkStone DoubleSlab"));
		DarkCobbleStoneSlab = (new SLABZ(DBlocksIDS.DarkCobbleStoneSlab_ID, 17, false, DBlocksIDS.DarkCobbleStoneSlab_ID, DBlocksIDS.DarkCobbleStoneDSlab_ID).setBlockName("DarkCobble Stone Slab"));
		DarkCobbleStoneDSlab = (new SLABZ(DBlocksIDS.DarkCobbleStoneDSlab_ID, 17, true, DBlocksIDS.DarkCobbleStoneSlab_ID, DBlocksIDS.DarkCobbleStoneDSlab_ID).setBlockName("DarkCobble Stone DoubleSlab"));
		DarkStoneBrickSlab = (new SLABZ(DBlocksIDS.DarkStoneBrickSlab_ID,33, false, DBlocksIDS.DarkStoneBrickSlab_ID, DBlocksIDS.DarkStoneBrickDSlab_ID).setBlockName("DarkStone Brick Slab"));
		DarkStoneBrickDSlab = (new SLABZ(DBlocksIDS.DarkStoneBrickDSlab_ID, 33, true, DBlocksIDS.DarkStoneBrickSlab_ID, DBlocksIDS.DarkStoneBrickDSlab_ID).setBlockName("DarkStone Brick DoubleSlab"));
		
	

		LightStoneSlab = (new SLABZ(DBlocksIDS.LightStoneSlab_ID, 0, false, DBlocksIDS.LightStoneSlab_ID, DBlocksIDS.LightStoneDSlab_ID).setBlockName("LightStone Slab"));
		LightStoneDSlab = (new SLABZ(DBlocksIDS.LightStoneDSlab_ID, 0, true, DBlocksIDS.LightStoneSlab_ID, DBlocksIDS.LightStoneDSlab_ID).setBlockName("LightStone DoubleSlab"));
		LightCobbleStoneSlab = (new SLABZ(DBlocksIDS.LightCobbleStoneSlab_ID, 16, false, DBlocksIDS.LightCobbleStoneSlab_ID, DBlocksIDS.LightCobbleStoneDSlab_ID).setBlockName("LightCobble Stone Slab"));
		LightCobbleStoneDSlab = (new SLABZ(DBlocksIDS.LightCobbleStoneDSlab_ID, 16, true, DBlocksIDS.LightCobbleStoneSlab_ID, DBlocksIDS.LightCobbleStoneDSlab_ID).setBlockName("LightCobble Stone DoubleSlab"));
		LightStoneBrickSlab = (new SLABZ(DBlocksIDS.LightStoneBrickSlab_ID,32, false, DBlocksIDS.LightStoneBrickSlab_ID, DBlocksIDS.LightStoneBrickDSlab_ID).setBlockName("LightStone Brick Slab"));
		LightStoneBrickDSlab = (new SLABZ(DBlocksIDS.LightStoneBrickDSlab_ID, 32, true, DBlocksIDS.LightStoneBrickSlab_ID, DBlocksIDS.LightStoneBrickDSlab_ID).setBlockName("LightStone Brick DoubleSlab"));
		
		
		
		//Nether Blocks-----------------------------------------------------------
		NetherAmethyst = (new NetherAmethyst(DBlocksIDS.NetherAmethyst_BLOCK_ID));
		NetherAzurite = (new NetherAzurite(DBlocksIDS.NetherAzurite_BLOCK_ID));
		NetherCitrine = (new NetherCitrine(DBlocksIDS.NetherCitrine_BLOCK_ID));
		NetherTopaz = (new NetherTopaz(DBlocksIDS.NetherTopaz_BLOCK_ID));
		NetherPeridot = (new NetherPeridot(DBlocksIDS.NetherPeridot_BLOCK_ID));
		NetherAquamarine = (new NetherAquamarine(DBlocksIDS.NetherAquamarine_BLOCK_ID));
		
		
		

		
		// Block Registry---------------------------------------------------------------------

		GameRegistry.registerBlock(TinOre);
		GameRegistry.registerBlock(CopperOre);
		GameRegistry.registerBlock(SilverOre);
		
		GameRegistry.registerBlock(DarkStone);
		GameRegistry.registerBlock(DarkCobbleStone);
		GameRegistry.registerBlock(DarkStoneBrick);
		
		GameRegistry.registerBlock(LightStone);
		GameRegistry.registerBlock(LightCobbleStone);
		GameRegistry.registerBlock(LightStoneBrick);
		
		GameRegistry.registerBlock(Azurite);
		GameRegistry.registerBlock(AzurBlock);
		GameRegistry.registerBlock(AzurLamp);
		GameRegistry.registerBlock(AzurLampON);
		
		GameRegistry.registerBlock(Amethyst);
		GameRegistry.registerBlock(AmethystBlock);
		GameRegistry.registerBlock(AmethystLamp);
		GameRegistry.registerBlock(AmethystLampON);
	
		GameRegistry.registerBlock(Citrine);
		GameRegistry.registerBlock(CitrineBlock);
		GameRegistry.registerBlock(CitrineLamp);
		GameRegistry.registerBlock(CitrineLampON);
		
		GameRegistry.registerBlock(Topaz);
		GameRegistry.registerBlock(TopazBlock);
		GameRegistry.registerBlock(TopazLamp);
		GameRegistry.registerBlock(TopazLampON);

		GameRegistry.registerBlock(Peridot);
		GameRegistry.registerBlock(PeridotBlock);
		GameRegistry.registerBlock(PeridotLamp);
		GameRegistry.registerBlock(PeridotLampON);

		GameRegistry.registerBlock(Aquamarine);
		GameRegistry.registerBlock(AquamarineBlock);
		GameRegistry.registerBlock(AquamarineLamp);
		GameRegistry.registerBlock(AquamarineLampON);
		
		
		//GameRegistry.registerBlock(RecordPlayer);
		
		
		GameRegistry.registerBlock(DarkStoneSlab);
		GameRegistry.registerBlock(DarkStoneDSlab);
		GameRegistry.registerBlock(DarkCobbleStoneSlab);
		GameRegistry.registerBlock(DarkCobbleStoneDSlab);
		GameRegistry.registerBlock(DarkStoneBrickSlab);
		GameRegistry.registerBlock(DarkStoneBrickDSlab);
		
		GameRegistry.registerBlock(LightStoneSlab);
		GameRegistry.registerBlock(LightStoneDSlab);
		GameRegistry.registerBlock(LightCobbleStoneSlab);
		GameRegistry.registerBlock(LightCobbleStoneDSlab);
		GameRegistry.registerBlock(LightStoneBrickSlab);
		GameRegistry.registerBlock(LightStoneBrickDSlab);
		
		
		
		GameRegistry.registerBlock(NetherAmethyst);
		GameRegistry.registerBlock(NetherAzurite);
		GameRegistry.registerBlock(NetherCitrine);	
		GameRegistry.registerBlock(NetherTopaz);
		GameRegistry.registerBlock(NetherPeridot);
		GameRegistry.registerBlock(NetherAquamarine);
		
		



		
		
		
		
		
		// Language Registry-------------------------------------------------------------

		LanguageRegistry.addName(TinOre, "Tin Ore");
		LanguageRegistry.addName(CopperOre, "Copper Ore");
		LanguageRegistry.addName(SilverOre, "Silver Ore");
		
		LanguageRegistry.addName(DarkStone, "Dark Stone");
		LanguageRegistry.addName(DarkCobbleStone, "DarkCobble Stone");
		LanguageRegistry.addName(DarkStoneBrick, "Dark Stone Brick");
		
		LanguageRegistry.addName(LightStone, "Light Stone");
		LanguageRegistry.addName(LightCobbleStone, "LightCobble Stone");
		LanguageRegistry.addName(LightStoneBrick, " LightStone Brick");
		
		LanguageRegistry.addName(Azurite, "Azurite");
		LanguageRegistry.addName(AzurBlock, "Azur Block");
		LanguageRegistry.addName(AzurLamp, "Azur Lamp");
		LanguageRegistry.addName(AzurLampON, "Powered Azur Lamp");
		
		LanguageRegistry.addName(Amethyst, "Amethyst");
		LanguageRegistry.addName(AmethystBlock, "Amethyst  Block");
		LanguageRegistry.addName(AmethystLamp, "Amethyst Lamp");
		LanguageRegistry.addName(AmethystLampON, "Powered Amethyst Lamp");
		
		LanguageRegistry.addName(Citrine, "Citrine");
		LanguageRegistry.addName(CitrineBlock, "Citrine Block");
		LanguageRegistry.addName(CitrineLamp, "Citrine Lamp");
		LanguageRegistry.addName(CitrineLampON, "Powered Citrine Lamp");
		
		LanguageRegistry.addName(Topaz, "Topaz");
		LanguageRegistry.addName(TopazBlock, "TopazBlock");
		LanguageRegistry.addName(TopazLamp, "Topaz Lamp");
		LanguageRegistry.addName(TopazLampON, "Powered Topaz Lamp");

		LanguageRegistry.addName(Peridot, "Peridot");
		LanguageRegistry.addName(PeridotBlock, "Peridot Block");
		LanguageRegistry.addName(PeridotLamp, "Peridot Lamp");
		LanguageRegistry.addName(PeridotLampON, "Powered PeridotLamp");

		LanguageRegistry.addName(Aquamarine, "Aquamarine");
		LanguageRegistry.addName(AquamarineBlock, "Aquamarine Block");
		LanguageRegistry.addName(AquamarineLamp, "Aquamarine Lamp");
		LanguageRegistry.addName(AquamarineLampON, "Powered Aquamarine Lamp");
		
		//LanguageRegistry.addName(RecordPlayer, "Record Player");
		
		
		LanguageRegistry.addName(DarkStoneSlab, "DarkStone Slab");
		LanguageRegistry.addName(DarkStoneDSlab, "DarkStone DoubleSlab");
		LanguageRegistry.addName(DarkCobbleStoneSlab, "DarkCobble Stone Slab");
		LanguageRegistry.addName(DarkCobbleStoneDSlab, "DarkCobble Stone DoubleSlab");
		LanguageRegistry.addName(DarkStoneBrickSlab, "DarkStone Brick Slab");
		LanguageRegistry.addName(DarkStoneBrickDSlab, "DarkStone Brick DoubleSlab");
		
		
		LanguageRegistry.addName(LightStoneSlab, "LightStone Slab");
		LanguageRegistry.addName(LightStoneDSlab, "LightStone DoubleSlab");
		LanguageRegistry.addName(LightCobbleStoneSlab, "LightCobble Stone Slab");
		LanguageRegistry.addName(LightCobbleStoneDSlab, "LightCobble Stone DoubleSlab");
		LanguageRegistry.addName(LightStoneBrickSlab, "LightStone Brick Slab");
		LanguageRegistry.addName(LightStoneBrickDSlab, "LightStone Brick DoubleSlab");
		
		
		LanguageRegistry.addName(NetherAmethyst, "Nether Amethyst");
		LanguageRegistry.addName(NetherAzurite, "Nether Azurite");
		LanguageRegistry.addName(NetherCitrine, "Nether Citrine");
		LanguageRegistry.addName(NetherTopaz, "Nether Topaz");
		LanguageRegistry.addName(NetherPeridot, "Nether Peridot");
		LanguageRegistry.addName(NetherAquamarine, "Nether Aquamarine");


		
	}

}