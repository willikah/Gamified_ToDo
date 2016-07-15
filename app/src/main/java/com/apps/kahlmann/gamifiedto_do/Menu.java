package com.apps.kahlmann.gamifiedto_do;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }//Für Quit

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button_startAc(R.id.id_quests_button,"com.apps.kahlmann.gamifiedto_do.Create_Char" );


        Intent intent = getIntent();

        // Namen anzeigen

        if(intent.getStringExtra("character_name")!=null) {
            TextView menu_name = (TextView) findViewById(R.id.menu_name);
            menu_name.setText("Welcome " + intent.getStringExtra("character_name"));
        }


        //button_startAc();
        quit_button();

    }

    public void button_startAc(int id, final String Ac) {

        Button button = (Button)findViewById(id);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Ac);
                    startActivity(intent);
                }
            });
        }

    }

    //Quit Button
    public void quit_button() {

        Button quit_button = (Button)findViewById(R.id.id_quit_button);
        if (quit_button != null) {
            quit_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    /*Intent intent = new Intent(getApplicationContext(), CreateChar.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("EXIT", true);
                    startActivity(intent);*/

                    finish();
                    System.exit(0);
                }
            });
        }
    }
}
