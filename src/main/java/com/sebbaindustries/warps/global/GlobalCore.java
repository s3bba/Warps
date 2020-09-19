package com.sebbaindustries.warps.global;

import com.sebbaindustries.warps.Core;
import com.sebbaindustries.warps.commands.CommandManager;
import com.sebbaindustries.warps.messages.Message;
import com.sebbaindustries.warps.settings.Setting;
import com.sebbaindustries.warps.utils.FileManager;
import com.sebbaindustries.warps.warp.WarpBuffer;
import com.sebbaindustries.warps.warp.components.WarpSettings;

/**
 * @author sebba
 * @version 1.0
 */
public class GlobalCore {

    public FileManager fileManager;
    public Setting setting;
    public Message message;
    public WarpBuffer warpBuffer;
    public WarpSettings warpSettings;
    public CommandManager commandManager;

    public GlobalCore(Core core) {
        this.fileManager = new FileManager(core);

        this.message = new Message();
        this.setting = new Setting();
        this.warpBuffer = new WarpBuffer();
        this.warpSettings = new WarpSettings();
        this.commandManager = new CommandManager(core);
    }

}
