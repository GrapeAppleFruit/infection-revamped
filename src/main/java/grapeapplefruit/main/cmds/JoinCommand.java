package grapeapplefruit.main.cmds;

import grapeapplefruit.main.Game;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Set;

public class JoinCommand implements CommandExecutor {

    Set<String> inf = Game.infected;
    int ampl = Game.playerAmount;
    int infam = Game.infAmount;
    boolean gmst = Game.serverStatus;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("join")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                if (gmst = false){
                    player.sendMessage(ChatColor.RED + "The game has not started yet.");
                } else if (gmst = true){
                    player.sendMessage(ChatColor.GREEN + "You've joined the game.");
                    inf.add(player.getName());
                    infam = infam + 1;
                }
            }
        }
        return false;
    }
}
