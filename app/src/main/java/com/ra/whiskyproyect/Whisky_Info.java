package com.ra.whiskyproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;


public class Whisky_Info extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    ArrayList<String> names = new ArrayList<>();
    //Post names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whisky__info);


        list = findViewById(R.id.list_auctions);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, names);
        list.setAdapter(arrayAdapter);

        retrofit2.Call<List<Post>> call = Retro_fit_Api.getInstance().getMyApi().getWhiskys();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(retrofit2.Call<List<Post>> call, Response<List<Post>> response) {
                for (Post post: response.body()){

                    names.add(post.getNameWhisky());
                }
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(retrofit2.Call<List<Post>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Ocurrio un error", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent in = new Intent(this, Actions_Info_Details.class);
        // in.putExtra("base_currency", names.get(position).getBaseCurrency());
        startActivity(in);
    }

}