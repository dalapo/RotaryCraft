/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.ModInterface;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import Reika.DragonAPI.Interfaces.RenderFetcher;
import Reika.DragonAPI.Libraries.IO.ReikaLiquidRenderer;
import Reika.RotaryCraft.Auxiliary.IORenderer;
import Reika.RotaryCraft.Base.RotaryCraftTileEntity;
import Reika.RotaryCraft.Base.RotaryTERenderer;

public class RenderBoiler extends RotaryTERenderer
{

	private ModelBoiler BoilerModel = new ModelBoiler();

	/**
	 * Renders the TileEntity for the position.
	 */
	public void renderTileEntityBoilerAt(TileEntityBoiler tile, double par2, double par4, double par6, float par8)
	{
		ModelBoiler var14;
		var14 = BoilerModel;

		this.bindTextureByName("/Reika/RotaryCraft/Textures/TileEntityTex/boilertex.png");

		GL11.glPushMatrix();
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glTranslatef((float)par2, (float)par4 + 2.0F, (float)par6 + 1.0F);
		GL11.glScalef(1.0F, -1.0F, -1.0F);
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
		int var11 = 0;
		float var13;


		var14.renderAll(null, -tile.phi);

		if (tile.isInWorld())
			GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

	}

	@Override
	public void renderTileEntityAt(TileEntity tile, double par2, double par4, double par6, float par8)
	{
		if (this.isValidMachineRenderpass((RotaryCraftTileEntity)tile))
			this.renderTileEntityBoilerAt((TileEntityBoiler)tile, par2, par4, par6, par8);
		if (((RotaryCraftTileEntity) tile).isInWorld() && MinecraftForgeClient.getRenderPass() == 1) {
			IORenderer.renderIO(tile, par2, par4, par6);
			this.renderWater((TileEntityBoiler)tile, par2, par4, par6);
		}
	}

	private void renderWater(TileEntityBoiler tile, double par2, double par4, double par6) {
		LiquidStack liquid = LiquidDictionary.getCanonicalLiquid("Water");
		int amount = tile.getWater();
		if (amount == 0)
			return;
		if (amount > tile.CAPACITY)
			amount = tile.CAPACITY;

		int[] displayList = ReikaLiquidRenderer.getGLLists(liquid, tile.worldObj, false);

		if (displayList == null) {
			return;
		}

		GL11.glPushMatrix();
		GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
		GL11.glEnable(GL11.GL_CULL_FACE);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

		this.bindTextureByName(ReikaLiquidRenderer.getLiquidSheet(liquid));

		GL11.glTranslated(par2, par4, par6);

		GL11.glTranslated(0, 0.0625, 0);

		GL11.glTranslated(0, 0.001, 0);
		GL11.glScaled(1, 0.95, 1);
		GL11.glScaled(0.99, 0.95, 0.99);

		GL11.glCallList(displayList[(int)(amount / ((double)tile.CAPACITY) * (ReikaLiquidRenderer.LEVELS - 1))]);

		GL11.glPopAttrib();
		GL11.glPopMatrix();
	}

	@Override
	public String getImageFileName(RenderFetcher te) {
		return "boilertex.png";
	}
}
