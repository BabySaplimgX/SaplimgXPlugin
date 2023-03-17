package saplimgx.untitled;

import org.bukkit.plugin.java.JavaPlugin;
import saplimgx.untitled.handlers.TorchHandler;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        new TorchHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
