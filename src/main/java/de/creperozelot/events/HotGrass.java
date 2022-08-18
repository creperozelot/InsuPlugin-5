package de.creperozelot.events;

import cn.nukkit.Player;
import cn.nukkit.block.BlockGrass;
import cn.nukkit.entity.Entity;
import de.creperozelot.creperozelot;

public class HotGrass extends BlockGrass {
    public void doEntityCollide(Entity entity) {
        if (entity instanceof Player) {
            ((Player)entity).sendTitle(creperozelot.colorize("&a&lHotGrass"), creperozelot.colorize("&6Du darfst dich nicht auf grass Befinden"), 0, 40, 20);
            entity.setOnFire(60);
        }
    }
}
