package DBlocks.Blocks;

import DBlocks.Common.DBlocksIDS;
import DBlocks.Tiles.TileRecordPlayer;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
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
	
	@Override
	public int getRenderType() {
		return DBlocksIDS.RecordPlayer_Render_ID;
	}
	
	@Override
	public int getBlockTextureFromSide(int side) 
	{
	return 3;
	}
 

	@Override
	public TileEntity createNewTileEntity(World var1) {
		// TODO Auto-generated method stub
		return new TileRecordPlayer();
	}

}