package com.sebbaindustries.warps.gui;

public abstract class GUI {

    public abstract void open();

    private int size = 1;

    public void setSize(int size) {
        this.size = size;
    }

}
