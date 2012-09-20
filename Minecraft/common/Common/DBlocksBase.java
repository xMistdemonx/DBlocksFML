package DBlocks.Common;

import DBlocks.Blocks.DBlocksReg;
import DBlocks.Handlers.ConfigHandler;
import DBlocks.Items.DBlocksItemReg;
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


@Mod(modid="DBlocks", name="DBlocks", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class DBlocksBase {
	

        // The instance of your mod that Forge uses.
	@Instance("DBlocks")
	public static DBlocksBase instance;
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="DBlocks.ClientProxy", serverSide="DBlocks.common.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// Stub Method
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
	}
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		DBlocksReg.Init();
		DBlocksItemReg.Init();
		Recipes.Init();
		
		
	}
																					
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
		
	}
}