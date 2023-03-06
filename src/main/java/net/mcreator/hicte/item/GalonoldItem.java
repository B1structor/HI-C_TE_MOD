
package net.mcreator.hicte.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.hicte.init.HicteModTabs;

import java.util.List;

public class GalonoldItem extends Item {
	public GalonoldItem() {
		super(new Item.Properties().tab(HicteModTabs.TAB_MO_DOLD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Me causa nostalgia de una epoca mejor"));
		list.add(Component.literal("\"Lua no veas esto\""));
	}
}
