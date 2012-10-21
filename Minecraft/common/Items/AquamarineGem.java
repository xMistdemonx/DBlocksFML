package DBlocks.Items;

import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.asm.SideOnly;
import DBlocks.Common.CommonProxy;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLightningBolt;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.World;





public class AquamarineGem extends Item
{
	//@SidedProxy(clientSide="DBlocks.ClientProxy", serverSide="DBlocks.common.CommonProxy")
	//public static CommonProxy proxy;
		
        public AquamarineGem(int par1)
        {
                super(par1);
              
              setTextureFile(CommonProxy.ITEMS_PNG);
              setItemName("Aquamarine Gem");
              setIconCoord(5, 3);
              setCreativeTab(CreativeTabs.tabMaterials);
              setMaxStackSize(64);
             
        }
        
       /* public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
        	ItemStack k = itemstack;
        	if (world.isRemote) {
        		//player.sendChatToPlayer("Right Click With Amethyst Shard!");
        		VectorHelper objPos = proxy.rayTraceBlock(player, 200D, 2F);
        		Random rand = new Random();
        		
        		
        		if(objPos.getIsBlockThere()) {
        			//player.sendChatToPlayer("X = " + objPos.getX() + " Y = " + objPos.getY() + " Z = " + objPos.getZ());
        																																																																																										
        			world.addWeatherEffect(new EntityLightningBolt(world, objPos.getX(), objPos.getY(), objPos.getZ()));
        			
        			world.spawnParticle("hugeexplosion", objPos.getX() + 0.5D, objPos.getY() + 1D, objPos.getZ() + 0.5D, 0D, 0D, 0D);
        			
        			world.spawnParticle("hugeexplosion", objPos.getX(), objPos.getY() + 1D, objPos.getZ(), 0D, 0D, 0D);
        			world.spawnParticle("hugeexplosion", objPos.getX() + 1D, objPos.getY() + 1D, objPos.getZ() + 0.5D, 0D, 0D, 0D);
        			world.spawnParticle("hugeexplosion", objPos.getX(), objPos.getY() + 1D, objPos.getZ() + 1D, 0D, 0D, 0D);
        			world.spawnParticle("hugeexplosion", objPos.getX() + 1D, objPos.getY() + 1D, objPos.getZ() + 1D, 0D, 0D, 0D);
        			
        			world.spawnParticle("hugeexplosion", objPos.getX() + rand.nextDouble(), objPos.getY() + 1D, objPos.getZ() + rand.nextDouble(), 0D, 0D, 0D);
        			
        			//player.addVelocity(2,  0,  2);
        			
        			//0 = West Z+1
        			//1 = North X-1
        			//2 = East Z-1
        			//3 = South X+1
        			
        			int looking = MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        			switch(looking) {
        			//case 0:player.addVelocity(0D, 0D, 1D);
        			//case 1:player.addVelocity(-1D, 0D, 0D);
        			//case 2:player.addVelocity(0D, 0D, -1D);
        			//case 3:player.addVelocity(1D, 0D, 0D);
        			}
        			//1200 ticks = 1 min
        			
        		} else {
        			player.sendChatToPlayer("No Block In Range!");
        		}
        		
        	} else {
        		VectorHelper objPos = proxy.rayTraceBlock(player, 200D, 2F);
        		//if(player.)
        		k.damageItem(1, player);
        		if(k.getItemDamage() > k.getMaxDamage()) {
        			k.stackSize--;
        		}
        		player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 1200, 5));
        		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1200, 10));
        		

    			//player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 50));
    			//player.addPotionEffect(new PotionEffect(Potion.jump.id, 1200, 5));
        	}
        	
        	return k;
        }*/
        

        
        
        
        @SideOnly(Side.CLIENT)
        public boolean hasEffect(ItemStack par1ItemStack)
        {
            return true;
        }

        @SideOnly(Side.CLIENT)

        /**
         * Return an item rarity from EnumRarity
         */
        public EnumRarity getRarity(ItemStack par1ItemStack)
        {
            return EnumRarity.rare;
        }
}	