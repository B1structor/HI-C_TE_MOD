
package net.mcreator.hicte.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.hicte.init.HicteModTabs;

import java.util.List;

public class HICTESOSPECHOSOItem extends Item {
	public HICTESOSPECHOSOItem() {
		super(new Item.Properties().tab(HicteModTabs.TAB_MOD).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Creo que no fue buena idea meterle eso a la formula"));
		list.add(Component.literal("\"\u00BFComo el plastico soporta algo que derrite hierro?\""));
	}
}
