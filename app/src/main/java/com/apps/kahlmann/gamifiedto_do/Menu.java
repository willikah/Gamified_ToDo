package com.apps.kahlmann.gamifiedto_do;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    private TextView menu_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        Intent intent = getIntent();

        // Namen anzeigen

        menu_name = (TextView) findViewById(R.id.menu_name);
        menu_name.setText("Welcome " + intent.getStringExtra("character_name"));

    }
}
