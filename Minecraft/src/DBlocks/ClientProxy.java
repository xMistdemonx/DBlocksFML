package DBlocks;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3;
import net.minecraftforge.client.MinecraftForgeClient;
import DBlocks.Common.CommonProxy;
import DBlocks.Common.DBlocksIDS;
//import DBlocks.Render.ItemRecordPlayerRender;
//import DBlocks.Render.RenderRecordPlayer;
//import DBlocks.Tiles.TileRecordPlayer;



public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}
	
	@Override
	public void initTiles() {
		//Render ID
		//DBlocksIDS.RecordPlayer_Render_ID = RenderingRegistry.getNextAvailableRenderId();
		
		
		
		//Bind Renderer
		//ClientRegistry.bindTileEntitySpecialRenderer(TileRecordPlayer.class, new RenderRecordPlayer());
		
		
		
		//Bind Tile Entity
		//ClientRegistry.registerTileEntity(TileRecordPlayer.class, "tileRecordPlayer", new RenderRecordPlayer());
		
		//ItemRender
		//MinecraftForgeClient.registerItemRenderer(DBlocksIDS.RecordPlayer_Block_ID, new ItemRecordPlayerRender());
	}
	
	
	
}