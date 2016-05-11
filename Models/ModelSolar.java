/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 15/06/2013 9:27:24 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelSolar extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape1d;
	LODModelPart Shape1e;
	LODModelPart Shape1f;
	LODModelPart Shape1g;
	LODModelPart Shape1h;
	LODModelPart Shape1i;
	LODModelPart Shape1j;
	LODModelPart Shape1k;
	LODModelPart Shape1l;
	LODModelPart Shape1m;
	LODModelPart Shape1n;
	LODModelPart Shape1o;
	LODModelPart Shape2;
	LODModelPart Shape2a;

	public ModelSolar()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1.setRotationPoint(4F, 9F, -4F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0.7853982F, 0F);
		Shape1a = new LODModelPart(this, 32, 32);
		Shape1a.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1a.setRotationPoint(-4F, 9F, 4F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0.7853982F, 0F);
		Shape1b = new LODModelPart(this, 65, 0);
		Shape1b.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1b.setRotationPoint(4F, 9F, 4F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0.7853982F, 0F);
		Shape1c = new LODModelPart(this, 0, 32);
		Shape1c.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1c.setRotationPoint(-4F, 9F, -4F);
		Shape1c.setTextureSize(128, 128);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0.7853982F, 0F);
		Shape1d = new LODModelPart(this, 65, 0);
		Shape1d.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1d.setRotationPoint(4F, 9F, 4F);
		Shape1d.setTextureSize(128, 128);
		Shape1d.mirror = true;
		this.setRotation(Shape1d, 0F, 0.3926991F, 0F);
		Shape1e = new LODModelPart(this, 32, 32);
		Shape1e.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1e.setRotationPoint(-4F, 9F, 4F);
		Shape1e.setTextureSize(128, 128);
		Shape1e.mirror = true;
		this.setRotation(Shape1e, 0F, 0.3926991F, 0F);
		Shape1f = new LODModelPart(this, 0, 0);
		Shape1f.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1f.setRotationPoint(4F, 9F, -4F);
		Shape1f.setTextureSize(128, 128);
		Shape1f.mirror = true;
		this.setRotation(Shape1f, 0F, 0.3926991F, 0F);
		Shape1g = new LODModelPart(this, 0, 32);
		Shape1g.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1g.setRotationPoint(-4F, 9F, -4F);
		Shape1g.setTextureSize(128, 128);
		Shape1g.mirror = true;
		this.setRotation(Shape1g, 0F, 0.3926991F, 0F);
		Shape1h = new LODModelPart(this, 0, 32);
		Shape1h.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1h.setRotationPoint(-4F, 9F, -4F);
		Shape1h.setTextureSize(128, 128);
		Shape1h.mirror = true;
		this.setRotation(Shape1h, 0F, 1.178097F, 0F);
		Shape1i = new LODModelPart(this, 0, 32);
		Shape1i.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1i.setRotationPoint(-4F, 9F, -4F);
		Shape1i.setTextureSize(128, 128);
		Shape1i.mirror = true;
		this.setRotation(Shape1i, 0F, 0F, 0F);
		Shape1j = new LODModelPart(this, 0, 0);
		Shape1j.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1j.setRotationPoint(4F, 9F, -4F);
		Shape1j.setTextureSize(128, 128);
		Shape1j.mirror = true;
		this.setRotation(Shape1j, 0F, 1.178097F, 0F);
		Shape1k = new LODModelPart(this, 0, 0);
		Shape1k.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1k.setRotationPoint(4F, 9F, -4F);
		Shape1k.setTextureSize(128, 128);
		Shape1k.mirror = true;
		this.setRotation(Shape1k, 0F, 0F, 0F);
		Shape1l = new LODModelPart(this, 65, 0);
		Shape1l.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1l.setRotationPoint(4F, 9F, 4F);
		Shape1l.setTextureSize(128, 128);
		Shape1l.mirror = true;
		this.setRotation(Shape1l, 0F, 1.178097F, 0F);
		Shape1m = new LODModelPart(this, 65, 0);
		Shape1m.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1m.setRotationPoint(4F, 9F, 4F);
		Shape1m.setTextureSize(128, 128);
		Shape1m.mirror = true;
		this.setRotation(Shape1m, 0F, 0F, 0F);
		Shape1n = new LODModelPart(this, 32, 32);
		Shape1n.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1n.setRotationPoint(-4F, 9F, 4F);
		Shape1n.setTextureSize(128, 128);
		Shape1n.mirror = true;
		this.setRotation(Shape1n, 0F, 0F, 0F);
		Shape1o = new LODModelPart(this, 32, 32);
		Shape1o.addBox(-3F, 0F, -3F, 6, 14, 6);
		Shape1o.setRotationPoint(-4F, 9F, 4F);
		Shape1o.setTextureSize(128, 128);
		Shape1o.mirror = true;
		this.setRotation(Shape1o, 0F, 1.178097F, 0F);
		Shape2 = new LODModelPart(this, 0, 55);
		Shape2.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape2.setRotationPoint(-8F, 23F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 0, 55);
		Shape2a.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape2a.setRotationPoint(-8F, 8F, -8F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);
		Shape1d.render(te, f5);
		Shape1e.render(te, f5);
		Shape1f.render(te, f5);
		Shape1g.render(te, f5);
		Shape1h.render(te, f5);
		Shape1i.render(te, f5);
		Shape1j.render(te, f5);
		Shape1k.render(te, f5);
		Shape1l.render(te, f5);
		Shape1m.render(te, f5);
		Shape1n.render(te, f5);
		Shape1o.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
