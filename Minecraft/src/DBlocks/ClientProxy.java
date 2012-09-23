package DBlocks;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
import DBlocks.Render.RenderGrinder;
import DBlocks.Render.RenderRecordPlayer;
import DBlocks.Tiles.TileGrinder;
import DBlocks.Tiles.TileRecordPlayer;



public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}
	
	@Override
	public void initTiles() {
		//Render ID
		DBlocksIDS.Grinder_Render_ID = RenderingRegistry.getNextAvailableRenderId();
		DBlocksIDS.RecordPlayer_Render_ID = RenderingRegistry.getNextAvailableRenderId();
		
		
		
		//Bind Renderer
		ClientRegistry.bindTileEntitySpecialRenderer(TileGrinder.class, new RenderGrinder());
		ClientRegistry.bindTileEntitySpecialRenderer(TileRecordPlayer.class, new RenderRecordPlayer());
		
		
		
		//Bind Tile Entity
		ClientRegistry.registerTileEntity(TileGrinder.class, "tileGrinder", new RenderGrinder());
		ClientRegistry.registerTileEntity(TileRecordPlayer.class, "tileRecordPlayer", new RenderRecordPlayer());
	}
	
	
	
}