package com.darkravenscripts;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Level;

public class Main extends JavaPlugin {
//    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        super.onDisable();
        this.getLogger().log(Level.INFO, "Admin Panel Plugin Loaded");
    }



}