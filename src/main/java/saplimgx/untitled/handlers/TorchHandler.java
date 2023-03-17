package saplimgx.untitled.handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import saplimgx.untitled.Plugin;

public class TorchHandler implements Listener {
    public TorchHandler(Plugin plugin) {
      //*  Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onTorchPlace(BlockPlaceEvent event) {
        Block block = event.getBlock();

        if (block.getType() != Material.TORCH){
            return;
        }
        Bukkit.getLogger().info("A torch was placed!");

    }
}
