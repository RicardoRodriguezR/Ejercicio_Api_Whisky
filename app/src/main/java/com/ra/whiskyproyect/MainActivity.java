package com.ra.whiskyproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import static com.ra.whiskyproyect.R.id.start;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        controladorWhisky();
        controladorDistilleies();
    }


    public void controladorWhisky() {

        ImageView entry = (ImageView) findViewById(R.id.pasar);

//hago clic y se abre el 2
        entry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent OpenView = new Intent(getApplicationContext(), Whisky_Info.class);
                startActivity(OpenView);
            }
        });

    }
    public void controladorDistilleies() {

        ImageView entry = (ImageView) findViewById(R.id.pasardesti);


        entry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent OpenView = new Intent(getApplicationContext(), Whisky_Destille_Info.class);
                startActivity(OpenView);
            }
        });

    }


}