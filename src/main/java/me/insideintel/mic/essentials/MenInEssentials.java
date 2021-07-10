package me.insideintel.mic.essentials;

import me.insideintel.mic.essentials.commands.*;
import me.insideintel.mic.essentials.utils.MobGriefListener;
import me.insideintel.mic.essentials.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public class MenInEssentials extends JavaPlugin {
    private static MenInEssentials instance;
    private static Utils utils;

    @Override
    public void onEnable() {
        instance = this;
        utils = new Utils();
        this.saveDefaultConfig();
        getCommand("mobgrief").setExecutor(new MobGrief(this));
        getCommand("mobgrief").setTabCompleter(new MobGrief(this));
        getServer().getPluginManager().registerEvents(new MobGriefListener(this), this);
    }

    public static Utils getUtils() {
        return utils;
    }
    public static MenInEssentials getInstance() {
        return instance;
    }
}
