/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.ModInterface.Lua;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.ModInteract.Lua.LuaMethod;
import Reika.RotaryCraft.API.Power.ShaftMachine;
import dan200.computercraft.api.lua.LuaException;

public class LuaGetAPIPower extends LuaMethod {

	public LuaGetAPIPower() {
		super("getPower", ShaftMachine.class);
	}

	@Override
	public Object[] invoke(TileEntity te, Object[] args) throws LuaException, InterruptedException {
		ShaftMachine s = (ShaftMachine) te;
		return new Object[]{s.getPower(), s.getTorque(), s.getOmega()};
	}

	@Override
	public String getDocumentation() {
		return "Returns the power data.\nArgs: None\nReturns: [Power, Torque, Speed]";
	}

	@Override
	public String getArgsAsString() {
		return "";
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.ARRAY;
	}

}
