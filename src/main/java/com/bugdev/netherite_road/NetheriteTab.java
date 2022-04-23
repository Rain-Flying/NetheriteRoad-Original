package com.bugdev.netherite_road;

import com.bugdev.netherite_road.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class NetheriteTab extends CreativeTabs {
    public NetheriteTab() {
        super("netherite_tab");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.NETHERITE_INGOT);
    }

    @Override
    @Nonnull
    public ResourceLocation getBackgroundImage() {
        return new ResourceLocation("netherite_road:textures/bg.png");
    }
}
