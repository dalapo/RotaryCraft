/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import Reika.RotaryCraft.Auxiliary.ItemStacks;

public enum EnumEngineType {
	DC(256, 4),
	WIND(1024, 4),
	STEAM(512, 32),
	GAS(512, 128),
	AC(256, 512),
	SPORT(1024, 256),
	HYDRO(256, 2048),
	MICRO(131072, 16),
	JET(65536, 1024);

	/** Standard Motor TorqueSpeeds:
	 * DC Engine = 1-4Nm @ 1600-2400 rpm (168 - 251 rad/s) 			-> 0.672kW - 1.004kW
	 * Steam Engine 40-50Nm @ 5000 rpm (524 rad/s)					-> 20.96kW - 26.2kW (best)
	 * Standard Combustion = 100Nm @ 5500-7000 rpm (576 - 733 rad/s)-> 57.6kW - 73.3kW (Standard car)
	 * AC Engine = ~300Nm @ max 3600 rpm (377 rad/s)				-> 113.1 kW
	 * Sport Combustion = 200Nm @ 9400-10600 rpm (984 - 1110 rad/s) -> 196.8kW - 222kW (sports car)
	 * Microturbine 5Nm @ 200 krpm (52356 rad/s)					-> 1MW
	 * Gas Turbine 700-1400 Nm @ 50-100 krpm (5236 - 10471 rad/s)	-> 70 MW (Boeing 767 engines)
	 * @author Reika
	 */

	private int torque = 0;
	private int omega = 0;

	public static final EnumEngineType[] engineList = EnumEngineType.values();

	private EnumEngineType(int rpm, int tq)
	{
		omega = rpm;
		torque = tq;
	}

	public int getSpeed() {
		return omega;
	}

	public int getTorque() {
		return torque;
	}

	public long getPower() {
		return torque*omega;
	}

	public double getPowerKW() {
		return (torque*omega)/1000D;
	}

	public double getPowerMW() {
		return (torque*omega)/1000000D;
	}

	public String getStringPowerMW() {
		return String.format("%.3f", (torque*omega)/1000000D);
	}

	public double getPowerForDisplay() {
		if (this.getPower() < 1000)
			return this.getPower();
		else if (this.getPower() < 1000000)
			return this.getPowerKW();
		return this.getPowerMW();
	}

	public int getID() {
		return this.ordinal();
	}

	public boolean isJetFueled() {
		return (this == JET || this == MICRO);
	}

	public boolean isEthanolFueled() {
		return (this == GAS || this == SPORT);
	}

	public boolean isWaterPiped() {
		return (this == STEAM || this == SPORT);
	}

	public boolean hasGui() {
		return (this == STEAM || this == GAS || this == AC || this == SPORT || this == MICRO || this == JET);
	}

	public boolean burnsFuel() {
		return (this == STEAM || this == GAS || this == SPORT || this == MICRO || this == JET);
	}

	public static EnumEngineType setType(int type) {
		return EnumEngineType.values()[type];
	}

	public int getSoundLength(int FOD) {
		if (this.carNoise()) {
			return 88;
		}
		if (this.electricNoise()) {
			return 74;
		}
		if (this.steamNoise()) {
			return 49;
		}
		if (this.waterNoise()) {
			return 59;
		}
		if (this.windNoise()) {
			return 105;
		}
		if (this.jetNoise()) {
			return 79+FOD*11;
		}
		if (this.turbineNoise()) {
			return 20;
		}
		return 0;
	}

	public boolean isCooled() {
		return (this == STEAM || this == SPORT);
	}

	public boolean isAirBreathing() {
		return (this == GAS || this == SPORT || this == MICRO || this == JET);
	}

	public boolean electricNoise() {
		return (this == DC || this == AC);
	}

	public boolean carNoise() {
		return (this == GAS || this == SPORT);
	}

	public boolean waterNoise() {
		return (this == HYDRO);
	}

	public boolean steamNoise() {
		return (this == STEAM);
	}

	public boolean jetNoise() {
		return (this == JET);
	}

	public boolean turbineNoise() {
		return (this == JET || this == MICRO);
	}

	public boolean windNoise() {
		return (this == WIND);
	}

	public boolean canHurtPlayer() {
		if (this == JET)
			return true;
		if (this == SPORT)
			return true;
		if (this == WIND)
			return true;
		if (this == HYDRO)
			return true;
		return false;
	}

	public boolean hasTemperature() {
		if (this == SPORT)
			return true;
		if (this == STEAM)
			return true;
		if (this == JET)
			return true;
		return false;
	}

	public boolean isValidFuel(ItemStack is) {
		if (this == GAS)
			return is.itemID == ItemRegistry.ETHANOL.getShiftedID();
		if (this == SPORT)
			return is.itemID == ItemRegistry.ETHANOL.getShiftedID() || this.isAdditive(is);
		if (this == AC)
			return is.itemID == ItemStacks.shaftcore.itemID && is.getItemDamage() == ItemStacks.shaftcore.getItemDamage();
		return false;
	}

	public boolean isAdditive(ItemStack is) {
		if (this == SPORT)
			return is.itemID == Item.redstone.itemID || is.itemID == Item.gunpowder.itemID || is.itemID == Item.blazePowder.itemID;
		return false;
	}

	/** Returns ticks */
	public int getFuelUnitDuration() {
		switch(this) {
		case STEAM:
			return 1800;
		case GAS:
			return 1200;
		case AC:
			return 1200;
		case SPORT:
			return 600;
		case MICRO:
			return 450;
		case JET:
			return 225;
		default:
			return 0;
		}
	}
	
	public ItemStack getCraftedProduct() {
		return MachineRegistry.ENGINE.getCraftedMetadataProduct(this.ordinal());
	}
}
