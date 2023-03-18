
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hicte.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HicteModTabs {
	public static CreativeModeTab TAB_MO_DOLD;

	public static void load() {
		TAB_MO_DOLD = new CreativeModeTab("tabmo_dold") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HicteModItems.ELHICT_EOLD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
