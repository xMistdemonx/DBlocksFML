package DBlocks.Handlers;

import java.io.File;
import java.util.logging.Level;

import DBlocks.Common.DBlocksIDS;



import cpw.mods.fml.common.FMLLog;
import net.minecraft.src.Item;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	
	//public static boolean generateAmethyst;
	
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		
		try {
			config.load();
			//OPTIONS
			//generateAmethyst = config.getOrCreateBooleanProperty("generateAmethyst", "OPTIONS", true).getBoolean(true);
			
			
			
			//BLOCKS
			DBlocksIDS.DarkStone_BLOCK_ID = config.getOrCreateIntProperty("DarkStone_BLOCK_ID", "BLOCKS", 200).getInt(200);
			DBlocksIDS.DarkCobbleStone_BLOCK_ID = config.getOrCreateIntProperty("DarkCobbleStone_BLOCK_ID", "BLOCKS", 201).getInt(201);
			DBlocksIDS.DarkStoneBrick_BLOCK_ID = config.getOrCreateIntProperty("DarkStoneBrick_BLOCK_ID", "BLOCKS", 202).getInt(202);
			DBlocksIDS.LightStone_BLOCK_ID = config.getOrCreateIntProperty("LightStone_BLOCK_ID", "BLOCKS", 203).getInt(203);
			DBlocksIDS.LightCobbleStone_BLOCK_ID = config.getOrCreateIntProperty("LightCobbleStone_BLOCK_ID", "BLOCKS", 204).getInt(204);
			DBlocksIDS.LightStoneBrick_BLOCK_ID = config.getOrCreateIntProperty("LightStoneBrick_BLOCK_ID", "BLOCKS", 205).getInt(205);
			DBlocksIDS.Azurite_BLOCK_ID = config.getOrCreateIntProperty("Azurite_BLOCK_ID", "BLOCKS", 206).getInt(206);
			DBlocksIDS.AzurBlock_BLOCK_ID = config.getOrCreateIntProperty("AzurBlock_BLOCK_ID", "BLOCKS", 207).getInt(207);
			DBlocksIDS.AzurLamp_BLOCK_ID = config.getOrCreateIntProperty("AzurLamp_BLOCK_ID", "BLOCKS", 208).getInt(208);
			DBlocksIDS.AzurLampON_BLOCK_ID = config.getOrCreateIntProperty("AzurLampON_BLOCK_ID", "BLOCKS", 209).getInt(209);
			DBlocksIDS.Amethyst_BLOCK_ID = config.getOrCreateIntProperty("Amethyst_BLOCK_ID", "BLOCKS", 210).getInt(210);
			DBlocksIDS.AmethystBlock_BLOCK_ID = config.getOrCreateIntProperty("AmethystBlock_BLOCK_ID", "BLOCKS", 211).getInt(211);
			DBlocksIDS.AmethystLamp_BLOCK_ID = config.getOrCreateIntProperty("AmethystLamp_BLOCK_ID", "BLOCKS", 212).getInt(212);
			DBlocksIDS.AmethystLampON_BLOCK_ID = config.getOrCreateIntProperty("AmethystLampON_BLOCK_ID", "BLOCKS", 213).getInt(213);
			DBlocksIDS.Citrine_BLOCK_ID = config.getOrCreateIntProperty("Citrine_BLOCK_ID", "BLOCKS", 214).getInt(214);
			DBlocksIDS.CitrineBlock_BLOCK_ID = config.getOrCreateIntProperty("CitrineBlock_BLOCK_ID", "BLOCKS", 215).getInt(215);
			DBlocksIDS.CitrineLamp_BLOCK_ID = config.getOrCreateIntProperty("CitrineLamp_BLOCK_ID", "BLOCKS", 216).getInt(216);
			DBlocksIDS.CitrineLampON_BLOCK_ID = config.getOrCreateIntProperty("CitrineLampON_BLOCK_ID", "BLOCKS", 217).getInt(217);
			
			
			
			//SLABZ----------------------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.DarkStoneSlab_ID = config.getOrCreateIntProperty("DarkStoneSlab_ID", "BLOCKS", 650).getInt(650);
			DBlocksIDS.DarkStoneDSlab_ID = config.getOrCreateIntProperty("DarkStoneDSlab_ID", "BLOCKS", 651).getInt(651);
			DBlocksIDS.DarkCobbleStoneSlab_ID = config.getOrCreateIntProperty("DarkCobbleStoneSlab_ID", "BLOCKS", 652).getInt(652);
			DBlocksIDS.DarkCobbleStoneDSlab_ID = config.getOrCreateIntProperty("DarkCobbleStoneDSlab_ID", "BLOCKS", 653).getInt(653);
			DBlocksIDS.DarkStoneBrickSlab_ID = config.getOrCreateIntProperty("DarkStoneBrickSlab_ID", "BLOCKS", 654).getInt(654);
			DBlocksIDS.DarkStoneBrickDSlab_ID = config.getOrCreateIntProperty("DarkStoneBrickDSlab_ID", "BLOCKS", 655).getInt(655);
			
			DBlocksIDS.LightStoneSlab_ID = config.getOrCreateIntProperty("LightStoneSlab_ID", "BLOCKS", 656).getInt(656);
			DBlocksIDS.LightStoneDSlab_ID = config.getOrCreateIntProperty("LightStoneDSlab_ID", "BLOCKS", 657).getInt(657);
			DBlocksIDS.LightCobbleStoneSlab_ID = config.getOrCreateIntProperty("LightCobbleStoneSlab_ID", "BLOCKS", 658).getInt(658);
			DBlocksIDS.LightCobbleStoneDSlab_ID = config.getOrCreateIntProperty("LightCobbleStoneDSlab_ID", "BLOCKS", 659).getInt(659);
			DBlocksIDS.LightStoneBrickSlab_ID = config.getOrCreateIntProperty("LightStoneBrickSlab_ID", "BLOCKS", 660).getInt(660);
			DBlocksIDS.LightStoneBrickDSlab_ID = config.getOrCreateIntProperty("LightStoneBrickDSlab_ID", "BLOCKS", 661).getInt(661);
			
			
			
			
			//Nether Blocks------------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.NetherAzurite_BLOCK_ID = config.getOrCreateIntProperty("NetherAzurite_BLOCK_ID", "BLOCKS", 417).getInt(717);
			DBlocksIDS.NetherAmethyst_BLOCK_ID = config.getOrCreateIntProperty("NetherAmethyst_BLOCK_ID", "BLOCKS", 418).getInt(718);
			DBlocksIDS.NetherCitrine_BLOCK_ID = config.getOrCreateIntProperty("NetherCitrine_BLOCK_ID", "BLOCKS", 419).getInt(719);
			

			DBlocksIDS.NetherCoal_BLOCK_ID = config.getOrCreateIntProperty("NetherCoal_BLOCK_ID", "BLOCKS", 400).getInt(400);
			DBlocksIDS.NetherIron_BLOCK_ID = config.getOrCreateIntProperty("NetherIron_BLOCK_ID", "BLOCKS", 401).getInt(401);
			DBlocksIDS.NetherGold_BLOCK_ID = config.getOrCreateIntProperty("NetherGold_BLOCK_ID", "BLOCKS", 402).getInt(402);
			DBlocksIDS.NetherRedStone_BLOCK_ID = config.getOrCreateIntProperty("NetherRedStone_BLOCK_ID", "BLOCKS", 403).getInt(403);
			DBlocksIDS.NetherDiamond_BLOCK_ID = config.getOrCreateIntProperty("NetherDiamond_BLOCK_ID", "BLOCKS", 404).getInt(404);
			
			
			
			
			
			//ITEMS---------------------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.AmethystDust_ID = config.getOrCreateIntProperty("AmethystDust_ID", "ITEMS", 3001).getInt(3001);
			DBlocksIDS.AmethystDust_ID = config.getOrCreateIntProperty(" AmethystDust_ID", "ITEMS", 3002).getInt(3002);
			DBlocksIDS.AzurDust_ID = config.getOrCreateIntProperty(" AzurDust_ID", "ITEMS", 3003).getInt(3003);
			DBlocksIDS.CitrineDust_ID = config.getOrCreateIntProperty(" CitrineDust_ID", "ITEMS", 3004).getInt(3004);
			DBlocksIDS.Plank_ID = config.getOrCreateIntProperty(" Plank_ID", "ITEMS", 3005).getInt(3005);
			DBlocksIDS.WoodFrameStrip_ID = config.getOrCreateIntProperty(" WoodFrameStrip_ID", "ITEMS", 3006).getInt(3006);
			DBlocksIDS.WoodFrame_ID = config.getOrCreateIntProperty(" WoodFrame_ID", "ITEMS", 3007).getInt(3007);
			DBlocksIDS.LampFrame_ID = config.getOrCreateIntProperty(" LampFrame_ID", "ITEMS", 3008).getInt(3008);
			
			
			
			//DarkStone Tools-----------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.DSP_ID = config.getOrCreateIntProperty(" DSP_ID", "ITEMS", 3009).getInt(3009);
			DBlocksIDS.DSA_ID = config.getOrCreateIntProperty(" DSA_ID", "ITEMS", 3010).getInt(3010);
			DBlocksIDS.DSH_ID = config.getOrCreateIntProperty(" DSH_ID", "ITEMS", 3011).getInt(3011);
			DBlocksIDS.DSS_ID = config.getOrCreateIntProperty(" DSS_ID", "ITEMS", 3012).getInt(3012);
			DBlocksIDS.DSSw_ID = config.getOrCreateIntProperty(" DSSw_ID", "ITEMS", 3013).getInt(3013);
			
			
			
			
			//LightStone Tools----------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.LSP_ID = config.getOrCreateIntProperty(" LSP_ID", "ITEMS", 3014).getInt(3014);
			DBlocksIDS.LSA_ID = config.getOrCreateIntProperty(" LSA_ID", "ITEMS", 3015).getInt(3015);
			DBlocksIDS.LSH_ID = config.getOrCreateIntProperty(" LSH_ID", "ITEMS", 3016).getInt(3016);
			DBlocksIDS.LSS_ID = config.getOrCreateIntProperty(" LSS_ID", "ITEMS", 3017).getInt(3017);
			DBlocksIDS.LSSw_ID = config.getOrCreateIntProperty(" LSSw_ID", "ITEMS", 3018).getInt(3018);
			
			
			
		
		
		
		} 
		
		
		
		
		catch(Exception e) {
			FMLLog.log(Level.SEVERE, e, "[Error]DBlocks Cannot Load Config File!");
		}
		finally {
			config.save();
		}
	}

}
