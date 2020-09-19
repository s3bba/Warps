package com.sebbaindustries.warps.warp.components;

import com.sebbaindustries.warps.Core;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author sebba
 * @version 1.0
 */
public class WarpVisits {

    private int allVisits = 0;
    private HashMap<String, Integer> playerVisitsMap = new HashMap<>();
    private List<Integer> visits = new ArrayList<>(Core.gCore().warpSettings.countedVisitDays);

    public int getAllVisits() {
        return allVisits;
    }

    public void addVisit(Player player) {
        if (!playerVisitsMap.containsKey(player.getName())) {
            playerVisitsMap.put(player.getName(), 1);
            return;
        }

        int currentPlayerVisits = playerVisitsMap.get(player.getName());
        if (currentPlayerVisits > Core.globalCore.warpSettings.maxCountedVisitsPerPlayer) {
            return;
        }

        allVisits++;
        playerVisitsMap.put(player.getName(), (currentPlayerVisits + 1));
        visits.set(0, (visits.get(0) + 1));
    }

}
