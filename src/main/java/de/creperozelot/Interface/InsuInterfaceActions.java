package de.creperozelot.Interface;

import de.creperozelot.creperozelot;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.window.FormWindowCustom;
import cn.nukkit.form.window.FormWindowSimple;

public class InsuInterfaceActions implements Listener {

    @EventHandler
    public void onFormRespond(PlayerFormRespondedEvent event) {
        Player player = event.getPlayer();

        if (event.getWindow().wasClosed()) return;

        if (event.getWindow() instanceof FormWindowSimple) {
            FormWindowSimple formWindowSimple = (FormWindowSimple) event.getWindow();
            if (((FormWindowCustom) event.getWindow()).getTitle().equals("§c§lInsu Manager"));
            player.sendMessage(creperozelot.colorize(creperozelot.prefix + "§aDu hast das Interface geschlossen"));



        }
    }

}
