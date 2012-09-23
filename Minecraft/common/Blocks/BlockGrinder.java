package DBlocks.Blocks;

import DBlocks.Common.DBlocksIDS;
import DBlocks.Tiles.TileGrinder;
import net.minecraft.src.BlockContainer;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

public class BlockGrinder extends BlockContainer {

	public BlockGrinder(int id) {
		super(id, Material.ground);
		setHardness(1.0F);
		setBlockName("Grinder");
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
		return DBlocksIDS.Grinder_Render_ID;
	}
	
	@Override
	public int getBlockTextureFromSide(int side) 
	{
	return 2;
	}
 

	@Override
	public TileEntity createNewTileEntity(World var1) {
		// TODO Auto-generated method stub
		return new TileGrinder();
	}

}
