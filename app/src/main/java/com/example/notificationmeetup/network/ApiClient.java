package com.example.notificationmeetup.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by meltemyildirim on 4/18/17.
 */


/**
 * Implementation for retrofit connection
 * Instantiating the Retrofit instance
 */
public class ApiClient {
    public static final String BASE_URL = "http://api.meetup.com/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
