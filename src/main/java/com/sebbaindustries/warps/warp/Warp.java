package com.sebbaindustries.warps.warp;

import com.sebbaindustries.warps.warp.components.WarpLocation;
import com.sebbaindustries.warps.warp.components.WarpMetadata;
import com.sebbaindustries.warps.warp.components.WarpVisits;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author sebba
 * @version 1.0
 */
public interface Warp {

    int getID();

    String getName();
    void setName(String name);

    String getOwnerName();
    void setOwner(String name);
    void setOwner(Player player);

    WarpLocation locationData();
    void setLocationData(Location loc);
    void setLocationData(WarpLocation loc);

    WarpMetadata getMetadata();
    void setMetadata(WarpMetadata metadata);

    WarpVisits getVisitData();
    void setVisitData(WarpVisits visitData);

    static Warp createWarp(String name, Player owner) {
        WarpFactory factory = new WarpFactory();
        factory.setName(name);
        factory.setOwner(owner);
        factory.setLocationData(new WarpLocation(owner.getLocation()));
        factory.setMetadata(new WarpMetadata());
        factory.setVisitData(new WarpVisits());
        return factory;
    }

    static Warp newWarp(String name, String owner, Location loc) {
        WarpFactory factory = new WarpFactory();
        factory.setName(name);
        factory.setOwner(owner);
        factory.setLocationData(new WarpLocation(loc));
        factory.setMetadata(new WarpMetadata());
        factory.setVisitData(new WarpVisits());
        return factory;
    }

}
