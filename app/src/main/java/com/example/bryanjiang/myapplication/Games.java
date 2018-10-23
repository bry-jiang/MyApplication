package com.example.bryanjiang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Games extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        Button SlidingTiles = (Button) findViewById(R.id.SlidingTilesB);
        SlidingTiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SlidingTilesIntent = new Intent(getApplicationContext(), SlidingTiles.class);
                startActivity(SlidingTilesIntent);
            }
        });


    }
}
