package com.example.amrinder.wallpell.networking;

import com.example.amrinder.wallpell.Model.Wallpaper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by amrinder on 06-10-2016.
 */
public class JsonParser {

    public static List<Wallpaper> parseJsonData(String json) throws JSONException {

        JSONObject jsonObject = new JSONObject(json);
        JSONArray jsonArray = jsonObject.getJSONArray("results");
        return null;
    }
}
