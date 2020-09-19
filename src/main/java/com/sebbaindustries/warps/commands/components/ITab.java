package com.sebbaindustries.warps.commands.components;

import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ITab {

    List<String> complete(@NotNull CommandSender sender, @NotNull String[] args);

}
