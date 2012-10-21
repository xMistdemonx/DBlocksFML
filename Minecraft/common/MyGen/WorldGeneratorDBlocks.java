package DBlocks.MyGen;

import java.util.Random;

import DBlocks.Blocks.DBlocksReg;
import DBlocks.Common.DBlocksIDS;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorDBlocks implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId) {
		case -1: generateNether(world, random, chunkX * 16, chunkZ * 16); break;
		case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16); break;
		}


	}

//(Max y - min y) + min y
	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
		for (int i = 0; i < 20; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(45);
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.TinOre_BLOCK_ID,  7).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 25; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(55);
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.CopperOre_BLOCK_ID,  8).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 15; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(35);
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.SilverOre_BLOCK_ID,  5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 55; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(6);
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.DarkStone_BLOCK_ID,  50).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 55; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128 - 50) + 50;
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.LightStone_BLOCK_ID, 50).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.Azurite_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.Citrine_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.Amethyst_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
			}
			for (int i = 0; i < 30; i++)
			{
				int randPosX = chunkX + rand.nextInt(16);
				int randPosY = rand.nextInt(128);
				int randPosZ = chunkZ + rand.nextInt(16);
				new WorldGenMinable(DBlocksIDS.Topaz_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
			}
			for (int i = 0; i < 30; i++)
			{
				int randPosX = chunkX + rand.nextInt(16);
				int randPosY = rand.nextInt(128);
				int randPosZ = chunkZ + rand.nextInt(16);
				new WorldGenMinable(DBlocksIDS.Aquamarine_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
			}
			for (int i = 0; i < 30; i++)
			{
				int randPosX = chunkX + rand.nextInt(16);
				int randPosY = rand.nextInt(128);
				int randPosZ = chunkZ + rand.nextInt(16);
				new WorldGenMinable(DBlocksIDS.Peridot_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
			}
			
			
		}
	

	public void generateNether(World world, Random rand, int chunkX, int chunkZ)
	{
		
		
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(15);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(10);
			new WorldGenOre(DBlocksIDS.NetherAzurite_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(15);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(10);
			new WorldGenOre(DBlocksIDS.NetherCitrine_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(15);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(10);
			new WorldGenOre(DBlocksIDS.NetherAmethyst_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(15);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(10);
			new WorldGenOre(DBlocksIDS.NetherTopaz_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(15);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(10);
			new WorldGenOre(DBlocksIDS.NetherAquamarine_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(15);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(10);
			new WorldGenOre(DBlocksIDS.NetherPeridot_BLOCK_ID, 5).generate(world, rand, randPosX, randPosY, randPosZ);
		}

																																																																																																																																																																																																																																																																																																																		
	}


}