package com.example.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class ViewPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        Button home;
        home = (Button) findViewById(R.id.buttonHome);

        home.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
             //   Intent downloadIntent = new Intent(v.getContext(), /*Home page code*/.class);
             //   v.getContext().startActivity(downloadIntent);
            }
        });

    }
}