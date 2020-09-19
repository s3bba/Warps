package com.sebbaindustries.warps.commands;

import com.sebbaindustries.warps.Core;
import com.sebbaindustries.warps.commands.actions.*;
import com.sebbaindustries.warps.commands.components.CommandFactory;
import com.sebbaindustries.warps.commands.components.ICmd;
import com.sebbaindustries.warps.commands.components.ITab;
import org.bukkit.command.*;
import org.bukkit.util.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author sebba
 * @version 1.0
 */
public class CommandManager implements CommandExecutor, TabCompleter {

    private final List<CommandFactory> commands = new ArrayList<>();

    public CommandManager(Core core) {

        Objects.requireNonNull(core.getCommand("delwarp")).setExecutor(this);
        Objects.requireNonNull(core.getCommand("delwarp")).setTabCompleter(this);
        commands.add(new DelWarp());

        Objects.requireNonNull(core.getCommand("listwarps")).setExecutor(this);
        Objects.requireNonNull(core.getCommand("listwarps")).setTabCompleter(this);
        commands.add(new ListWarps());

        Objects.requireNonNull(core.getCommand("movewarp")).setExecutor(this);
        Objects.requireNonNull(core.getCommand("movewarp")).setTabCompleter(this);
        commands.add(new MoveWarp());

        Objects.requireNonNull(core.getCommand("reloadwarps")).setExecutor(this);
        Objects.requireNonNull(core.getCommand("reloadwarps")).setTabCompleter(this);
        commands.add(new ReloadWarps());

        Objects.requireNonNull(core.getCommand("renamewarp")).setExecutor(this);
        Objects.requireNonNull(core.getCommand("renamewarp")).setTabCompleter(this);
        commands.add(new RenameWarp());

        Objects.requireNonNull(core.getCommand("setwarp")).setExecutor(this);
        Objects.requireNonNull(core.getCommand("setwarp")).setTabCompleter(this);
        commands.add(new SetWarp());

        Objects.requireNonNull(core.getCommand("warp")).setExecutor(this);
        Objects.requireNonNull(core.getCommand("warp")).setTabCompleter(this);
        commands.add(new Warp());

        Objects.requireNonNull(core.getCommand("warps")).setExecutor(this);
        Objects.requireNonNull(core.getCommand("warps")).setTabCompleter(this);
        commands.add(new Warps());

    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        commands.forEach(cmd -> {
            if (cmd.command().equalsIgnoreCase(label)) {
                if (!sender.hasPermission(cmd.permission())) {
                    // TODO: add no permission message
                    sender.sendMessage("No permission!");
                    return;
                }
                ((ICmd) cmd).execute(sender, args);
            }
        });

        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        for (CommandFactory cmd : commands) {
            if (cmd.command().equalsIgnoreCase(label)) {
                List<String> tab = ((ITab) cmd).complete(sender, args);
                return StringUtil.copyPartialMatches(args[args.length - 1], tab, new ArrayList<>(tab.size()));
            }
        }
        return null;
    }
}
