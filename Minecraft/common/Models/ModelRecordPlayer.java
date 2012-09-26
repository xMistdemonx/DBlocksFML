package DBlocks.Models;

import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelRecordPlayer extends ModelBase
{

	
	  //fields
    ModelRenderer LegFrontLeft1;
    ModelRenderer LegBackLeft1;
    ModelRenderer LegFrontRight1;
    ModelRenderer LegBackRight2;
    ModelRenderer LegBackRight1;
    ModelRenderer LegBackLeft2;
    ModelRenderer LegFrontRight2;
    ModelRenderer LegFrontLeft2;
    ModelRenderer PlayerBack;
    ModelRenderer PlayerLeft;
    ModelRenderer PalyerRight;
    ModelRenderer NeedleArm2;
    ModelRenderer PlayerBottem;
    ModelRenderer LidLeft;
    ModelRenderer PlayerFront;
    ModelRenderer LidFront;
    ModelRenderer LidRight;
    ModelRenderer LidMiddle;
    ModelRenderer LidBack;
    ModelRenderer TrayBase;
    ModelRenderer TrayEye;
    ModelRenderer ArmBase;
    ModelRenderer Tray;
    ModelRenderer ArmBase2;
    ModelRenderer NeddleArm;
    ModelRenderer Knob1;
    ModelRenderer Knob2;
    
  
    public ModelRecordPlayer()
    {
      textureWidth = 64;
      textureHeight = 64;
      
        LegFrontLeft1 = new ModelRenderer(this, 0, 0);
        LegFrontLeft1.addBox(-1F, 0F, -1F, 2, 4, 2);
        LegFrontLeft1.setRotationPoint(6.5F, 20F, 6.5F);
        LegFrontLeft1.setTextureSize(64, 64);
        LegFrontLeft1.mirror = true;
        setRotation(LegFrontLeft1, 0F, 0F, 0F);
        LegBackLeft1 = new ModelRenderer(this, 0, 0);
        LegBackLeft1.addBox(-1F, 0F, -1F, 2, 4, 2);
        LegBackLeft1.setRotationPoint(6.5F, 20F, -6.5F);
        LegBackLeft1.setTextureSize(64, 64);
        LegBackLeft1.mirror = true;
        setRotation(LegBackLeft1, 0F, 0F, 0F);
        LegFrontRight1 = new ModelRenderer(this, 0, 0);
        LegFrontRight1.addBox(-1F, 0F, -1F, 2, 4, 2);
        LegFrontRight1.setRotationPoint(-6.5F, 20F, 6.5F);
        LegFrontRight1.setTextureSize(64, 64);
        LegFrontRight1.mirror = true;
        setRotation(LegFrontRight1, 0F, 0F, 0F);
        LegBackRight2 = new ModelRenderer(this, 0, 0);
        LegBackRight2.addBox(-1F, 0F, -1F, 2, 4, 2);
        LegBackRight2.setRotationPoint(-6.5F, 20F, -6.5F);
        LegBackRight2.setTextureSize(64, 64);
        LegBackRight2.mirror = true;
        setRotation(LegBackRight2, 0F, 0F, 0F);
        LegBackRight1 = new ModelRenderer(this, 0, 0);
        LegBackRight1.addBox(-1F, 0F, -1F, 2, 4, 2);
        LegBackRight1.setRotationPoint(-6.5F, 20F, -6.5F);
        LegBackRight1.setTextureSize(64, 64);
        LegBackRight1.mirror = true;
        setRotation(LegBackRight1, 0F, 0.7853982F, 0F);
        LegBackLeft2 = new ModelRenderer(this, 0, 0);
        LegBackLeft2.addBox(-1F, 0F, -1F, 2, 4, 2);
        LegBackLeft2.setRotationPoint(6.5F, 20F, -6.5F);
        LegBackLeft2.setTextureSize(64, 64);
        LegBackLeft2.mirror = true;
        setRotation(LegBackLeft2, 0F, 0.7853982F, 0F);
        LegFrontRight2 = new ModelRenderer(this, 0, 0);
        LegFrontRight2.addBox(-1F, 0F, -1F, 2, 4, 2);
        LegFrontRight2.setRotationPoint(-6.5F, 20F, 6.5F);
        LegFrontRight2.setTextureSize(64, 64);
        LegFrontRight2.mirror = true;
        setRotation(LegFrontRight2, 0F, 0.7853982F, 0F);
        LegFrontLeft2 = new ModelRenderer(this, 0, 0);
        LegFrontLeft2.addBox(-1F, 0F, -1F, 2, 4, 2);
        LegFrontLeft2.setRotationPoint(6.5F, 20F, 6.5F);
        LegFrontLeft2.setTextureSize(64, 64);
        LegFrontLeft2.mirror = true;
        setRotation(LegFrontLeft2, 0F, 0.7853982F, 0F);
        PlayerBack = new ModelRenderer(this, 0, 18);
        PlayerBack.addBox(0F, 0F, 0F, 16, 12, 1);
        PlayerBack.setRotationPoint(-8F, 8F, -8F);
        PlayerBack.setTextureSize(64, 64);
        PlayerBack.mirror = true;
        setRotation(PlayerBack, 0F, 0F, 0F);
        PlayerLeft = new ModelRenderer(this, 0, 18);
        PlayerLeft.addBox(0F, 0F, 0F, 16, 12, 1);
        PlayerLeft.setRotationPoint(7F, 8F, 8F);
        PlayerLeft.setTextureSize(64, 64);
        PlayerLeft.mirror = true;
        setRotation(PlayerLeft, 0F, 1.579523F, 0F);
        PalyerRight = new ModelRenderer(this, 0, 18);
        PalyerRight.addBox(0F, 0F, 0F, 16, 12, 1);
        PalyerRight.setRotationPoint(-8F, 8F, 8F);
        PalyerRight.setTextureSize(64, 64);
        PalyerRight.mirror = true;
        setRotation(PalyerRight, 0F, 1.579523F, 0F);
        NeedleArm2 = new ModelRenderer(this, 0, 12);
        NeedleArm2.addBox(-1F, -4F, 5.7F, 1, 1, 4);
        NeedleArm2.setRotationPoint(-7F, 11.5F, -8.2F);
        NeedleArm2.setTextureSize(64, 64);
        NeedleArm2.mirror = true;
        setRotation(NeedleArm2, 0F, 0.9294653F, 0F);
        PlayerBottem = new ModelRenderer(this, 0, 31);
        PlayerBottem.addBox(0F, 0F, 0F, 14, 1, 14);
        PlayerBottem.setRotationPoint(-7F, 19F, -7F);
        PlayerBottem.setTextureSize(64, 64);
        PlayerBottem.mirror = true;
        setRotation(PlayerBottem, 0F, 0F, 0F);
        LidLeft = new ModelRenderer(this, 0, 47);
        LidLeft.addBox(7F, 0F, 0F, 1, 1, 16);
        LidLeft.setRotationPoint(0F, 7F, -8F);
        LidLeft.setTextureSize(64, 64);
        LidLeft.mirror = true;
        setRotation(LidLeft, 0.6320364F, 0F, 0F);
        PlayerFront = new ModelRenderer(this, 0, 18);
        PlayerFront.addBox(0F, 0F, 0F, 16, 12, 1);
        PlayerFront.setRotationPoint(-8F, 8F, 7F);
        PlayerFront.setTextureSize(64, 64);
        PlayerFront.mirror = true;
        setRotation(PlayerFront, 0F, 0F, 0F);
        LidFront = new ModelRenderer(this, 0, 50);
        LidFront.addBox(-7F, 0F, 15F, 14, 1, 1);
        LidFront.setRotationPoint(0F, 7F, -8F);
        LidFront.setTextureSize(64, 64);
        LidFront.mirror = true;
        setRotation(LidFront, 0.6320364F, 0F, 0F);
        LidRight = new ModelRenderer(this, 0, 47);
        LidRight.addBox(-8F, 0F, 0F, 1, 1, 16);
        LidRight.setRotationPoint(0F, 7F, -8F);
        LidRight.setTextureSize(64, 64);
        LidRight.mirror = true;
        setRotation(LidRight, 0.6320364F, 0F, 0F);
        LidMiddle = new ModelRenderer(this, 0, 31);
        LidMiddle.addBox(-7F, -1F, 1F, 14, 2, 14);
        LidMiddle.setRotationPoint(0F, 7F, -8F);
        LidMiddle.setTextureSize(64, 64);
        LidMiddle.mirror = true;
        setRotation(LidMiddle, 0.6320364F, 0F, 0F);
        LidBack = new ModelRenderer(this, 0, 48);
        LidBack.addBox(-8F, 0F, 0F, 16, 1, 1);
        LidBack.setRotationPoint(0F, 7F, -8F);
        LidBack.setTextureSize(64, 64);
        LidBack.mirror = true;
        setRotation(LidBack, 0.6320364F, 0F, 0F);
        TrayBase = new ModelRenderer(this, 0, 31);
        TrayBase.addBox(0F, 0F, 0F, 14, 1, 14);
        TrayBase.setRotationPoint(-7F, 10F, -7F);
        TrayBase.setTextureSize(64, 64);
        TrayBase.mirror = true;
        setRotation(TrayBase, 0F, 0F, 0F);
        TrayEye = new ModelRenderer(this, 0, 8);
        TrayEye.addBox(-1F, -6F, -1F, 1, 1, 1);
        TrayEye.setRotationPoint(1F, 14.5F, 0F);
        TrayEye.setTextureSize(64, 64);
        TrayEye.mirror = true;
        setRotation(TrayEye, 0F, 0.7853982F, 0F);
        ArmBase = new ModelRenderer(this, 35, 28);
        ArmBase.addBox(-2F, 0F, -2F, 2, 1, 2);
        ArmBase.setRotationPoint(-5F, 9F, -5F);
        ArmBase.setTextureSize(64, 64);
        ArmBase.mirror = true;
        setRotation(ArmBase, 0F, 0F, 0F);
        Tray = new ModelRenderer(this, 32, 8);
        Tray.addBox(-4F, 0F, -4F, 8, 1, 8);
        Tray.setRotationPoint(0F, 9F, 0F);
        Tray.setTextureSize(64, 64);
        Tray.mirror = true;
        setRotation(Tray, 0F, 0.7853982F, 0F);
        ArmBase2 = new ModelRenderer(this, 35, 24);
        ArmBase2.addBox(-2F, 0F, -2F, 1, 2, 1);
        ArmBase2.setRotationPoint(-5F, 8.5F, -5F);
        ArmBase2.setTextureSize(64, 64);
        ArmBase2.mirror = true;
        setRotation(ArmBase2, 0F, 0F, 0F);
        NeddleArm = new ModelRenderer(this, 37, 58);
        NeddleArm.addBox(-1F, -4F, 9F, 1, 1, 5);
        NeddleArm.setRotationPoint(-15F, 11.5F, -11F);
        NeddleArm.setTextureSize(64, 64);
        NeddleArm.mirror = true;
        setRotation(NeddleArm, 0F, 1.115358F, 0F);
        Knob1 = new ModelRenderer(this, 10, 4);
        Knob1.addBox(0F, -5F, 0F, 1, 1, 1);
        Knob1.setRotationPoint(5F, 14.5F, 3F);
        Knob1.setTextureSize(64, 64);
        Knob1.mirror = true;
        setRotation(Knob1, 0F, 0F, 0F);
        Knob2 = new ModelRenderer(this, 10, 4);
        Knob2.addBox(0F, -5F, 0F, 1, 1, 1);
        Knob2.setRotationPoint(5F, 14.5F, 5F);
        Knob2.setTextureSize(64, 64);
        Knob2.mirror = true;
        setRotation(Knob2, 0F, 0F, 0F);
    }
  
  float f5;
  public void render(float x, float y, float z, float i)
  {
	f5 = 0.0625F;
    LegFrontLeft1.render(f5);
    LegBackLeft1.render(f5);
    LegFrontRight1.render(f5);
    LegBackRight2.render(f5);
    LegBackRight1.render(f5);
    LegBackLeft2.render(f5);
    LegFrontRight2.render(f5);
    LegFrontLeft2.render(f5);
    PlayerBack.render(f5);
    PlayerLeft.render(f5);
    PalyerRight.render(f5);
    NeedleArm2.render(f5);
    PlayerBottem.render(f5);
    LidLeft.render(f5);
    PlayerFront.render(f5);
    LidFront.render(f5);
    LidRight.render(f5);
    LidMiddle.render(f5);
    LidBack.render(f5);
    TrayBase.render(f5);
    TrayEye.render(f5);
    ArmBase.render(f5);
    setRotation(Tray, 0F, i, 0F);
    Tray.render(f5);
    ArmBase2.render(f5);
    NeddleArm.render(f5);
    Knob1.render(f5);
    Knob2.render(f5);
  }
  
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}

