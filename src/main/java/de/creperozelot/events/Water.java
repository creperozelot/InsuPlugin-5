package de.creperozelot.events;

import cn.nukkit.Player;
import cn.nukkit.block.BlockWater;
import cn.nukkit.entity.Entity;
import cn.nukkit.potion.Effect;

public class Water extends BlockWater {
    public void onEntityCollide(Entity entity) {
        if (entity instanceof Player) {
            ((Player)entity).sendTitle("&6&lWasser ist Säure", "&6Halte dich von Wasser fern");
            entity.addEffect(Effect.getEffect(19).setDuration(60).setAmplifier(2).setVisible(false));
        }
    }
}

