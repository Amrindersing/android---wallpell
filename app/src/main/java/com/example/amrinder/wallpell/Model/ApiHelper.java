package com.example.amrinder.wallpell.Model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.List;

/**
 * Created by amrinder on 07-10-2016.
 */

@JsonObject
public class ApiHelper {

    @JsonField(name = "success")
    private String success;

    @JsonField(name = "wallpapers")
    private List<Wallpaper> wallpapers;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public List<Wallpaper> getWallpapers() {
        return wallpapers;
    }

    public void setWallpapers(List<Wallpaper> wallpapers) {
        this.wallpapers = wallpapers;
    }
}
