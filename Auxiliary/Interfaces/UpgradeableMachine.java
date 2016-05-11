/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Auxiliary.Interfaces;

import net.minecraft.item.ItemStack;

public interface UpgradeableMachine {

	public void upgrade(ItemStack item);
	public boolean canUpgradeWith(ItemStack item);

}
