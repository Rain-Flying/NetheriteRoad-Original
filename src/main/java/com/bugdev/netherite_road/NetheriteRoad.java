package com.bugdev.netherite_road;

import com.bugdev.netherite_road.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = NetheriteRoad.MOD_ID,
        name = NetheriteRoad.MOD_NAME,
        version = NetheriteRoad.VERSION
)
public class NetheriteRoad {
    @SidedProxy(clientSide = "com.bugdev.netherite_road.proxy.ClientProxy", serverSide = "com.bugdev.netherite_road.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static final String MOD_ID = "netherite_road";
    public static final String MOD_NAME = "NetheriteRoad";
    public static final String VERSION = "0.0.5";
    @Mod.Instance(MOD_ID)
    public static NetheriteRoad INSTANCE;
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
    }
}