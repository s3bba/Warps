package com.sebbaindustries.warps.commands.actions;

import com.sebbaindustries.warps.commands.components.CommandFactory;
import com.sebbaindustries.warps.commands.components.ICmd;
import com.sebbaindustries.warps.commands.components.ITab;
import com.sebbaindustries.warps.utils.warps.components.NameParser;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sebba
 * @version 1.0
 */
public class SetWarp extends CommandFactory implements ICmd, ITab {

    @Override
    public String command() {
        return "setwarp";
    }

    @Override
    public String permission() {
        return "warps.setwarp";
    }

    @Override
    public void execute(@NotNull CommandSender sender, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("&cNo Console Support!");
            return;
        }
        if (args.length == 0) {
            sender.sendMessage("&cHelp!");
            return;
        }
        if (args[0].equalsIgnoreCase("~")) {
            createServerWarp(sender, args);
            return;
        }
        sender.sendMessage("warp");
    }

    private void createServerWarp(@NotNull CommandSender sender, @NotNull String[] args) {
        Player player = (Player) sender;
        if (player.getName().equalsIgnoreCase("edrfsedf")) {
            sender.sendMessage("&");
        }
        sender.sendMessage("off warp");
    }

    @Override
    public List<String> complete(@NotNull CommandSender sender, @NotNull String[] args) {
        List<String> tab = new ArrayList<>();
        if (args.length == 1) {
            tab.add("§7[§6Ime Warp-a§7]");
        }
        if (args.length == 2 && args[0].equalsIgnoreCase("~") && sender.hasPermission("warps.setwarp.staff")) {
            tab.add("§7[§6Ime Warp-a§7]");
        }
        return tab;
    }
}
