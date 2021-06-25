package com.ra.whiskyproyect;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retro_fit_destiller {
    private static Retro_fit_destiller instance = null;
    private PostService myApi1;

    private Retro_fit_destiller(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(PostService.BASE_URL1).addConverterFactory(GsonConverterFactory.create()).build();
        myApi1 = retrofit.create(PostService.class);
    }

    public static synchronized Retro_fit_destiller getInstance(){
        if (instance ==null) {
            instance = new Retro_fit_destiller();
        }

        return instance;
    }
    public PostService getMyApi(){

        return myApi1;
    }
}
