package com.spiteful.forbidden.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemStack;

import com.spiteful.forbidden.items.ItemMorphAxe;
import com.spiteful.forbidden.items.ItemMorphPickaxe;
import com.spiteful.forbidden.items.ItemMorphShovel;
import com.spiteful.forbidden.items.ItemMorphSword;

public class EnchantmentEternal extends Enchantment {
	public EnchantmentEternal(int id) {
		super(id, 0, EnumEnchantmentType.digger);
		setName("eternal");
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public int getMinEnchantability(int par1) {
		return 70;
	}

	@Override
	public int getMaxEnchantability(int par1) {
		return super.getMinEnchantability(par1) + 50;
	}

	@Override
	public boolean canApplyTogether(Enchantment ench) {
		return super.canApplyTogether(ench) && ench.effectId != Enchantment.unbreaking.effectId && ench.effectId != DarkEnchantments.educational.effectId;
	}

	@Override
	public boolean canApply(ItemStack item) {
		return (item.getItem() instanceof ItemMorphPickaxe || item.getItem() instanceof ItemMorphAxe || item.getItem() instanceof ItemMorphSword || item.getItem() instanceof ItemMorphShovel);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		return false;
	}
}