
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hicte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.hicte.item.PlasticooldItem;
import net.mcreator.hicte.item.HICTEoldItem;
import net.mcreator.hicte.item.HICTEVACIOOLDItem;
import net.mcreator.hicte.item.HICTEPACKoldItem;
import net.mcreator.hicte.item.GalonoldItem;
import net.mcreator.hicte.item.GalonFulloldItem;
import net.mcreator.hicte.item.EspadamuySospechosaItem;
import net.mcreator.hicte.item.ELHICTEoldItem;
import net.mcreator.hicte.item.CartonoldItem;
import net.mcreator.hicte.HicteMod;

public class HicteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HicteMod.MODID);
	public static final RegistryObject<Item> CARTONOLD = REGISTRY.register("cartonold", () -> new CartonoldItem());
	public static final RegistryObject<Item> PLASTICOOLD = REGISTRY.register("plasticoold", () -> new PlasticooldItem());
	public static final RegistryObject<Item> GALONOLD = REGISTRY.register("galonold", () -> new GalonoldItem());
	public static final RegistryObject<Item> GALON_FULLOLD = REGISTRY.register("galon_fullold", () -> new GalonFulloldItem());
	public static final RegistryObject<Item> HICTEVACIOOLD = REGISTRY.register("hictevacioold", () -> new HICTEVACIOOLDItem());
	public static final RegistryObject<Item> HICT_EOLD = REGISTRY.register("hict_eold", () -> new HICTEoldItem());
	public static final RegistryObject<Item> HICTEPAC_KOLD = REGISTRY.register("hictepac_kold", () -> new HICTEPACKoldItem());
	public static final RegistryObject<Item> ELHICT_EOLD = REGISTRY.register("elhict_eold", () -> new ELHICTEoldItem());
	public static final RegistryObject<Item> ESPADAMUY_SOSPECHOSA = REGISTRY.register("espadamuy_sospechosa", () -> new EspadamuySospechosaItem());
}
