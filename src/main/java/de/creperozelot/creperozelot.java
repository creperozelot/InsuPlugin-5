package de.creperozelot;


import cn.nukkit.command.SimpleCommandMap;
import cn.nukkit.item.ItemID;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;
import cn.nukkit.scheduler.ServerScheduler;
import cn.nukkit.scheduler.Task;
import cn.nukkit.utils.TextFormat;
import de.creperozelot.commands.*;
import de.creperozelot.listener.*;
import de.creperozelot.tasks.CheckTasks;
import de.creperozelot.tasks.WatingForHost;

public class creperozelot extends PluginBase {
    private static creperozelot instance;

    public static creperozelot getInstance() {
        return instance;
    }

    public static String prefix = "&a&lIN&2&lSU&r&7 &4&l5&r&7 |&f ";

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        //remove Crafting Recipe
        this.getServer().getCraftingManager().getRecipes().removeIf(recipe -> recipe.getResult().getId() == ItemID.STICK);
        //register
        this.registerListener();
        this.registerCommand();
        this.registerTasks();
        getLogger().info("§b========================");
        getLogger().info("");
        getLogger().info("§a§lIN§2§lSU§r§f System §aAktiviert");
        getLogger().info("§aby creperozelot");
        getLogger().info("");
        getLogger().info("§b========================");
    }

    @Override
    public void onDisable() {
        getLogger().info("§b========================");
        getLogger().info("");
        getLogger().info("§a§lIN§2§lSU§r§f System §cDeaktiviert");
        getLogger().info("§aby creperozelot");
        getLogger().info("");
        getLogger().info("§b========================");
    }
    private void registerCommand(){
        SimpleCommandMap commandMap = this.getServer().getCommandMap();
        commandMap.register("hilfe", new CommandTeleport("tp", "Teleportiert dich zu einem bestimten Spieler.", creperozelot.colorize("&cUsage: /tp <name>"), new String[]{"teleportplayer"}));
        commandMap.register("hilfe", new CommandSpectate("spectate", "Setzt dich in den Zuschauermodus", creperozelot.colorize("&cUsage: /spectate"), new String[]{"spec"}));
        commandMap.register("hilfe", new Commandsethost("sethost", "Setzt den Host oder auch gennant denn GameMaster", creperozelot.colorize("&cUsage: /sethost <name>"), new String[]{"seth"}));
        commandMap.register("hilfe", new CommandHelp("insu help", "Zeigt die Hilfe Nachricht für das Insu Plugin an.", creperozelot.colorize("&cUsage: /hilfe"), new String[]{"?", "h"}));
        commandMap.register("hilfe", new CommandEventHotGrass("event-hotgrass", "Startet das Event HotGrass", creperozelot.colorize("&cUsage: /hotgrass"), new String[]{"hotgrass"}));
        commandMap.register("hilfe", new CommandTest("test", "Ein Test command für Entwickler", creperozelot.colorize("&cUsage: /test"), new String[]{"dev:test"}));
        commandMap.register("hilfe", new CommandTest2("test2", "Ein Weiterer Entwickler Command", creperozelot.colorize("&cUsage: /test2"), new String[]{"dev:test2"}));
        commandMap.register("hilfe", new CommandStart("start", "Startet das Projekt INSU5", creperozelot.colorize("&cUsage: /start"), new String[]{"insu:start"}));
        commandMap.register("hilfe", new CommandEventWaterdamage("event-waterdamage", "Startet das Event WaterDamge", creperozelot.colorize("&/Usage: /waterdamage"), new String[]{"waterdamage"}));
    }

    //register Event
    private void registerListener(){
        PluginManager pluginmanager = this.getServer().getPluginManager();
        pluginmanager.registerEvents( new PlayerJoinListener(), this);
        pluginmanager.registerEvents( new PlayerQuitListener(), this);
        pluginmanager.registerEvents( new PlayerDeathListener(), this);
        pluginmanager.registerEvents( new MoveListener(this), this);
        pluginmanager.registerEvents(new ChatLIstener(), this);
    }

    //register Tasks
    private void registerTasks() {
        ServerScheduler scheduler = getServer().getScheduler();
        scheduler.scheduleRepeatingTask(new CheckTasks(), 20);
        scheduler.scheduleRepeatingTask((Task)new WatingForHost(), 20*2);
        getLogger().info("Registered Tasks");
    }

    public static String colorize(String msg) {
        return TextFormat.colorize('&', msg);
    }
}
