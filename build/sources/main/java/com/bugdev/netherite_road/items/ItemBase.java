package com.bugdev.netherite_road.items;



import com.bugdev.netherite_road.NetheriteRoad;
import com.bugdev.netherite_road.NetheriteTab;
import com.bugdev.netherite_road.init.ModItems;
import com.bugdev.netherite_road.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(new NetheriteTab());
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        NetheriteRoad.proxy.registerItemRenderer(this, 0, "inventory");
    }

    public boolean hasCustomEntity(ItemStack stack) {
        return true;
    }

    public Entity createEntity(World world,Entity location, ItemStack itemstack) {
        return new fireimmune(world,location,itemstack);
    }
}
