package com.example.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button view, update, security, progress, home;

        view = (Button) findViewById(R.id.buttonView);
        update = (Button) findViewById(R.id.buttonUpdate);
        security = (Button) findViewById(R.id.buttonSecurity);
        progress = (Button) findViewById(R.id.buttonProgress);
        home = (Button) findViewById(R.id.buttonHome);

        // Code to go to another activity -
        view.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent downloadIntent = new Intent(v.getContext(), ViewPage.class);



                v.getContext().startActivity(downloadIntent);
            }
        });
    }
}