package com.sebbaindustries.warps.warp.components;

/**
 * @author sebba
 * @version 1.0
 */
public class WarpMetadata {

    private String category;
    private boolean allowRename;

    public WarpMetadata() {
        category = "Deff";
        allowRename = false;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean allowRename() {
        return allowRename;
    }

    public void setAllowRename(boolean allowRename) {
        this.allowRename = allowRename;
    }
}
