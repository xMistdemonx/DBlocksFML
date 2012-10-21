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
			
			
			
			//BLOCKS
			
			DBlocksIDS.TinOre_BLOCK_ID = config.get("BLOCKS", "TinOre_BLOCK_ID", 1997).getInt(1997);
			DBlocksIDS.CopperOre_BLOCK_ID = config.get("BLOCKS", "CopperOre_BLOCK_ID", 1998).getInt(1998);
			DBlocksIDS.SilverOre_BLOCK_ID = config.get("BLOCKS", "SilverOre_BLOCK_ID", 1999).getInt(1999);
			
			DBlocksIDS.DarkStone_BLOCK_ID = config.get("BLOCKS", "DarkStone_BLOCK_ID", 2000).getInt(2000);
			DBlocksIDS.DarkCobbleStone_BLOCK_ID = config.get("BLOCKS", "DarkCobbleStone_BLOCK_ID", 2010).getInt(2010);
			DBlocksIDS.DarkStoneBrick_BLOCK_ID = config.get("BLOCKS", "DarkStoneBrick_BLOCK_ID", 2020).getInt(2020);
			DBlocksIDS.LightStone_BLOCK_ID = config.get("BLOCKS", "LightStone_BLOCK_ID", 2030).getInt(2030);
			DBlocksIDS.LightCobbleStone_BLOCK_ID = config.get("BLOCKS", "LightCobbleStone_BLOCK_ID", 2040).getInt(2040);
			DBlocksIDS.LightStoneBrick_BLOCK_ID = config.get("BLOCKS", "LightStoneBrick_BLOCK_ID", 2050).getInt(2050);
			DBlocksIDS.Azurite_BLOCK_ID = config.get("BLOCKS", "Azurite_BLOCK_ID", 2060).getInt(2060);
			DBlocksIDS.AzurBlock_BLOCK_ID = config.get("BLOCKS", "AzurBlock_BLOCK_ID", 2070).getInt(2070);
			DBlocksIDS.AzurLamp_BLOCK_ID = config.get("BLOCKS", "AzurLamp_BLOCK_ID", 2080).getInt(2080);
			DBlocksIDS.AzurLampON_BLOCK_ID = config.get("BLOCKS", "AzurLampON_BLOCK_ID", 2090).getInt(2090);
			DBlocksIDS.Amethyst_BLOCK_ID = config.get("BLOCKS", "Amethyst_BLOCK_ID", 2100).getInt(2100);
			DBlocksIDS.AmethystBlock_BLOCK_ID = config.get("BLOCKS", "AmethystBlock_BLOCK_ID", 2110).getInt(2110);
			DBlocksIDS.AmethystLamp_BLOCK_ID = config.get("BLOCKS", "AmethystLamp_BLOCK_ID", 2120).getInt(2120);
			DBlocksIDS.AmethystLampON_BLOCK_ID = config.get("BLOCKS", "AmethystLampON_BLOCK_ID", 2130).getInt(2130);
			DBlocksIDS.Citrine_BLOCK_ID = config.get("BLOCKS", "Citrine_BLOCK_ID", 2140).getInt(2140);
			DBlocksIDS.CitrineBlock_BLOCK_ID = config.get("BLOCKS", "CitrineBlock_BLOCK_ID", 2150).getInt(2150);
			DBlocksIDS.CitrineLamp_BLOCK_ID = config.get("BLOCKS", "CitrineLamp_BLOCK_ID", 2160).getInt(2160);
			DBlocksIDS.CitrineLampON_BLOCK_ID = config.get("BLOCKS", "CitrineLampON_BLOCK_ID", 2170).getInt(2170);
			
			

			DBlocksIDS.Topaz_BLOCK_ID = config.get("BLOCKS", "Topaz_BLOCK_ID", 2190).getInt(2190);
			DBlocksIDS.TopazBlock_BLOCK_ID = config.get("BLOCKS", "TopazBlock_BLOCK_ID", 2210).getInt(2210);
			DBlocksIDS.TopazLamp_BLOCK_ID = config.get("BLOCKS", "TopazLamp_BLOCK_ID", 2220).getInt(2220);
			DBlocksIDS.TopazLampON_BLOCK_ID = config.get("BLOCKS", "TopazLampON_BLOCK_ID", 2230).getInt(2230);
			
			

			DBlocksIDS.Peridot_BLOCK_ID = config.get("BLOCKS", "Peridot_BLOCK_ID", 2240).getInt(2240);
			DBlocksIDS.PeridotBlock_BLOCK_ID = config.get("BLOCKS", "PeridotBlock_BLOCK_ID", 2350).getInt(2350);
			DBlocksIDS.PeridotLamp_BLOCK_ID = config.get("BLOCKS", "PeridotLamp_BLOCK_ID", 2360).getInt(2360);
			DBlocksIDS.PeridotLampON_BLOCK_ID = config.get("BLOCKS", "PeridotLampON_BLOCK_ID", 2370).getInt(2370);
			
			

			DBlocksIDS.Aquamarine_BLOCK_ID = config.get("BLOCKS", "Aquamarine_BLOCK_ID", 2380).getInt(2380);
			DBlocksIDS.AquamarineBlock_BLOCK_ID = config.get("BLOCKS", "AquamarineBlock_BLOCK_ID", 2390).getInt(2390);
			DBlocksIDS.AquamarineLamp_BLOCK_ID = config.get("BLOCKS", "AquamarineLamp_BLOCK_ID", 2310).getInt(2310);
			DBlocksIDS.AquamarineLampON_BLOCK_ID = config.get("BLOCKS", "AquamarineLampON_BLOCK_ID", 2320).getInt(2320);
			
			
			

			//DBlocksIDS.RecordPlayer_Block_ID = config.get("RecordPlayer_Block_ID", 2350).getInt(2350);
			
			
			
			//SLABZ----------------------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.DarkStoneSlab_ID = config.get("BLOCKS", "DarkStoneSlab_ID", 650).getInt(650);
			DBlocksIDS.DarkStoneDSlab_ID = config.get("BLOCKS", "DarkStoneDSlab_ID", 651).getInt(651);
			DBlocksIDS.DarkCobbleStoneSlab_ID = config.get("BLOCKS", "DarkCobbleStoneSlab_ID", 652).getInt(652);
			DBlocksIDS.DarkCobbleStoneDSlab_ID = config.get("BLOCKS", "DarkCobbleStoneDSlab_ID", 653).getInt(653);
			DBlocksIDS.DarkStoneBrickSlab_ID = config.get("BLOCKS", "DarkStoneBrickSlab_ID", 654).getInt(654);
			DBlocksIDS.DarkStoneBrickDSlab_ID = config.get("BLOCKS", "DarkStoneBrickDSlab_ID", 655).getInt(655);
			
			DBlocksIDS.LightStoneSlab_ID = config.get("BLOCKS", "LightStoneSlab_ID", 656).getInt(656);
			DBlocksIDS.LightStoneDSlab_ID = config.get("BLOCKS", "LightStoneDSlab_ID", 657).getInt(657);
			DBlocksIDS.LightCobbleStoneSlab_ID = config.get("BLOCKS", "LightCobbleStoneSlab_ID", 658).getInt(658);
			DBlocksIDS.LightCobbleStoneDSlab_ID = config.get("BLOCKS", "LightCobbleStoneDSlab_ID", 659).getInt(659);
			DBlocksIDS.LightStoneBrickSlab_ID = config.get("BLOCKS", "LightStoneBrickSlab_ID", 660).getInt(660);
			DBlocksIDS.LightStoneBrickDSlab_ID = config.get("BLOCKS", "LightStoneBrickDSlab_ID", 661).getInt(661);
			
			
			
			
			//Nether Blocks------------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.NetherAzurite_BLOCK_ID = config.get("BLOCKS", "NetherAzurite_BLOCK_ID", 417).getInt(717);
			DBlocksIDS.NetherAmethyst_BLOCK_ID = config.get("BLOCKS", "NetherAmethyst_BLOCK_ID", 418).getInt(718);
			DBlocksIDS.NetherCitrine_BLOCK_ID = config.get("BLOCKS", "NetherCitrine_BLOCK_ID", 419).getInt(719);
			
			DBlocksIDS.NetherTopaz_BLOCK_ID = config.get("BLOCKS", "NetherTopaz_BLOCK_ID", 420).getInt(420);
			DBlocksIDS.NetherPeridot_BLOCK_ID = config.get("BLOCKS", "NetherPeridot_BLOCK_ID", 421).getInt(421);
			DBlocksIDS.NetherAquamarine_BLOCK_ID = config.get("BLOCKS", "NetherAquamarine_BLOCK_ID", 422).getInt(422);
			
			
			
			
			
			//ITEMS---------------------------------------------------------------------------------------------------------------------------------------

			DBlocksIDS.dustTin_ID = config.get("ITEMS" ,"dustTin_ID", 2988).getInt(2988);
			DBlocksIDS.dustCopper_ID = config.get("ITEMS" ,"dustCopper_ID", 2989).getInt(2989);
			DBlocksIDS.dustSilver_ID = config.get("ITEMS" ,"dustSilver_ID", 2990).getInt(2990);
			
			
			DBlocksIDS.ingotTin_ID = config.get("ITEMS" ,"ingotTin_ID", 2991).getInt(2991);
			DBlocksIDS.ingotCopper_ID = config.get("ITEMS" ,"ingotCopper_ID", 2992).getInt(2992);
			DBlocksIDS.ingotSilver_ID = config.get("ITEMS" ,"ingotSilver_ID", 2993).getInt(2993);
			
			DBlocksIDS.AmethystGem_ID = config.get("ITEMS" ,"AmethystGem_ID", 2994).getInt(2994);
			DBlocksIDS.AzurGem_ID = config.get("ITEMS" ,"AzurGem_ID", 2995).getInt(2995);
			DBlocksIDS.CitrineGem_ID = config.get("ITEMS" ,"CitrineGem_ID", 2996).getInt(2996);
			DBlocksIDS.TopazGem_ID = config.get("ITEMS" ,"TopazGem_ID", 2997).getInt(2997);
			DBlocksIDS.PeridotGem_ID = config.get("ITEMS" ,"ParidotGem_ID", 2998).getInt(2998);
			DBlocksIDS.AquamarineGem_ID = config.get("ITEMS" ,"AquamarineGem_ID", 2999).getInt(2999);
			
			
			
			
			
			
			
			
			
			
			DBlocksIDS.AmethystShard_ID = config.get("ITEMS" ,"AmethystShard_ID", 3000).getInt(3000);
			DBlocksIDS.AzurShard_ID = config.get("ITEMS" ,"AzurShard_ID", 3001).getInt(3001);
			DBlocksIDS.CitrineShard_ID = config.get("ITEMS" ,"CitrineShard_ID", 3002).getInt(3002);
			

			DBlocksIDS.TopazShard_ID = config.get("ITEMS" ,"TopazShard_ID", 3003).getInt(3003);
			DBlocksIDS.PeridotShard_ID = config.get("ITEMS" ,"PeridotShard_ID", 3004).getInt(3004);
			DBlocksIDS.AquamarineShard_ID = config.get("ITEMS" ,"AquamarineShard_ID", 3005).getInt(3005);
			

			DBlocksIDS.TopazDust_ID = config.get("ITEMS" ,"TopazDust_ID", 3006).getInt(3007);
			DBlocksIDS.PeridotDust_ID = config.get("ITEMS" ,"PeridotDust_ID", 3008).getInt(3008);
			DBlocksIDS.AquamarineDust_ID = config.get("ITEMS" ,"AquamarineDust_ID", 3009).getInt(3009);
			
			
			DBlocksIDS.AmethystDust_ID = config.get("ITEMS" ,"AmethystDust_ID", 3010).getInt(3010);
			DBlocksIDS.AzurDust_ID = config.get("ITEMS" ,"AzurDust_ID", 3011).getInt(3011);
			DBlocksIDS.CitrineDust_ID = config.get("ITEMS" ,"CitrineDust_ID", 3012).getInt(3012);
			
			
			
			DBlocksIDS.TopazFragment_ID = config.get("ITEMS" ,"TopazFragment_ID", 3013).getInt(3013);
			DBlocksIDS.PeridotFragment_ID = config.get("ITEMS" ,"PeridotFragment_ID", 3014).getInt(3015);
			DBlocksIDS.AquamarineFragment_ID = config.get("ITEMS" ,"AquamarineFragment_ID", 3016).getInt(3017);
			
			
			DBlocksIDS.AmethystFragment_ID = config.get("ITEMS" ,"AmethystFragment_ID", 3018).getInt(3019);
			DBlocksIDS.AzurFragment_ID = config.get("ITEMS" ,"AzurFragment_ID", 3020).getInt(3021);
			DBlocksIDS.CitrineFragment_ID = config.get("ITEMS" ,"CitrineFragment_ID", 3022).getInt(3022);
			
			
			
			DBlocksIDS.Plank_ID = config.get("ITEMS" ,"Plank_ID", 3024).getInt(3024);
			DBlocksIDS.WoodFrameStrip_ID = config.get("ITEMS" ,"WoodFrameStrip_ID", 3025).getInt(3025);
			DBlocksIDS.WoodFrame_ID = config.get("ITEMS" ,"WoodFrame_ID", 3026).getInt(3026);
			DBlocksIDS.LampFrame_ID = config.get("ITEMS" ,"LampFrame_ID", 3027).getInt(3027);
			
			
			
			//DarkStone Tools-----------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.DSP_ID = config.get("ITEMS" ,"DSP_ID", 3028).getInt(3028);
			DBlocksIDS.DSA_ID = config.get("ITEMS" ,"DSA_ID", 3029).getInt(3029);
			DBlocksIDS.DSH_ID = config.get("ITEMS" ,"DSH_ID", 3030).getInt(3030);
			DBlocksIDS.DSS_ID = config.get("ITEMS" ,"DSS_ID", 3031).getInt(3031);
			DBlocksIDS.DSSw_ID = config.get("ITEMS" ,"DSSw_ID", 3032).getInt(3032);
			
			
			
			
			//LightStone Tools----------------------------------------------------------------------------------------------------------------------------
			DBlocksIDS.LSP_ID = config.get("ITEMS" ,"LSP_ID", 3033).getInt(3033);
			DBlocksIDS.LSA_ID = config.get("ITEMS" ,"LSA_ID", 3034).getInt(3034);
			DBlocksIDS.LSH_ID = config.get("ITEMS" ,"LSH_ID", 3035).getInt(3035);
			DBlocksIDS.LSS_ID = config.get("ITEMS" ,"LSS_ID", 3036).getInt(3036);
			DBlocksIDS.LSSw_ID = config.get("ITEMS" ,"LSSw_ID", 3037).getInt(3037);
			
			
			
			
			DBlocksIDS.AzurPick_ID = config.get("ITEMS" ,"AzurPick_ID", 4001).getInt(4001);
			DBlocksIDS.AzurAxe_ID = config.get("ITEMS" ,"AzurAxe_ID", 4002).getInt(4002);
			DBlocksIDS.AzurHoe_ID = config.get("ITEMS" ,"AzurHoe_ID", 4003).getInt(4003);
			DBlocksIDS.AzurSpade_ID = config.get("ITEMS" ,"AzurSpade_ID", 4004).getInt(4004);
			DBlocksIDS.AzurSword_ID = config.get("ITEMS" ,"AzurSword_ID", 4005).getInt(4005);
			
			DBlocksIDS.AmethystPick_ID = config.get("ITEMS" ,"AmethystPick_ID", 4006).getInt(4006);
			DBlocksIDS.AmethystAxe_ID = config.get("ITEMS" ,"AmethystAxe_ID", 4007).getInt(4007);
			DBlocksIDS.AmethystHoe_ID = config.get("ITEMS" ,"AmethystHoe_ID", 4008).getInt(4008);
			DBlocksIDS.AmethystSpade_ID = config.get("ITEMS" ,"AmethystSpade_ID", 4009).getInt(4009);
			DBlocksIDS.AmethystSword_ID = config.get("ITEMS" ,"AmethystSword_ID", 4010).getInt(4010);
			
			DBlocksIDS.CitrinePick_ID = config.get("ITEMS" ,"CitrinePick_ID", 4011).getInt(4011);
			DBlocksIDS.CitrineAxe_ID = config.get("ITEMS" ,"CitrineAxe_ID", 4012).getInt(4012);
			DBlocksIDS.CitrineHoe_ID = config.get("ITEMS" ,"CitrineHoe_ID", 4013).getInt(4013);
			DBlocksIDS.CitrineSpade_ID = config.get("ITEMS" ,"CitrineSpade_ID", 4014).getInt(4014);
			DBlocksIDS.CitrineSword_ID = config.get("ITEMS" ,"CitrineSword_ID", 4015).getInt(4015);
		//----------------------------------------------------------------------------------------
			DBlocksIDS.TopazPick_ID = config.get("ITEMS" ,"TopazPick_ID", 4016).getInt(4016);
			DBlocksIDS.TopazAxe_ID = config.get("ITEMS" ,"TopazAxe_ID", 4017).getInt(4017);
			DBlocksIDS.TopazHoe_ID = config.get("ITEMS" ,"TopazHoe_ID", 4018).getInt(4018);
			DBlocksIDS.TopazSpade_ID = config.get("ITEMS" ,"TopazSpade_ID", 4019).getInt(4019);
			DBlocksIDS.TopazSword_ID = config.get("ITEMS" ,"TopazSword_ID", 4020).getInt(4020);
			
			DBlocksIDS.PeridotPick_ID = config.get("ITEMS" ,"PeridotPick_ID", 4021).getInt(4021);
			DBlocksIDS.PeridotAxe_ID = config.get("ITEMS" ,"PeridotAxe_ID", 4022).getInt(4022);
			DBlocksIDS.PeridotHoe_ID = config.get("ITEMS" ,"PeridotHoe_ID", 4023).getInt(4023);
			DBlocksIDS.PeridotSpade_ID = config.get("ITEMS" ,"PeridotSpade_ID", 4024).getInt(4024);
			DBlocksIDS.PeridotSword_ID = config.get("ITEMS" ,"PeridotSword_ID", 4025).getInt(4025);
			
			DBlocksIDS.AquamarinePick_ID = config.get("ITEMS" ,"AquamarinePick_ID", 4026).getInt(4026);
			DBlocksIDS.AquamarineAxe_ID = config.get("ITEMS" ,"AquamarineAxe_ID", 4027).getInt(4027);
			DBlocksIDS.AquamarineHoe_ID = config.get("ITEMS" ,"AquamarineHoe_ID", 4028).getInt(4028);
			DBlocksIDS.AquamarineSpade_ID = config.get("ITEMS" ,"AquamarineSpade_ID", 4029).getInt(4029);
			DBlocksIDS.AquamarineSword_ID = config.get("ITEMS" ,"AquamarineSword_ID", 4030).getInt(4030);
			
			

			
			
			
		
		
		
		} 
		
		
		
		
		catch(Exception e) {
			FMLLog.log(Level.SEVERE, e, "[Error]DBlocks Cannot Load Config File!");
		}
		finally {
			config.save();
		}
	}

}
