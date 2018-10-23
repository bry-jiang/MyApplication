package com.example.bryanjiang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button YourAccountB = (Button) findViewById(R.id.YourAccountB);
        YourAccountB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent YourAccountIntent = new Intent(getApplicationContext(), YourAccount.class);
                startActivity(YourAccountIntent);
            }
        });

        Button GamesB = (Button) findViewById(R.id.GamesB);
        GamesB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GamesIntent = new Intent(getApplicationContext(), Games.class);
                startActivity(GamesIntent);
            }
        });

        Button YourScoresB = (Button) findViewById(R.id.YourScoresB);
        YourScoresB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent YourScoresIntent = new Intent(getApplicationContext(), YourScores.class);
                startActivity(YourScoresIntent);
            }
        });
    }

}
