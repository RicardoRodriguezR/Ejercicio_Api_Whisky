package com.ra.whiskyproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.Call;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class Whisky_Destille_Info extends AppCompatActivity {
    ListView list;
    ArrayList<String> names1 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whisky__destille__info);

        list = findViewById(R.id.list_auctions);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, names1);
        list.setAdapter(arrayAdapter);

        retrofit2.Call<List<PostDestiller>> call = Retro_fit_destiller.getInstance().getMyApi().getDistilleries();
        call.enqueue(new Callback<List<PostDestiller>>() {
            @Override
            public void onResponse(retrofit2.Call<List<PostDestiller>> call, Response<List<PostDestiller>> response) {
                for (PostDestiller post : response.body())
                {
                    names1.add(post.getNameDistilleries());
                }
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(retrofit2.Call<List<PostDestiller>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Ocurrio un error", Toast.LENGTH_LONG).show();
            }
        });
    }
}