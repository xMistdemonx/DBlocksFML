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
		switch(world.provider.worldType) {
		case -1: generateNether(world, random, chunkX * 16, chunkZ * 16); break;
		case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16); break;
		}


	}

//(Max y - min y) + min y
	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
		for (int i = 0; i < 55; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(7);
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.DarkStone_BLOCK_ID,  30).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 55; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64 - 60) + 60;
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.LightStone_BLOCK_ID, 30).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(10);
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.Azurite_BLOCK_ID, 16).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(10);
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.Citrine_BLOCK_ID, 16).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 30; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(10);
			int randPosZ = chunkZ + rand.nextInt(16);
			new WorldGenMinable(DBlocksIDS.Amethyst_BLOCK_ID, 16).generate(world, rand, randPosX, randPosY, randPosZ);
		}
	}

	public void generateNether(World world, Random rand, int chunkX, int chunkZ)
	{
		for (int i = 0; i < 20; i++)
		{
			int randPosX = chunkX + rand.nextInt(10);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(10);
			new WorldGenLavaStone(DBlocksIDS.LavaStone_BLOCK_ID, 20).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 8; i++)
		{
			int randPosX = chunkX + rand.nextInt(15);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(5);
			new WorldGenOre(DBlocksIDS.NetherCoal_BLOCK_ID, 10).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 6; i++)
		{
			int randPosX = chunkX + rand.nextInt(8);
			int randPosY = rand.nextInt(70);
			int randPosZ = chunkZ + rand.nextInt(11);
			new WorldGenOre(DBlocksIDS.NetherIron_BLOCK_ID, 9).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 5; i++)
		{
			int randPosX = chunkX + rand.nextInt(8);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(11);
			new WorldGenOre(DBlocksIDS.NetherGold_BLOCK_ID, 9).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 4; i++)
		{
			int randPosX = chunkX + rand.nextInt(3);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(3);
			new WorldGenOre(DBlocksIDS.NetherDiamond_BLOCK_ID, 6).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 5; i++)
		{
			int randPosX = chunkX + rand.nextInt(12);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(10);
			new WorldGenOre(DBlocksIDS.NetherRedStone_BLOCK_ID, 6).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 10; i++)
		{
			int randPosX = chunkX + rand.nextInt(15);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(10);
			new WorldGenOre(DBlocksIDS.NetherAzurite_BLOCK_ID, 10).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 10; i++)
		{
			int randPosX = chunkX + rand.nextInt(15);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(10);
			new WorldGenOre(DBlocksIDS.NetherCitrine_BLOCK_ID, 10).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		for (int i = 0; i < 10; i++)
		{
			int randPosX = chunkX + rand.nextInt(15);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(10);
			new WorldGenOre(DBlocksIDS.NetherAmethyst_BLOCK_ID, 10).generate(world, rand, randPosX, randPosY, randPosZ);
		}


	}


}








/*public class FireCraftWorldGenerator implements IWorldGenerator {
	private final WorldGenerator generator;
	private final int startY;
	private final int endY;
	private final int occurence;

	public FireCraftWorldGenerator(WorldGenerator generator, int startY, int endY, int occurence) {
		this.generator = generator;
		this.startY = startY;
		this.endY = endY;
		this.occurence = occurence;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.worldType) {
		case -1: generateNether(world, random, chunkX * 16, chunkZ * 16); break;
		case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16); break;
		}
	}

	private void generateNether(World world, Random random, int blockX, int blockZ) {}
	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		for (int i = 0; i < occurence; i++) {
			int xCoord = blockX + random.nextInt(16);
			int yCoord = random.nextInt(endY - startY) + startY;
			int zCoord = blockZ + random.nextInt(16);
			generator.generate(world, random, xCoord, yCoord, zCoord);
		}
	}
}*/