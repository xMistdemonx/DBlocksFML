package DBlocks.Blocks;

import DBlocks.Common.DBlocksIDS;
import DBlocks.Tiles.TileRecordPlayer;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntityRecordPlayer;
import net.minecraft.src.World;

public class RecordPlayer extends BlockContainer {

	public RecordPlayer(int id) {
		super(id, Material.ground);
		setHardness(1.0F);
		setBlockName("Record Player");
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	/*public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if(world.isRemote) {
			return true;
		} else {
			player.sendChatToPlayer(player.getItemInUse().getItemName());
		}
		
		return true;
	}*/
	
	

	@Override
	public int getRenderType() {
		return DBlocksIDS.RecordPlayer_Render_ID;
	}

	@Override
	public int getBlockTextureFromSide(int side) {
		return 3;
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileRecordPlayer();
	}

}