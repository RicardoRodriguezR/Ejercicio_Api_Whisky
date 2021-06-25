package com.ra.whiskyproyect;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface PostService {

    String BASE_URL = "https://whiskyhunter.net/api/";
    @GET("auctions_info")
    Call<List<Post>> getWhiskys();

    String BASE_URL1 = "https://whiskyhunter.net/api/";
    @GET("distilleries_info")
    Call<List<PostDestiller>> getDistilleries();
}
