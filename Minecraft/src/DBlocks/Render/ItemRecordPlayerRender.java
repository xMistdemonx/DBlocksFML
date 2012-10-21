/*package DBlocks.Render;

import org.lwjgl.opengl.GL11;

import DBlocks.Models.ModelRecordPlayer;
import net.minecraft.src.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class ItemRecordPlayerRender implements IItemRenderer {

	public ModelRecordPlayer recordPlayer = new ModelRecordPlayer();
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		// TODO Auto-generated method stub
		switch(type) {
		case EQUIPPED: renderRecordPlayer(1F, 1F, 1F, true, 1F, false); break;
		case INVENTORY: renderRecordPlayer(7F, 1F, 1F, false, 9F, true); break;
		case ENTITY: renderRecordPlayer(0.0F, 1.5F, 0.0F, true, 1F, false); break;
		case FIRST_PERSON_MAP: renderRecordPlayer(0.0F, 0.0F, 0.0F, true, 1F, false); break;
		default: break;
		}
		
	}
	
	public void renderRecordPlayer(float tx, float ty, float tz, boolean flip, float scale, boolean inv) {
		ForgeHooksClient.bindTexture("/DBlocks/RecordPlayer.png", 0);
		GL11.glPushMatrix();
		GL11.glTranslatef(tx, ty, tz);
		GL11.glScalef(scale, scale, scale);
		if(flip)
			GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
		if(inv) {
			GL11.glRotatef(-45F, 0F, 1F, 0F);
		}
			
		recordPlayer.render();
		GL11.glPopMatrix();
	}
	
}*/
