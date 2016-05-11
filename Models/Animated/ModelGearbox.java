/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 11/02/2013 9:53:01 PM
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


public class ModelGearbox extends RotaryModelBase
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
	LODModelPart Shape12;
	LODModelPart Shape13;
	LODModelPart Shape14;
	LODModelPart Shape15;
	LODModelPart Shape16;
	LODModelPart Shape17;
	LODModelPart Shape18;
	LODModelPart Shape19;
	LODModelPart Shape20;
	LODModelPart Shape21;
	LODModelPart Shape22;
	LODModelPart Shape23;
	LODModelPart Shape24;
	LODModelPart Shape25;
	LODModelPart Shape26;
	LODModelPart Shape27;
	LODModelPart Shape28;

	public ModelGearbox()
	{
		textureWidth = 128;
		textureHeight = 32;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 32);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 64, 0);
		Shape2.addBox(0F, 0F, 0F, 1, 12, 16);
		Shape2.setRotationPoint(7F, 11F, -8F);
		Shape2.setTextureSize(128, 32);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2.mirror = false;
		Shape3 = new LODModelPart(this, 64, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 12, 16);
		Shape3.setRotationPoint(-8F, 11F, -8F);
		Shape3.setTextureSize(128, 32);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3.mirror = false;
		Shape4 = new LODModelPart(this, 0, 17);
		Shape4.addBox(0F, 0F, 0F, 14, 4, 1);
		Shape4.setRotationPoint(-7F, 19F, 7F);
		Shape4.setTextureSize(128, 32);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4.mirror = false;
		Shape5 = new LODModelPart(this, 0, 17);
		Shape5.addBox(0F, 0F, 0F, 14, 4, 1);
		Shape5.setRotationPoint(-7F, 19F, -8F);
		Shape5.setTextureSize(128, 32);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5.mirror = false;
		Shape6 = new LODModelPart(this, 30, 17);
		Shape6.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape6.setRotationPoint(6F, 16F, 7F);
		Shape6.setTextureSize(128, 32);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6.mirror = false;
		Shape7 = new LODModelPart(this, 30, 17);
		Shape7.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape7.setRotationPoint(6F, 16F, -8F);
		Shape7.setTextureSize(128, 32);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7.mirror = false;
		Shape8 = new LODModelPart(this, 30, 17);
		Shape8.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape8.setRotationPoint(-7F, 16F, 7F);
		Shape8.setTextureSize(128, 32);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape8.mirror = false;
		Shape9 = new LODModelPart(this, 30, 17);
		Shape9.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape9.setRotationPoint(-7F, 16F, -8F);
		Shape9.setTextureSize(128, 32);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 0F, 0F);
		Shape9.mirror = false;
		Shape10 = new LODModelPart(this, 42, 17);
		Shape10.addBox(0F, 0F, 0F, 1, 3, 10);
		Shape10.setRotationPoint(7F, 8F, -5F);
		Shape10.setTextureSize(128, 32);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
		Shape10.mirror = false;
		Shape11 = new LODModelPart(this, 42, 17);
		Shape11.addBox(0F, 0F, 0F, 1, 3, 10);
		Shape11.setRotationPoint(-8F, 8F, -5F);
		Shape11.setTextureSize(128, 32);
		Shape11.mirror = true;
		this.setRotation(Shape11, 0F, 0F, 0F);
		Shape11.mirror = false;
		Shape12 = new LODModelPart(this, 0, 27);
		Shape12.addBox(0F, 0F, 0F, 4, 2, 2);
		Shape12.setRotationPoint(-8.5F, 15F, -1F);
		Shape12.setTextureSize(128, 32);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
		Shape12.mirror = false;
		Shape13 = new LODModelPart(this, 0, 27);
		Shape13.addBox(0F, 0F, 0F, 4, 2, 2);
		Shape13.setRotationPoint(-8.5F, 16F, -1.4F);
		Shape13.setTextureSize(128, 32);
		Shape13.mirror = true;
		this.setRotation(Shape13, 0.7853982F, 0F, 0F);
		Shape13.mirror = false;
		Shape14 = new LODModelPart(this, 100, 0);
		Shape14.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape14.setRotationPoint(-5F, 14F, -2F);
		Shape14.setTextureSize(128, 32);
		Shape14.mirror = true;
		this.setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new LODModelPart(this, 100, 0);
		Shape15.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape15.setRotationPoint(-5F, 16F, -3F);
		Shape15.setTextureSize(128, 32);
		Shape15.mirror = true;
		this.setRotation(Shape15, 0.8028515F, 0F, 0F);
		Shape16 = new LODModelPart(this, 100, 0);
		Shape16.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape16.setRotationPoint(-4F, 11.4F, 0.8F);
		Shape16.setTextureSize(128, 32);
		Shape16.mirror = true;
		this.setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new LODModelPart(this, 100, 0);
		Shape17.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape17.setRotationPoint(-4F, 14.5F, -0.5F);
		Shape17.setTextureSize(128, 32);
		Shape17.mirror = true;
		this.setRotation(Shape17, 0.7853982F, 0F, 0F);
		Shape18 = new LODModelPart(this, 100, 0);
		Shape18.addBox(0F, 0F, 0F, 1, 3, 3);
		Shape18.setRotationPoint(-5F, 14.5F, 2F);
		Shape18.setTextureSize(128, 32);
		Shape18.mirror = true;
		this.setRotation(Shape18, 0.7853982F, 0F, 0F);
		Shape19 = new LODModelPart(this, 100, 0);
		Shape19.addBox(0F, 0F, 0F, 1, 3, 3);
		Shape19.setRotationPoint(-5F, 13F, 2.5F);
		Shape19.setTextureSize(128, 32);
		Shape19.mirror = true;
		this.setRotation(Shape19, 0F, 0F, 0F);
		Shape19.mirror = false;
		Shape20 = new LODModelPart(this, 0, 27);
		Shape20.addBox(0F, 0F, 0F, 8, 2, 2);
		Shape20.setRotationPoint(-3F, 13.5F, 3F);
		Shape20.setTextureSize(128, 32);
		Shape20.mirror = true;
		this.setRotation(Shape20, 0F, 0F, 0F);
		Shape21 = new LODModelPart(this, 0, 27);
		Shape21.addBox(0F, 0F, 0F, 8, 2, 2);
		Shape21.setRotationPoint(-3F, 14.5F, 2.5F);
		Shape21.setTextureSize(128, 32);
		Shape21.mirror = true;
		this.setRotation(Shape21, 0.7853982F, 0F, 0F);
		Shape22 = new LODModelPart(this, 100, 0);
		Shape22.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape22.setRotationPoint(5F, 12.4F, 1.8F);
		Shape22.setTextureSize(128, 32);
		Shape22.mirror = true;
		this.setRotation(Shape22, 0F, 0F, 0F);
		Shape23 = new LODModelPart(this, 100, 0);
		Shape23.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape23.setRotationPoint(5F, 14.5F, 1F);
		Shape23.setTextureSize(128, 32);
		Shape23.mirror = true;
		this.setRotation(Shape23, 0.7853982F, 0F, 0F);
		Shape24 = new LODModelPart(this, 0, 27);
		Shape24.addBox(0F, 0F, 0F, 3, 2, 2);
		Shape24.setRotationPoint(5.5F, 15F, -1F);
		Shape24.setTextureSize(128, 32);
		Shape24.mirror = true;
		this.setRotation(Shape24, 0F, 0F, 0F);
		Shape25 = new LODModelPart(this, 0, 27);
		Shape25.addBox(0F, 0F, 0F, 3, 2, 2);
		Shape25.setRotationPoint(5.5F, 16F, -1.4F);
		Shape25.setTextureSize(128, 32);
		Shape25.mirror = true;
		this.setRotation(Shape25, 0.7853982F, 0F, 0.0174533F);
		Shape26 = new LODModelPart(this, 100, 0);
		Shape26.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape26.setRotationPoint(5F, 14F, -2F);
		Shape26.setTextureSize(128, 32);
		Shape26.mirror = true;
		this.setRotation(Shape26, 0F, 0F, 0F);
		Shape27 = new LODModelPart(this, 100, 0);
		Shape27.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape27.setRotationPoint(5F, 16F, -3F);
		Shape27.setTextureSize(128, 32);
		Shape27.mirror = true;
		this.setRotation(Shape27, 0.7853982F, 0F, 0F);
		Shape28 = new LODModelPart(this, 100, 19);
		Shape28.addBox(0F, 0F, 0F, 2, 10, 3);
		Shape28.setRotationPoint(0F, 13F, 2.4F);
		Shape28.setTextureSize(128, 32);
		Shape28.mirror = true;
		this.setRotation(Shape28, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape3.render(te, f5);
		Shape4.render(te, f5);
		Shape5.render(te, f5);
		Shape6.render(te, f5);
		Shape7.render(te, f5);
		Shape8.render(te, f5);
		Shape9.render(te, f5);
		Shape10.render(te, f5);
		Shape11.render(te, f5);
		Shape28.render(te, f5);

		double d1 = 0;
		double d2 = 0.9025;
		double d3 = 0.25;
		GL11.glTranslated(0, 0.015125, -0.006125);
		GL11.glTranslated(d1, d2, d3);
		GL11.glRotatef(-phi*1.25F, 1, 0, 0);
		GL11.glTranslated(-d1, -d2, -d3);
		Shape20.render(te, f5);
		Shape21.render(te, f5);
		Shape22.render(te, f5);
		Shape23.render(te, f5);
		Shape16.render(te, f5);
		Shape17.render(te, f5);
		Shape18.render(te, f5);
		Shape19.render(te, f5);
		GL11.glTranslated(d1, d2, d3);
		GL11.glRotatef(phi*1.25F, 1, 0, 0);
		GL11.glTranslated(-d1, -d2, -d3);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi*1.25F, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
		Shape26.render(te, f5);
		Shape27.render(te, f5);
		Shape24.render(te, f5);
		Shape25.render(te, f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi*1.25F, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
		Shape14.render(te, f5);
		Shape15.render(te, f5);
		Shape12.render(te, f5);
		Shape13.render(te, f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
	}

}
