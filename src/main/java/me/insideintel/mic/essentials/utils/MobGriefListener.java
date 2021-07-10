package me.insideintel.mic.essentials.utils;

import me.insideintel.mic.essentials.MenInEssentials;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Snowman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.EntityBlockFormEvent;
import org.bukkit.event.entity.*;

public class MobGriefListener implements Listener {
    MenInEssentials plugin;
    public MobGriefListener(MenInEssentials plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityDestroyEntity(EntityDamageByEntityEvent event) {
        if (!event.getEntityType().isAlive() || event.getEntityType() == EntityType.ARMOR_STAND) {
            switch(event.getDamager().getType()) {
                case CREEPER:
                    if (!this.plugin.getConfig().getBoolean("mobgrief.creeper")) {
                        event.setCancelled(true);
                    }
                    break;
                case FIREBALL:
                    if (!this.plugin.getConfig().getBoolean("mobgrief.ghast")) {
                        event.setCancelled(true);
                    }
                    break;
                case WITHER_SKULL:
                    if (!this.plugin.getConfig().getBoolean("mobgrief.wither")) {
                        event.setCancelled(true);
                    }
            }

        }
    }

    @EventHandler
    public void onTurtleEggDestroy(EntityInteractEvent event) {
        if (event.getEntityType() == EntityType.ZOMBIE && !this.plugin.getConfig().getBoolean("mobgrief.turtle_egg")) {
            if (event.getBlock().getType() == Material.TURTLE_EGG) {
                event.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onVillagerPickUp(EntityPickupItemEvent event) {
        if (event.getEntityType() == EntityType.VILLAGER && !this.plugin.getConfig().getBoolean("mobgrief.villager")) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onEndermanPickup(EntityChangeBlockEvent event) {
        if (event.getEntityType() == EntityType.ENDERMAN && !this.plugin.getConfig().getBoolean("mobgrief.enderman")) {
            event.setCancelled(true);
            return;
        }
        if (event.getEntityType() == EntityType.SHEEP && !this.plugin.getConfig().getBoolean("mobgrief.sheep")) {
            event.setCancelled(true);
            return;
        }
        if (event.getEntityType() == EntityType.RABBIT && !this.plugin.getConfig().getBoolean("mobgrief.rabbit")) {
            event.setCancelled(true);
            return;
        }
        if (event.getEntityType() == EntityType.RAVAGER && !this.plugin.getConfig().getBoolean("mobgrief.ravager")) {
            event.setCancelled(true);
            return;
        }
        if (event.getEntityType() == EntityType.WITHER && !this.plugin.getConfig().getBoolean("mobgrief.wither")) {
            event.setCancelled(true);
            return;
        }
        if (event.getBlock().getType() == Material.FARMLAND && !this.plugin.getConfig().getBoolean("mobgrief.trampling")) {
            event.setCancelled(true);
            return;
        }
        if (event.getEntityType() == EntityType.SILVERFISH && !this.plugin.getConfig().getBoolean("mobgrief.silverfish")) {
            event.setCancelled(true);
            return;
        }
        if (event.getEntityType() == EntityType.SHEEP && !this.plugin.getConfig().getBoolean("mobgrief.sheep")) {
            event.setCancelled(true);
            return;
        }
        if (event.getEntityType() == EntityType.RABBIT && !this.plugin.getConfig().getBoolean("mobgrief.rabbit")) {
            event.setCancelled(true);
            return;
        }
        if (event.getEntityType() == EntityType.FALLING_BLOCK) {
            return;
        }
    }


    @EventHandler
    public void onSnowgolemStep(EntityBlockFormEvent event) {
        if (event.getEntity() instanceof Snowman && !this.plugin.getConfig().getBoolean("mobgrief.snowman")) {
            event.setCancelled(true);
            return;
        }
        if (event.getEntity() instanceof FallingBlock ) {
            return;
        }
    }

    @EventHandler
    public void onTNTExplode(EntityExplodeEvent event) {
        if (event.getEntityType() == EntityType.CREEPER && !this.plugin.getConfig().getBoolean("mobgrief.creeper")) {
            event.blockList().clear();
            return;
        }
        if (event.getEntityType() == EntityType.ENDER_DRAGON && !this.plugin.getConfig().getBoolean("mobgrief.enderdragon")) {
            if (!event.blockList().isEmpty()) {
                event.blockList().clear();
            }
            return;
        }
        if (!this.plugin.getConfig().getBoolean("mobgrief.wither")) {
            if (event.getEntityType() == EntityType.WITHER_SKULL || event.getEntityType() == EntityType.WITHER) {
                event.blockList().clear();
            }
            return;
        }
        if (event.getEntityType() == EntityType.FIREBALL && !this.plugin.getConfig().getBoolean("mobgrief.ghast")) {
            event.blockList().clear();
            return;
        }
    }


}
