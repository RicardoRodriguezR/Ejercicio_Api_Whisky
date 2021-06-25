package com.ra.whiskyproyect;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retro_fit_Api {
    private static Retro_fit_Api instance = null;
    private PostService myApi;

    private Retro_fit_Api(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(PostService.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        myApi = retrofit.create(PostService.class);
    }

    public static synchronized Retro_fit_Api getInstance(){
        if (instance ==null) {
            instance = new Retro_fit_Api();
        }

        return instance;
    }
    public PostService getMyApi(){

        return myApi;
    }
}
