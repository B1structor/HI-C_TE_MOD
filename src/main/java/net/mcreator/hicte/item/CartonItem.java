
package net.mcreator.hicte.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.hicte.init.HicteModTabs;

import java.util.List;

public class CartonItem extends Item {
	public CartonItem() {
		super(new Item.Properties().tab(HicteModTabs.TAB_HI_C_TE_MOD).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Una manera mas eco friendly de conseguir carton"));
		list.add(Component.literal("\"\u00BFEfectara en el sabor?\""));
	}
}
