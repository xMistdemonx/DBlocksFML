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
			DBlocksIDS.DarkStone_BLOCK_ID = config.getOrCreateIntProperty("DarkStone_BLOCK_ID", "BLOCKS", 2000).getInt(2000);
			DBlocksIDS.DarkCobbleStone_BLOCK_ID = config.getOrCreateIntProperty("DarkCobbleStone_BLOCK_ID", "BLOCKS", 2010).getInt(2010);
			DBlocksIDS.DarkStoneBrick_BLOCK_ID = config.getOrCreateIntProperty("DarkStoneBrick_BLOCK_ID", "BLOCKS", 2020).getInt(2020);
			DBlocksIDS.LightStone_BLOCK_ID = config.getOrCreateIntProperty("LightStone_BLOCK_ID", "BLOCKS", 2030).getInt(2030);
			DBlocksIDS.LightCobbleStone_BLOCK_ID = config.getOrCreateIntProperty("LightCobbleStone_BLOCK_ID", "BLOCKS", 2040).getInt(2040);
			DBlocksIDS.LightStoneBrick_BLOCK_ID = config.getOrCreateIntProperty("LightStoneBrick_BLOCK_ID", "BLOCKS", 2050).getInt(2050);
			DBlocksIDS.Azurite_BLOCK_ID = config.getOrCreateIntProperty("Azurite_BLOCK_ID", "BLOCKS", 2060).getInt(2060);
			DBlocksIDS.AzurBlock_BLOCK_ID = config.getOrCreateIntProperty("AzurBlock_BLOCK_ID", "BLOCKS", 2070).getInt(2070);
			DBlocksIDS.AzurLamp_BLOCK_ID = config.getOrCreateIntProperty("AzurLamp_BLOCK_ID", "BLOCKS", 2080).getInt(2080);
			DBlocksIDS.AzurLampON_BLOCK_ID = config.getOrCreateIntProperty("AzurLampON_BLOCK_ID", "BLOCKS", 2090).getInt(2090);
			DBlocksIDS.Amethyst_BLOCK_ID = config.getOrCreateIntProperty("Amethyst_BLOCK_ID", "BLOCKS", 2100).getInt(2100);
			DBlocksIDS.AmethystBlock_BLOCK_ID = config.getOrCreateIntProperty("AmethystBlock_BLOCK_ID", "BLOCKS", 2110).getInt(2110);
			DBlocksIDS.AmethystLamp_BLOCK_ID = config.getOrCreateIntProperty("AmethystLamp_BLOCK_ID", "BLOCKS", 2120).getInt(2120);
			DBlocksIDS.AmethystLampON_BLOCK_ID = config.getOrCreateIntProperty("AmethystLampON_BLOCK_ID", "BLOCKS", 2130).getInt(2130);
			DBlocksIDS.Citrine_BLOCK_ID = config.getOrCreateIntProperty("Citrine_BLOCK_ID", "BLOCKS", 2140).getInt(2140);
			DBlocksIDS.CitrineBlock_BLOCK_ID = config.getOrCreateIntProperty("CitrineBlock_BLOCK_ID", "BLOCKS", 2150).getInt(2150);
			DBlocksIDS.CitrineLamp_BLOCK_ID = config.getOrCreateIntProperty("CitrineLamp_BLOCK_ID", "BLOCKS", 2160).getInt(2160);
			DBlocksIDS.CitrineLampON_BLOCK_ID = config.getOrCreateIntProperty("CitrineLampON_BLOCK_ID", "BLOCKS", 2170).getInt(2170);
			DBlocksIDS.LavaStone_BLOCK_ID = config.getOrCreateIntProperty("LavaStone_BLOCK_ID", "BLOCKS", 2180).getInt(2180);
			
			

			DBlocksIDS.Topaz_BLOCK_ID = config.getOrCreateIntProperty("Topaz_BLOCK_ID", "BLOCKS", 2190).getInt(2190);
			DBlocksIDS.TopazBlock_BLOCK_ID = config.getOrCreateIntProperty("TopazBlock_BLOCK_ID", "BLOCKS", 2200).getInt(2210);
			DBlocksIDS.TopazLamp_BLOCK_ID = config.getOrCreateIntProperty("TopazLamp_BLOCK_ID", "BLOCKS", 2230).getInt(2220);
			DBlocksIDS.TopazLampON_BLOCK_ID = config.getOrCreateIntProperty("TopazLampON_BLOCK_ID", "BLOCKS", 2240).getInt(2240);
			
			

			DBlocksIDS.Peridot_BLOCK_ID = config.getOrCreateIntProperty("Peridot_BLOCK_ID", "BLOCKS", 2250).getInt(2250);
			DBlocksIDS.PeridotBlock_BLOCK_ID = config.getOrCreateIntProperty("PeridotBlock_BLOCK_ID", "BLOCKS", 2360).getInt(2360);
			DBlocksIDS.PeridotLamp_BLOCK_ID = config.getOrCreateIntProperty("PeridotLamp_BLOCK_ID", "BLOCKS", 2370).getInt(2370);
			DBlocksIDS.PeridotLampON_BLOCK_ID = config.getOrCreateIntProperty("PeridotLampON_BLOCK_ID", "BLOCKS", 2380).getInt(2380);
			
			

			DBlocksIDS.Aquamarine_BLOCK_ID = config.getOrCreateIntProperty("Aquamarine_BLOCK_ID", "BLOCKS", 2390).getInt(2390);
			DBlocksIDS.AquamarineBlock_BLOCK_ID = config.getOrCreateIntProperty("AquamarineBlock_BLOCK_ID", "BLOCKS", 2300).getInt(2310);
			DBlocksIDS.AquamarineLamp_BLOCK_ID = config.getOrCreateIntProperty("AquamarineLamp_BLOCK_ID", "BLOCKS", 2320).getInt(2320);
			DBlocksIDS.AquamarineLampON_BLOCK_ID = config.getOrCreateIntProperty("AquamarineLampON_BLOCK_ID", "BLOCKS", 2330).getInt(2330);
			
			
			
			DBlocksIDS.Grinder_Block_ID = config.getOrCreateIntProperty("Grinder_Block_ID", "BLOCKS", 2340).getInt(2340);

			DBlocksIDS.RecordPlayer_Block_ID = config.getOrCreateIntProperty("RecordPlayer_Block_ID", "BLOCKS", 2350).getInt(2350);
			
			
			
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
			
			DBlocksIDS.NetherTopaz_BLOCK_ID = config.getOrCreateIntProperty("NetherTopaz_BLOCK_ID", "BLOCKS", 420).getInt(420);
			
			DBlocksIDS.NetherPeridot_BLOCK_ID = config.getOrCreateIntProperty("NetherPeridot_BLOCK_ID", "BLOCKS", 421).getInt(421);
			
			DBlocksIDS.NetherAquamarine_BLOCK_ID = config.getOrCreateIntProperty("NetherAquamarine_BLOCK_ID", "BLOCKS", 422).getInt(422);
			

			DBlocksIDS.NetherCoal_BLOCK_ID = config.getOrCreateIntProperty("NetherCoal_BLOCK_ID", "BLOCKS", 400).getInt(400);
			DBlocksIDS.NetherIron_BLOCK_ID = config.getOrCreateIntProperty("NetherIron_BLOCK_ID", "BLOCKS", 401).getInt(401);
			DBlocksIDS.NetherGold_BLOCK_ID = config.getOrCreateIntProperty("NetherGold_BLOCK_ID", "BLOCKS", 402).getInt(402);
			DBlocksIDS.NetherRedStone_BLOCK_ID = config.getOrCreateIntProperty("NetherRedStone_BLOCK_ID", "BLOCKS", 403).getInt(403);
			DBlocksIDS.NetherDiamond_BLOCK_ID = config.getOrCreateIntProperty("NetherDiamond_BLOCK_ID", "BLOCKS", 404).getInt(404);
			
			
			
			
			
			//ITEMS---------------------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.AmethystShard_ID = config.getOrCreateIntProperty(" AmethystShard_ID", "ITEMS", 3000).getInt(3000);
			DBlocksIDS.AzurShard_ID = config.getOrCreateIntProperty(" AzurShard_ID", "ITEMS", 3001).getInt(3001);
			DBlocksIDS.CitrineShard_ID = config.getOrCreateIntProperty(" CitrineShard_ID", "ITEMS", 3002).getInt(3002);
			

			DBlocksIDS.TopazShard_ID = config.getOrCreateIntProperty(" TopazShard_ID", "ITEMS", 3003).getInt(3003);
			DBlocksIDS.PeridotShard_ID = config.getOrCreateIntProperty(" PeridotShard_ID", "ITEMS", 3004).getInt(3004);
			DBlocksIDS.AquamarineDust_ID = config.getOrCreateIntProperty(" AquamarineDust_ID", "ITEMS", 3005).getInt(3005);
			

			DBlocksIDS.TopazDust_ID = config.getOrCreateIntProperty(" TopazDust_ID", "ITEMS", 3006).getInt(3007);
			DBlocksIDS.PeridotDust_ID = config.getOrCreateIntProperty(" PeridotDust_ID", "ITEMS", 3008).getInt(3008);
			DBlocksIDS.AquamarineDust_ID = config.getOrCreateIntProperty(" AquamarineDust_ID", "ITEMS", 3009).getInt(3009);
			
			
			DBlocksIDS.AmethystDust_ID = config.getOrCreateIntProperty(" AmethystDust_ID", "ITEMS", 3010).getInt(3010);
			DBlocksIDS.AzurDust_ID = config.getOrCreateIntProperty(" AzurDust_ID", "ITEMS", 3011).getInt(3011);
			DBlocksIDS.CitrineDust_ID = config.getOrCreateIntProperty(" CitrineDust_ID", "ITEMS", 3012).getInt(3012);
			
			
			
			DBlocksIDS.TopazFragment_ID = config.getOrCreateIntProperty(" TopazFragment_ID", "ITEMS", 3013).getInt(3013);
			DBlocksIDS.PeridotFragment_ID = config.getOrCreateIntProperty(" PeridotFragment_ID", "ITEMS", 3014).getInt(3015);
			DBlocksIDS.AquamarineFragment_ID = config.getOrCreateIntProperty(" AquamarineFragment_ID", "ITEMS", 3016).getInt(3017);
			
			
			DBlocksIDS.AmethystFragment_ID = config.getOrCreateIntProperty(" AmethystFragment_ID", "ITEMS", 3018).getInt(3019);
			DBlocksIDS.AzurFragment_ID = config.getOrCreateIntProperty(" AzurFragment_ID", "ITEMS", 3020).getInt(3021);
			DBlocksIDS.CitrineFragment_ID = config.getOrCreateIntProperty(" CitrineFragment_ID", "ITEMS", 3022).getInt(3022);
			
			
			
			DBlocksIDS.Plank_ID = config.getOrCreateIntProperty(" Plank_ID", "ITEMS", 3024).getInt(3024);
			DBlocksIDS.WoodFrameStrip_ID = config.getOrCreateIntProperty(" WoodFrameStrip_ID", "ITEMS", 3025).getInt(3025);
			DBlocksIDS.WoodFrame_ID = config.getOrCreateIntProperty(" WoodFrame_ID", "ITEMS", 3026).getInt(3026);
			DBlocksIDS.LampFrame_ID = config.getOrCreateIntProperty(" LampFrame_ID", "ITEMS", 3027).getInt(3027);
			
			
			
			//DarkStone Tools-----------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.DSP_ID = config.getOrCreateIntProperty(" DSP_ID", "ITEMS", 3028).getInt(3028);
			DBlocksIDS.DSA_ID = config.getOrCreateIntProperty(" DSA_ID", "ITEMS", 3029).getInt(3029);
			DBlocksIDS.DSH_ID = config.getOrCreateIntProperty(" DSH_ID", "ITEMS", 3030).getInt(3030);
			DBlocksIDS.DSS_ID = config.getOrCreateIntProperty(" DSS_ID", "ITEMS", 3031).getInt(3031);
			DBlocksIDS.DSSw_ID = config.getOrCreateIntProperty(" DSSw_ID", "ITEMS", 3032).getInt(3032);
			
			
			
			
			//LightStone Tools----------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.LSP_ID = config.getOrCreateIntProperty(" LSP_ID", "ITEMS", 3033).getInt(3033);
			DBlocksIDS.LSA_ID = config.getOrCreateIntProperty(" LSA_ID", "ITEMS", 3034).getInt(3034);
			DBlocksIDS.LSH_ID = config.getOrCreateIntProperty(" LSH_ID", "ITEMS", 3035).getInt(3035);
			DBlocksIDS.LSS_ID = config.getOrCreateIntProperty(" LSS_ID", "ITEMS", 3036).getInt(3036);
			DBlocksIDS.LSSw_ID = config.getOrCreateIntProperty(" LSSw_ID", "ITEMS", 3037).getInt(3037);
			
			
			
		
		
		
		} 
		
		
		
		
		catch(Exception e) {
			FMLLog.log(Level.SEVERE, e, "[Error]DBlocks Cannot Load Config File!");
		}
		finally {
			config.save();
		}
	}

}
