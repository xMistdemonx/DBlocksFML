package DBlocks.Models;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelGrinder extends ModelBase
{
  //fields
    ModelRenderer Shape5;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer RightWall;
    ModelRenderer BackWall;
    ModelRenderer FrontWall;
    ModelRenderer LeftWall;
    ModelRenderer bit12;
    ModelRenderer bit10;
    ModelRenderer bit9;
    ModelRenderer bit6;
    ModelRenderer bit8;
    ModelRenderer bit7;
    ModelRenderer bit5;
    ModelRenderer bit4;
    ModelRenderer bit3;
    ModelRenderer bit2;
   
  
  public ModelGrinder()
  {
    textureWidth = 64;
    textureHeight = 64;
    
    Shape5 = new ModelRenderer(this, 17, 35);
    Shape5.addBox(0F, 0F, 0F, 15, 1, 15);
    Shape5.setRotationPoint(-8F, 23F, -7F);
    Shape5.setTextureSize(64, 64);
    Shape5.mirror = true;
    setRotation(Shape5, 0F, 0F, 0F);
    Shape1 = new ModelRenderer(this, 0, 0);
    Shape1.addBox(0F, 0F, 0F, 15, 4, 1);
    Shape1.setRotationPoint(-7.5F, 8F, -7F);
    Shape1.setTextureSize(64, 64);
    Shape1.mirror = true;
    setRotation(Shape1, 0.7435722F, 0F, 0F);
    Shape2 = new ModelRenderer(this, 0, 0);
    Shape2.addBox(0F, 0F, 0F, 15, 4, 1);
    Shape2.setRotationPoint(6.5F, 7.5F, 7.5F);
    Shape2.setTextureSize(64, 64);
    Shape2.mirror = true;
    setRotation(Shape2, -0.6320364F, 1.579523F, 0F);
    Shape3 = new ModelRenderer(this, 0, 0);
    Shape3.addBox(0F, 0F, 0F, 15, 4, 1);
    Shape3.setRotationPoint(-7F, 8F, 7.5F);
    Shape3.setTextureSize(64, 64);
    Shape3.mirror = true;
    setRotation(Shape3, 0.6320364F, 1.579523F, 0F);
    Shape4 = new ModelRenderer(this, 0, 0);
    Shape4.addBox(0F, 0F, 0F, 15, 4, 1);
    Shape4.setRotationPoint(-7.5F, 7.5F, 6.6F);
    Shape4.setTextureSize(64, 64);
    Shape4.mirror = true;
    setRotation(Shape4, -0.7435722F, 0F, 0F);
    RightWall = new ModelRenderer(this, 0, 34);
    RightWall.addBox(0F, 0F, 0F, 15, 16, 1);
    RightWall.setRotationPoint(-7.5F, 8F, -8F);
    RightWall.setTextureSize(64, 64);
    RightWall.mirror = true;
    setRotation(RightWall, 0F, 0F, 0F);
    BackWall = new ModelRenderer(this, 0, 34);
    BackWall.addBox(0F, 0F, 0F, 16, 16, 1);
    BackWall.setRotationPoint(8F, 8F, -8F);
    BackWall.setTextureSize(64, 64);
    BackWall.mirror = true;
    setRotation(BackWall, 0F, -1.581268F, 0F);
    BackWall.mirror = false;
    FrontWall = new ModelRenderer(this, -1, 34);
    FrontWall.addBox(0F, 0F, 0F, 16, 16, 1);
    FrontWall.setRotationPoint(-8F, 8F, 8F);
    FrontWall.setTextureSize(64, 64);
    FrontWall.mirror = true;
    setRotation(FrontWall, 0F, 1.570796F, 0F);
    LeftWall = new ModelRenderer(this, 0, 34);
    LeftWall.addBox(0F, 0F, 0F, 16, 16, 1);
    LeftWall.setRotationPoint(-8F, 8F, 7.333333F);
    LeftWall.setTextureSize(64, 64);
    LeftWall.mirror = true;
    setRotation(LeftWall, 0F, 0F, 0F);
    bit12 = new ModelRenderer(this, 0, 21);
    bit12.addBox(0F, -1F, -1F, 14, 2, 2);
    bit12.setRotationPoint(-7F, 15F, 6F);
    bit12.setTextureSize(64, 64);
    bit12.mirror = true;
    setRotation(bit12, 0.8179294F, 0F, 0F);
    bit10 = new ModelRenderer(this, 0, 21);
    bit10.addBox(0F, -1F, -1F, 14, 2, 2);
    bit10.setRotationPoint(-7F, 15F, 0F);
    bit10.setTextureSize(64, 64);
    bit10.mirror = true;
    setRotation(bit10, 0.8179294F, 0F, 0F);
    bit9 = new ModelRenderer(this, 0, 21);
    bit9.addBox(0F, -1F, -1F, 14, 2, 2);
    bit9.setRotationPoint(-7F, 15F, -6F);
    bit9.setTextureSize(64, 64);
    bit9.mirror = true;
    setRotation(bit9, 0.8179294F, 0F, 0F);
    bit6 = new ModelRenderer(this, 0, 27);
    bit6.addBox(0F, -1F, -1F, 14, 2, 2);
    bit6.setRotationPoint(-7F, 15F, 6F);
    bit6.setTextureSize(64, 64);
    bit6.mirror = true;
    setRotation(bit6, 1.603328F, 0F, 0F);
    bit8 = new ModelRenderer(this, 0, 27);
    bit8.addBox(0F, -1F, -1F, 14, 2, 2);
    bit8.setRotationPoint(-7F, 15F, 0F);
    bit8.setTextureSize(64, 64);
    bit8.mirror = true;
    setRotation(bit8, 1.603328F, 0F, 0F);
    bit7 = new ModelRenderer(this, 0, 27);
    bit7.addBox(0F, -1F, -1F, 14, 2, 2);
    bit7.setRotationPoint(-7F, 15F, -6F);
    bit7.setTextureSize(64, 64);
    bit7.mirror = true;
    setRotation(bit7, 1.603328F, 0F, 0F);
    bit5 = new ModelRenderer(this, 0, 21);
    bit5.addBox(0F, -1F, -1F, 14, 2, 2);
    bit5.setRotationPoint(-7F, 15F, -3F);
    bit5.setTextureSize(64, 64);
    bit5.mirror = true;
    setRotation(bit5, 0.8179294F, 0F, 0F);
    bit4 = new ModelRenderer(this, 0, 27);
    bit4.addBox(0F, -1F, -1F, 14, 2, 2);
    bit4.setRotationPoint(-7F, 15F, -3F);
    bit4.setTextureSize(64, 64);
    bit4.mirror = true;
    setRotation(bit4, 1.603328F, 0F, 0F);
    bit3 = new ModelRenderer(this, 0, 27);
    bit3.addBox(0F, -1F, -1F, 14, 2, 2);
    bit3.setRotationPoint(-7F, 15F, 3F);
    bit3.setTextureSize(64, 64);
    bit3.mirror = true;
    setRotation(bit3, 1.603328F, 0F, 0F);
    bit2 = new ModelRenderer(this, 0, 21);
    bit2.addBox(0F, -1F, -1F, 14, 2, 2);
    bit2.setRotationPoint(-7F, 15F, 3F);
    bit2.setTextureSize(64, 64);
    bit2.mirror = true;
    setRotation(bit2, 0.8179294F, 0F, 0F);
  }
  
  float f5;
  public void render(float x, float y, float z)
  {
	f5 = 0.0625F;
    Shape5.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    RightWall.render(f5);
    BackWall.render(f5);
    FrontWall.render(f5);
    LeftWall.render(f5);
    bit12.render(f5);
    bit10.render(f5);
    bit9.render(f5);
    bit6.render(f5);
    bit8.render(f5);
    bit7.render(f5);
    bit5.render(f5);
    bit4.render(f5);
    bit3.render(f5);
    bit2.render(f5);
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

