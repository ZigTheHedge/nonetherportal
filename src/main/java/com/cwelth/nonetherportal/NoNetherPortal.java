package com.cwelth.nonetherportal;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import org.slf4j.Logger;

@Mod("nonetherportal")
public class NoNetherPortal {
  private static final Logger LOGGER = LogUtils.getLogger();
  
  public NoNetherPortal() {
    MinecraftForge.EVENT_BUS.register(this);
  }
  
  @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
  public static class RegistryEvents {
    @SubscribeEvent
    public static void onPortalIgnition(BlockEvent.PortalSpawnEvent event) {
      event.setCanceled(true);
    }
  }
}