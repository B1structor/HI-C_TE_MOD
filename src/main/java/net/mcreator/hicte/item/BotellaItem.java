
package net.mcreator.hicte.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.hicte.init.HicteModTabs;

import java.util.List;

public class BotellaItem extends Item {
	public BotellaItem() {
		super(new Item.Properties().tab(HicteModTabs.TAB_MOD).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("La evolucion de la caja de jugo"));
		list.add(Component.literal("\"Mucho mas grande y mucho mas fuerte\""));
	}
}
