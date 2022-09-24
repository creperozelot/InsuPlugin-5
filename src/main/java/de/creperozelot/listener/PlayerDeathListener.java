package de.creperozelot.listener;


import cn.nukkit.entity.Entity;
import cn.nukkit.event.entity.EntityDamageByEntityEvent;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.level.Sound;
import cn.nukkit.utils.TextFormat;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerDeathEvent;
import cn.nukkit.level.Level;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class PlayerDeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        String deathMessage = "";
        String playerName = event.getEntity().getName();
        String message = convertConfigTags(String.valueOf(creperozelot.getInstance().getConfig().getString("CUSTOM")), playerName);
        EntityDamageEvent ev = event.getEntity().getLastDamageCause();
        EntityDamageEvent.DamageCause cause = event.getEntity().getPlayer().getLastDamageCause().getCause();
        if (ev instanceof EntityDamageByEntityEvent) {
            Entity damager = ((EntityDamageByEntityEvent) ev).getDamager();
            if (damager instanceof Player && cause != EntityDamageEvent.DamageCause.PROJECTILE) {
                String itemName = ((Player) damager).getInventory().getItemInHand().getName();
                message = convertConfigTags(creperozelot.getInstance().getConfig().getString("KILL_BY_WEAPON"), playerName, damager.getName(), itemName);
            } else if (cause == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) {
                deathMessage = creperozelot.getInstance().getConfig().getString("ENTITY_EXPLOSION");
                message = convertConfigTags(deathMessage, playerName, damager.getName());
            } else if (cause == EntityDamageEvent.DamageCause.PROJECTILE) {
                deathMessage = creperozelot.getInstance().getConfig().getString("PROJECTILE");
                message = convertConfigTags(deathMessage, playerName, damager.getName());
            } else if (cause == EntityDamageEvent.DamageCause.LIGHTNING) {
                deathMessage = creperozelot.getInstance().getConfig().getString("LIGHTNING");
                message = convertConfigTags(deathMessage, playerName, damager.getName());
            } else if (cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK && !(damager instanceof Player)) {
                deathMessage = creperozelot.getInstance().getConfig().getString("MOB_ATTACK");
                message = convertConfigTags(deathMessage, playerName, damager.getName());
            }
        } else {
            message = getDeathMessage(cause, playerName);
        }
        String finalMsg = message;
        event.setDeathMessage(creperozelot.prefix + creperozelot.colorize("&8" + finalMsg));

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                player.kick(creperozelot.prefix + creperozelot.colorize("&cSystem") + creperozelot.colorize("\n&cDu bist Ausgeschieden."), false);
                player.setBanned(true);
            }
        }, 1000 * 5);
    }

    public String getDeathMessage(EntityDamageEvent.DamageCause cause, String playerName) {
        String deathMessage;
        String result;
        switch (cause) {
            case SUFFOCATION:
                deathMessage = creperozelot.getInstance().getConfig().getString("SUFFOCATION");
                result = convertConfigTags(deathMessage, playerName);
                return result;
            case FALL:
                deathMessage = creperozelot.getInstance().getConfig().getString("FALL");
                result = convertConfigTags(deathMessage, playerName);
                return result;
            case FIRE:
                deathMessage = creperozelot.getInstance().getConfig().getString("FIRE");
                result = convertConfigTags(deathMessage, playerName);
                return result;
            case FIRE_TICK:
                deathMessage = creperozelot.getInstance().getConfig().getString("FIRE_TICK");
                result = convertConfigTags(deathMessage, playerName);
                return result;
            case LAVA:
                deathMessage = creperozelot.getInstance().getConfig().getString("LAVA");
                result = convertConfigTags(deathMessage, playerName);
                return result;
            case DROWNING:
                deathMessage = creperozelot.getInstance().getConfig().getString("DROWNING");
                result = convertConfigTags(deathMessage, playerName);
                return result;
            case BLOCK_EXPLOSION:
                deathMessage = creperozelot.getInstance().getConfig().getString("BLOCK_EXPLOSION");
                result = convertConfigTags(deathMessage, playerName);
                return result;
            case LIGHTNING:
                deathMessage = creperozelot.getInstance().getConfig().getString("LIGHTNING");
                result = convertConfigTags(deathMessage, playerName);
                return result;
            case VOID:
                deathMessage = creperozelot.getInstance().getConfig().getString("VOID");
                result = convertConfigTags(deathMessage, playerName);
                return result;
            case SUICIDE:
                deathMessage = creperozelot.getInstance().getConfig().getString("SUICIDE");
                result = convertConfigTags(deathMessage, playerName);
                return result;
            case MAGIC:
                deathMessage = creperozelot.getInstance().getConfig().getString("MAGIC");
                result = convertConfigTags(deathMessage, playerName);
                return result;
        }
        deathMessage = creperozelot.getInstance().getConfig().getString("CUSTOM");
        result = convertConfigTags(deathMessage, playerName);

        return result;
    }

    public String convertConfigTags(String deathMessage, String playerName, String Attacker, String weaponName) {
        String newDeathMessage = "";
        newDeathMessage = deathMessage.replace("{Player}", playerName);
        newDeathMessage = newDeathMessage.replace("{Attacker}", Attacker);
        newDeathMessage = newDeathMessage.replace("{WeaponName}", weaponName);
        return newDeathMessage;
    }

    public String convertConfigTags(String deathMessage, String playerName, String Attacker) {
        String newDeathMessage = "";
        newDeathMessage = deathMessage.replace("{Player}", playerName);
        newDeathMessage = newDeathMessage.replace("{Attacker}", Attacker);
        return newDeathMessage;
    }

    public String convertConfigTags(String deathMessage, String playerName) {
        String newDeathMessage = "";
        newDeathMessage = deathMessage.replace("{Player}", playerName);
        return newDeathMessage;
    }

}
