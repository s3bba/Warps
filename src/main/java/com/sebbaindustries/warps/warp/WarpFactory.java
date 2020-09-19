package com.sebbaindustries.warps.warp;

import com.sebbaindustries.warps.Core;
import com.sebbaindustries.warps.warp.components.WarpLocation;
import com.sebbaindustries.warps.warp.components.WarpMetadata;
import com.sebbaindustries.warps.warp.components.WarpVisits;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author sebba
 * @version 1.0
 */
public class WarpFactory implements Warp {

    private final int ID;
    private String name;
    private String owner;
    private WarpLocation warpLocation;
    private WarpMetadata metadata;
    private WarpVisits visits;

    public WarpFactory() {
        this.ID = Core.gCore().warpBuffer.generateID();
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getOwnerName() {
        return owner;
    }

    @Override
    public void setOwner(String name) {
        this.owner = name;
    }

    @Override
    public void setOwner(Player player) {
        this.owner = player.getName();
    }

    @Override
    public WarpLocation locationData() {
        return this.warpLocation;
    }

    @Override
    public void setLocationData(Location loc) {
        this.warpLocation = new WarpLocation(loc);
    }

    @Override
    public void setLocationData(WarpLocation warpLocation) {
       this.warpLocation = warpLocation;
    }

    @Override
    public WarpMetadata getMetadata() {
        return this.metadata;
    }

    @Override
    public void setMetadata(WarpMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public WarpVisits getVisitData() {
        return this.visits;
    }

    @Override
    public void setVisitData(WarpVisits visitData) {
        this.visits = visitData;
    }
}
