package com.sebbaindustries.warps.utils;

import com.sebbaindustries.warps.Core;

import java.io.File;

/**
 * @author sebba
 * @version 1.0
 */
public class FileManager {

    private Core core;

    public FileManager(Core core) {
        this.core = core;
        generateHikariProps();
        generateREADME();
        generateMessages();
    }

     /*
     hikari.properties File
     */

    /**
     * Generates hikari.properties File
     */
    public final void generateHikariProps() {
        File README = new File(core.getDataFolder(), "hikari.properties");

        if (!README.exists()) {
            core.saveResource("hikari.properties", false);
        }
    }

    /*
    README.md File
     */

    /**
     * Generates README.md File
     */
    public final void generateREADME() {
        File README = new File(core.getDataFolder(), "README.md");

        if (!README.exists()) {
            core.saveResource("README.md", false);
        }
    }

    /*
    messages.properties
     */

    public File messages;

    /**
     * Generates messages.properties File
     */
    public final void generateMessages() {
        if (messages == null) {
            messages = new File(core.getDataFolder(), "messages.properties");
        }
        if (!messages.exists()) {
            core.saveResource("messages.properties", false);
        }
    }

}
