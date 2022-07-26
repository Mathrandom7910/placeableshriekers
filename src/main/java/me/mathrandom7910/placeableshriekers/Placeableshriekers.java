package me.mathrandom7910.placeableshriekers;

import org.bukkit.plugin.java.JavaPlugin;

public final class Placeableshriekers extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
