package DBlocks;

import net.minecraftforge.client.MinecraftForgeClient;
import DBlocks.Common.CommonProxy;



public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}
	
	
	
}