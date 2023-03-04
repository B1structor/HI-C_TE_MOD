
package net.mcreator.hicte.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.hicte.procedures.HICTEPACKPlayerFinishesUsingItemProcedure;
import net.mcreator.hicte.init.HicteModTabs;
import net.mcreator.hicte.init.HicteModItems;

import java.util.List;

public class HICTEPACKItem extends Item {
	public HICTEPACKItem() {
		super(new Item.Properties().tab(HicteModTabs.TAB_HI_C_TE_MOD).stacksTo(12).fireResistant().rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(15).saturationMod(10f).alwaysEat()

				.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 60;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Si uno era bueno el triple es lo mejor"));
		list.add(Component.literal("\"\u00BFAbra una forma mas compacta de transportarlo?\""));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(HicteModItems.HICT_EVACIO.get());
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HICTEPACKPlayerFinishesUsingItemProcedure.execute(entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
