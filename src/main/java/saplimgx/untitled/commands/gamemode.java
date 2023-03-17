package saplimgx.untitled.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(args.length == 1){
                if(args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")){

                    p.sendMessage("je staat nu in survival!");
                    p.setGameMode(GameMode.SURVIVAL);

                } else if(args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")){

                    p.sendMessage("je staat nu in creative!");
                    p.setGameMode(GameMode.CREATIVE);

                }else if(args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")){

                    p.sendMessage("je staat nu in adventure!");
                    p.setGameMode(GameMode.ADVENTURE);

                }else if(args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")){

                    p.sendMessage("je staat nu in spectator!");
                    p.setGameMode(GameMode.SPECTATOR);

                }

                }
            } return true;
        }
    }
