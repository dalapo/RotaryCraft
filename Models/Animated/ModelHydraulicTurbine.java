/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 23/12/2013 7:38:57 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelHydraulicTurbine extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape3d;
	LODModelPart Shape3e;
	LODModelPart Shape4;
	LODModelPart Shape5;
	LODModelPart Shape5a;
	LODModelPart Shape6;
	LODModelPart Shape6a;
	LODModelPart Shape7;
	LODModelPart Shape7a;
	LODModelPart Shape8;
	LODModelPart Shape8a;
	LODModelPart Shape9;
	LODModelPart Shape10;
	LODModelPart Shape11;

	public ModelHydraulicTurbine()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 2, 16);
		Shape1.setRotationPoint(-8F, 22F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 20);
		Shape2.addBox(-1F, -1F, 0F, 2, 2, 6);
		Shape2.setRotationPoint(0F, 15F, -8.5F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0.7853982F);
		Shape2a = new LODModelPart(this, 0, 20);
		Shape2a.addBox(-1F, -1F, 0F, 2, 2, 6);
		Shape2a.setRotationPoint(0F, 15F, -8.5F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 31);
		Shape3.addBox(-1F, -6F, 0F, 2, 12, 1);
		Shape3.setRotationPoint(0F, 15F, -3F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 1.570796F);
		Shape3a = new LODModelPart(this, 0, 31);
		Shape3a.addBox(-1F, -6F, 0F, 2, 12, 1);
		Shape3a.setRotationPoint(0F, 15F, -3F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 1.047198F);
		Shape3b = new LODModelPart(this, 0, 31);
		Shape3b.addBox(-1F, -6F, 0F, 2, 12, 1);
		Shape3b.setRotationPoint(0F, 15F, -3F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0.5235988F);
		Shape3c = new LODModelPart(this, 0, 31);
		Shape3c.addBox(-1F, -6F, 0F, 2, 12, 1);
		Shape3c.setRotationPoint(0F, 15F, -3F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0F, 0F);
		Shape3d = new LODModelPart(this, 0, 31);
		Shape3d.addBox(-1F, -6F, 0F, 2, 12, 1);
		Shape3d.setRotationPoint(0F, 15F, -3F);
		Shape3d.setTextureSize(128, 128);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, 0F, 0F, 2.094395F);
		Shape3e = new LODModelPart(this, 0, 31);
		Shape3e.addBox(-1F, -6F, 0F, 2, 12, 1);
		Shape3e.setRotationPoint(0F, 15F, -3F);
		Shape3e.setTextureSize(128, 128);
		Shape3e.mirror = true;
		this.setRotation(Shape3e, 0F, 0F, 2.617994F);
		Shape4 = new LODModelPart(this, 66, 0);
		Shape4.addBox(0F, 0F, 0F, 13, 13, 4);
		Shape4.setRotationPoint(-6.5F, 8.5F, -2F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 66, 18);
		Shape5.addBox(0F, 0F, 0F, 14, 1, 4);
		Shape5.setRotationPoint(-7F, 21F, -6F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5a = new LODModelPart(this, 66, 25);
		Shape5a.addBox(0F, 0F, 0F, 14, 1, 4);
		Shape5a.setRotationPoint(-7F, 8F, -6F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 18, 31);
		Shape6.addBox(0F, 0F, 0F, 1, 12, 4);
		Shape6.setRotationPoint(-7F, 9F, -6F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new LODModelPart(this, 7, 31);
		Shape6a.addBox(0F, 0F, 0F, 1, 12, 4);
		Shape6a.setRotationPoint(6F, 9F, -6F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape7 = new LODModelPart(this, 30, 19);
		Shape7.addBox(0F, 0F, 0F, 1, 12, 1);
		Shape7.setRotationPoint(2F, 9F, -5.5F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7a = new LODModelPart(this, 30, 19);
		Shape7a.addBox(0F, 0F, 0F, 1, 12, 1);
		Shape7a.setRotationPoint(-3F, 9F, -5.5F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape8 = new LODModelPart(this, 0, 50);
		Shape8.addBox(0F, 0F, 0F, 12, 1, 1);
		Shape8.setRotationPoint(-6F, 17F, -5.8F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape8a = new LODModelPart(this, 0, 50);
		Shape8a.addBox(0F, 0F, 0F, 12, 1, 1);
		Shape8a.setRotationPoint(-6F, 12F, -5.8F);
		Shape8a.setTextureSize(128, 128);
		Shape8a.mirror = true;
		this.setRotation(Shape8a, 0F, 0F, 0F);
		Shape9 = new LODModelPart(this, 0, 54);
		Shape9.addBox(0F, 0F, 0F, 12, 12, 1);
		Shape9.setRotationPoint(-6F, 9F, -5.3F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new LODModelPart(this, 0, 68);
		Shape10.addBox(0F, 0F, 0F, 16, 14, 5);
		Shape10.setRotationPoint(-8F, 8F, 2F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new LODModelPart(this, 0, 89);
		Shape11.addBox(-4F, -4F, 0F, 8, 8, 1);
		Shape11.setRotationPoint(0F, 15F, 7F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		this.setRotation(Shape11, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);

		GL11.glTranslated(0, 0.9375, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -0.9375, 0);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
		Shape3c.render(te, f5);
		Shape3d.render(te, f5);
		Shape3e.render(te, f5);

		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		GL11.glTranslated(0, 0.9375, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -0.9375, 0);

		Shape4.render(te, f5);
		Shape5.render(te, f5);
		Shape5a.render(te, f5);
		Shape6.render(te, f5);
		Shape6a.render(te, f5);
		Shape7.render(te, f5);
		Shape7a.render(te, f5);
		Shape8.render(te, f5);
		Shape8a.render(te, f5);
		Shape9.render(te, f5);
		Shape10.render(te, f5);
		Shape11.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
