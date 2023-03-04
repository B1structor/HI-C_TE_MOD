
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hicte.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HicteModTabs {
	public static CreativeModeTab TAB_HI_C_TE_MOD;

	public static void load() {
		TAB_HI_C_TE_MOD = new CreativeModeTab("tabhi_c_te_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HicteModItems.EL_HICTE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
