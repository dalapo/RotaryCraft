/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 16/02/2013 12:10:02 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelAerosolizer extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape5;
	LODModelPart Shape6;
	LODModelPart Shape7;
	LODModelPart Shape8;
	LODModelPart Shape9;
	LODModelPart Shape10;
	LODModelPart Shape11;

	public ModelAerosolizer()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 12, 16);
		Shape1.setRotationPoint(-8F, 12F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 28);
		Shape2.addBox(0F, 0F, 0F, 14, 2, 1);
		Shape2.setRotationPoint(-7F, 10F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 28);
		Shape3.addBox(0F, 0F, 0F, 14, 2, 1);
		Shape3.setRotationPoint(-7F, 10F, 7F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 0, 28);
		Shape4.addBox(0F, 0F, 0F, 14, 2, 1);
		Shape4.setRotationPoint(-7F, 10F, 2F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 0, 28);
		Shape5.addBox(0F, 0F, 0F, 14, 2, 1);
		Shape5.setRotationPoint(-7F, 10F, -3F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 64, 0);
		Shape6.addBox(0F, 0F, 0F, 1, 2, 16);
		Shape6.setRotationPoint(7F, 10F, -8F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new LODModelPart(this, 64, 0);
		Shape7.addBox(0F, 0F, 0F, 1, 2, 14);
		Shape7.setRotationPoint(-3F, 10.2F, -7F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new LODModelPart(this, 64, 0);
		Shape8.addBox(0F, 0F, 0F, 1, 2, 14);
		Shape8.setRotationPoint(2F, 10.2F, -7F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new LODModelPart(this, 64, 0);
		Shape9.addBox(0F, 0F, 0F, 1, 2, 16);
		Shape9.setRotationPoint(-8F, 10F, -8F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new LODModelPart(this, 0, 46);
		Shape10.addBox(0F, 0F, 0F, 14, 1, 14);
		Shape10.setRotationPoint(-7F, 10.5F, -7F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new LODModelPart(this, 0, 31);
		Shape11.addBox(0F, 0F, 0F, 14, 1, 14);
		Shape11.setRotationPoint(-7F, 11.5F, -7F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		this.setRotation(Shape11, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		boolean on = (Boolean)li.get(0);
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape3.render(te, f5);
		Shape4.render(te, f5);
		Shape5.render(te, f5);
		Shape6.render(te, f5);
		Shape7.render(te, f5);
		Shape8.render(te, f5);
		Shape9.render(te, f5);
		if (on)
			Shape10.render(te, f5);
		Shape11.render(te, f5);
	}

}
