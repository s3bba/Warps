package com.sebbaindustries.warps.global;

import com.sebbaindustries.warps.Core;

/**
 * @author sebba
 * @version 1.0
 */
public class ServerPlugin {

    private Core core;

    private void coreDump() {
        throw new IllegalAccessError("Plugin core dumped due to illegal access of ServerPlugin class!");
    }

    public static ServerPlugin INSTANCE() {
        return new ServerPlugin();
    }

    public final void load(Core core) {
        this.core = core;
    }

    public final void initialize() {
        if (core == null) {
            coreDump();
            return;
        }
        Core.globalCore = new GlobalCore(core);
    }

    public final void terminate() {
        if (core == null) {
            coreDump();
            return;
        }
    }

}
