package com.bugdev.netherite_road;

import com.bugdev.netherite_road.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NetheriteTab extends CreativeTabs {
    public NetheriteTab() {
        super("netherite_tab");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.NETHERITE_INGOT);
    }
}
