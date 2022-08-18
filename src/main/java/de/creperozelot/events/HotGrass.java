package de.creperozelot.events;

import de.creperozelot.commands.Storage;

import cn.nukkit.Player;
import cn.nukkit.block.BlockGrass;
import cn.nukkit.entity.Entity;


public class HotGrass extends BlockGrass {
    boolean HotGrass = new Storage().Hotgrass;
    public void doEntityCollide(Entity entity) {
        if (entity instanceof Player) {
            if (HotGrass) {
                ((Player)entity).sendTitle("&6&lHot Grass", "&6Du darfst dich nicht auf grass Befinden");
                entity.setOnFire(3);
            }
        }
    }
}