package com.example.amrinder.wallpell.modals;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by amrinder on 07-10-2016.
 */

public class ApiHelper {

    private List<Wallpaper> wallpapers;

    public ApiHelper() {

        wallpapers = new ArrayList<>();
    }

    public List<Wallpaper> getWallpapers() {
        return wallpapers;
    }

    public void setWallpapers(List<Wallpaper> wallpapers) {
        this.wallpapers = wallpapers;
    }
}
