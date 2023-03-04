
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

import net.mcreator.hicte.procedures.HICTEPlayerFinishesUsingItemProcedure;
import net.mcreator.hicte.init.HicteModTabs;
import net.mcreator.hicte.init.HicteModItems;

import java.util.List;

public class HICTEItem extends Item {
	public HICTEItem() {
		super(new Item.Properties().tab(HicteModTabs.TAB_HI_C_TE_MOD).stacksTo(24).fireResistant().rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(5f).alwaysEat()

				.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Solo az\u00FAcar y los demas ingredientes \u00BFDonde estan?"));
		list.add(Component.literal("\"Pero me siento tentado a probarlo\""));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(HicteModItems.HICT_EVACIO.get());
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HICTEPlayerFinishesUsingItemProcedure.execute(entity);
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
