package com.sebbaindustries.warps.commands.actions;

import com.sebbaindustries.warps.commands.components.CommandFactory;
import com.sebbaindustries.warps.commands.components.ICmd;
import com.sebbaindustries.warps.commands.components.ITab;
import com.sebbaindustries.warps.utils.warps.components.NameParser;
import org.bukkit.command.CommandSender;
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

    }

    @Override
    public List<String> complete(@NotNull CommandSender sender, @NotNull String[] args) {
        List<String> tab = new ArrayList<>();
        if (args.length == 1) {
            tab.add("§7[§6Ime Warp-a§7]");
        }
        return tab;
    }
}
