package com.example.amrinder.wallpell.retrofit;

import com.example.amrinder.wallpell.modals.ApiHelper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by amrinder on 08-10-2016.
 */
public interface WallpaperApi {

    @GET("/api2.0/get.php")
    Call<ApiHelper> loadWallpapers(@Query("auth") String apikey, @Query("method") String method);
}
