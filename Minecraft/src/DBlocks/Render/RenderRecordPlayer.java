package DBlocks.Render;

import org.lwjgl.opengl.GL11;

import DBlocks.Models.ModelRecordPlayer;

import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntitySpecialRenderer;
import net.minecraftforge.client.ForgeHooksClient;

public class RenderRecordPlayer extends TileEntitySpecialRenderer {
	public ModelRecordPlayer recordplayer = new ModelRecordPlayer();

	@Override
	public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float var8) {
		
		GL11.glPushMatrix();
		GL11.glTranslated(x  + 0.5, y + 1.5, z + 0.5);
		GL11.glRotatef(180F, 1.0F, 0F, 0F);
		ForgeHooksClient.bindTexture("/DBlocks/RecordPlayer.png", 0);
		recordplayer.render((float)x, (float)y, (float)z);
		GL11.glPopMatrix();
	}
	

}