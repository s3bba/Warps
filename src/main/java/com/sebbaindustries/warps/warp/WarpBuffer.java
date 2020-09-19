package com.sebbaindustries.warps.warp;

import java.util.HashMap;

public class WarpBuffer {

    private final HashMap<String, Warp> warpBufferMap = new HashMap<>();
    private int nextID = 0;

    public int generateID() {
        nextID++;
        return nextID;
    }

    public boolean addWarp(Warp warp) {
        if (getWarp(warp.getName()) != null) return false;
        warpBufferMap.put(warp.getName(), warp);
        return true;
    }

    public boolean deleteWarp(String warpName) {
        if (getWarp(warpName) == null) return false;
        warpBufferMap.remove(warpName);
        return true;
    }

    public void updateWarp(Warp warp) {
        warpBufferMap.put(warp.getName(), warp);
    }

    public Warp getWarp(String warpName) {
        return warpBufferMap.getOrDefault(warpName, null);
    }

    public HashMap<String, Warp> getWarpBufferMap() { return warpBufferMap; }

}
