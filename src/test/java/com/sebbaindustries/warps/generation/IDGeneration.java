package com.sebbaindustries.warps.generation;

public class IDGeneration {

    private int ID = 0;

    public int genID() {
        ID++;
        return ID;
    }

    public void generateIDs(int IDs) {
        for (int i = 0; i < IDs; i++) {
            genID();
        }
    }

}
