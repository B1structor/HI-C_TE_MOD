
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hicte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.hicte.item.PlasticoItem;
import net.mcreator.hicte.item.HICTEvacioItem;
import net.mcreator.hicte.item.HICTESOSPECHOSOItem;
import net.mcreator.hicte.item.HICTEPACKItem;
import net.mcreator.hicte.item.HICTEItem;
import net.mcreator.hicte.item.EspadaSospechosaItem;
import net.mcreator.hicte.item.ElHICTEItem;
import net.mcreator.hicte.item.CartonItem;
import net.mcreator.hicte.item.BotellaconlogoItem;
import net.mcreator.hicte.item.BotellaItem;
import net.mcreator.hicte.HicteMod;

public class HicteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HicteMod.MODID);
	public static final RegistryObject<Item> PLASTICO = REGISTRY.register("plastico", () -> new PlasticoItem());
	public static final RegistryObject<Item> CARTON = REGISTRY.register("carton", () -> new CartonItem());
	public static final RegistryObject<Item> HICT_EVACIO = REGISTRY.register("hict_evacio", () -> new HICTEvacioItem());
	public static final RegistryObject<Item> HICTE = REGISTRY.register("hicte", () -> new HICTEItem());
	public static final RegistryObject<Item> HICTEPACK = REGISTRY.register("hictepack", () -> new HICTEPACKItem());
	public static final RegistryObject<Item> BOTELLA = REGISTRY.register("botella", () -> new BotellaItem());
	public static final RegistryObject<Item> BOTELLACONLOGO = REGISTRY.register("botellaconlogo", () -> new BotellaconlogoItem());
	public static final RegistryObject<Item> EL_HICTE = REGISTRY.register("el_hicte", () -> new ElHICTEItem());
	public static final RegistryObject<Item> HICTESOSPECHOSO = REGISTRY.register("hictesospechoso", () -> new HICTESOSPECHOSOItem());
	public static final RegistryObject<Item> ESPADA_SOSPECHOSA = REGISTRY.register("espada_sospechosa", () -> new EspadaSospechosaItem());
}
