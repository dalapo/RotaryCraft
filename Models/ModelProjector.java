/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 30/04/2013 10:11:21 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelProjector extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape3b1;
	LODModelPart Shape3b2;
	LODModelPart Shape4a1;
	LODModelPart Shape4a2;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape5;

	public ModelProjector()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 19);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 0, 0);
		Shape3a.addBox(0F, 0F, 0F, 1, 1, 4);
		Shape3a.setRotationPoint(7F, 18F, -2F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new LODModelPart(this, 0, 0);
		Shape3b.addBox(0F, 0F, 0F, 1, 1, 6);
		Shape3b.setRotationPoint(6F, 19F, -3F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 0, 0);
		Shape4.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape4.setRotationPoint(7F, 16F, -2F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 0, 0);
		Shape4a.addBox(0F, 0F, 0F, 1, 4, 1);
		Shape4a.setRotationPoint(6F, 15F, -3F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape3b1 = new LODModelPart(this, 0, 0);
		Shape3b1.addBox(0F, 0F, 0F, 1, 1, 4);
		Shape3b1.setRotationPoint(7F, 15F, -2F);
		Shape3b1.setTextureSize(128, 128);
		Shape3b1.mirror = true;
		this.setRotation(Shape3b1, 0F, 0F, 0F);
		Shape3b2 = new LODModelPart(this, 0, 0);
		Shape3b2.addBox(0F, 0F, 0F, 1, 1, 6);
		Shape3b2.setRotationPoint(6F, 14F, -3F);
		Shape3b2.setTextureSize(128, 128);
		Shape3b2.mirror = true;
		this.setRotation(Shape3b2, 0F, 0F, 0F);
		Shape4a1 = new LODModelPart(this, 0, 0);
		Shape4a1.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape4a1.setRotationPoint(7F, 16F, 1F);
		Shape4a1.setTextureSize(128, 128);
		Shape4a1.mirror = true;
		this.setRotation(Shape4a1, 0F, 0F, 0F);
		Shape4a2 = new LODModelPart(this, 0, 0);
		Shape4a2.addBox(0F, 0F, 0F, 1, 4, 1);
		Shape4a2.setRotationPoint(6F, 15F, 2F);
		Shape4a2.setTextureSize(128, 128);
		Shape4a2.mirror = true;
		this.setRotation(Shape4a2, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 65, 0);
		Shape2.addBox(0F, 0F, 0F, 13, 11, 8);
		Shape2.setRotationPoint(-7F, 12F, -4F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 37);
		Shape3.addBox(0F, 0F, 0F, 13, 1, 6);
		Shape3.setRotationPoint(-7F, 11F, -3F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 16, 0);
		Shape5.addBox(0F, 0F, 0F, 1, 12, 6);
		Shape5.setRotationPoint(-8F, 11F, -3F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape3b1.render(te, f5);
		Shape3b2.render(te, f5);
		Shape4a1.render(te, f5);
		Shape4a2.render(te, f5);
		Shape2.render(te, f5);
		Shape3.render(te, f5);
		Shape5.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f6)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
