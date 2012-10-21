package DBlocks.Common;

import DBlocks.Blocks.DBlocksReg;
import DBlocks.GemTools.GemToolsReg;
import DBlocks.Handlers.ConfigHandler;
import DBlocks.Items.DBlocksItemReg;
import DBlocks.MyGen.WorldGeneratorDBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid="DBlocks", name="DBlocks", version="0.1.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class DBlocksBase {
	

        // The instance of your mod that Forge uses.
	@Instance("DBlocks")
	public static DBlocksBase instance;
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="DBlocks.ClientProxy", serverSide="DBlocks.Common.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
	}
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		DBlocksReg.Init();
		DBlocksItemReg.Init();
		GemToolsReg.Init();
		Recipes.Init();
		GemToolRecipes.Init();
		GameRegistry.registerWorldGenerator(new WorldGeneratorDBlocks());
		
		//Proxy stuff
		proxy.registerRenderers();
		proxy.initTiles();
		
	}
																					
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
	
		if(Loader.isModLoaded("IC2")) {
			RecipesIC2.Init();
		}else{
			Smelting.Init();
		}
	}
}