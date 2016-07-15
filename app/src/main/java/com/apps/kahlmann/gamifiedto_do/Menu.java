package com.apps.kahlmann.gamifiedto_do;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    private TextView menu_name;
    private static Button quit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();

        // Namen anzeigen

        menu_name = (TextView) findViewById(R.id.menu_name);
        menu_name.setText("Welcome " + intent.getStringExtra("character_name"));
             quit_button();

    }

    //Quit Button
    public void quit_button() {

        quit_button = (Button)findViewById(R.id.id_quit_button);
        quit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), CreateChar.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);

            }
        });
    }
}
