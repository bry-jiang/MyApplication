package com.example.bryanjiang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class YourAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_account);

        Button SignUpB = (Button) findViewById(R.id.SignUpB);
        SignUpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CreateNewAccountIntent = new Intent(getApplicationContext(), CreateNewAccount.class);
                startActivity(CreateNewAccountIntent);
            }
        });

    }

}
