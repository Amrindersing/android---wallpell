package com.example.amrinder.wallpell.networking;

import com.bluelinelabs.logansquare.LoganSquare;
import com.example.amrinder.wallpell.Model.ApiHelper;
import com.example.amrinder.wallpell.Model.Wallpaper;
import com.example.amrinder.wallpell.Util.AppConstants;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by amrinder on 06-10-2016.
 */
public class FetchData {

    private static ApiHelper apiHelper;

    public static List<Wallpaper> getJsonData() throws IOException {

        final OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(AppConstants.API_URL.concat(AppConstants.API_KEY).concat(AppConstants.API_METHOD))
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

                apiHelper = LoganSquare.parse(response.body().toString(), ApiHelper.class);
            }
        });


        return apiHelper.getWallpapers();
    }

}
