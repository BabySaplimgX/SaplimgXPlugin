package saplimgx.untitled;

import org.bukkit.plugin.java.JavaPlugin;
import saplimgx.untitled.commands.Fly;
import saplimgx.untitled.commands.gamemode;
import saplimgx.untitled.handlers.TorchHandler;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("fly").setExecutor(new Fly());
        getCommand("gm").setExecutor(new gamemode());

        new TorchHandler(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
