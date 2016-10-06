package com.example.amrinder.wallpell.Model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * Created by amrinder on 06-10-2016.
 */

@JsonObject
public class Wallpaper {

    @JsonField(name = "id")
    private String WALL_ID;
    @JsonField(name = "width")
    private String WALL_WIDTH;
    @JsonField(name = "height")
    private String WALL_HEIGHT;
    @JsonField(name = "file_size")
    private String WALL_SIZE;
    @JsonField(name = "url_image")
    private String WALL_URL;
    @JsonField(name = "url_thumb")
    private String WALL_THMB;

    public Wallpaper(String WALL_ID, String WALL_WIDTH, String WALL_HEIGHT, String WALL_SIZE, String WALL_URL, String WALL_THMB) {
        this.WALL_ID = WALL_ID;
        this.WALL_WIDTH = WALL_WIDTH;
        this.WALL_HEIGHT = WALL_HEIGHT;
        this.WALL_SIZE = WALL_SIZE;
        this.WALL_URL = WALL_URL;
        this.WALL_THMB = WALL_THMB;
    }

    public String getWALL_ID() {
        return WALL_ID;
    }

    public void setWALL_ID(String WALL_ID) {
        this.WALL_ID = WALL_ID;
    }

    public String getWALL_WIDTH() {
        return WALL_WIDTH;
    }

    public void setWALL_WIDTH(String WALL_WIDTH) {
        this.WALL_WIDTH = WALL_WIDTH;
    }

    public String getWALL_HEIGHT() {
        return WALL_HEIGHT;
    }

    public void setWALL_HEIGHT(String WALL_HEIGHT) {
        this.WALL_HEIGHT = WALL_HEIGHT;
    }

    public String getWALL_SIZE() {
        return WALL_SIZE;
    }

    public void setWALL_SIZE(String WALL_SIZE) {
        this.WALL_SIZE = WALL_SIZE;
    }

    public String getWALL_URL() {
        return WALL_URL;
    }

    public void setWALL_URL(String WALL_URL) {
        this.WALL_URL = WALL_URL;
    }

    public String getWALL_THMB() {
        return WALL_THMB;
    }

    public void setWALL_THMB(String WALL_THMB) {
        this.WALL_THMB = WALL_THMB;
    }
}
