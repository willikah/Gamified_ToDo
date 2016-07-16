package com.apps.kahlmann.gamifiedto_do;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    protected Char character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        character=(Char)getApplication();

        // Wenn schon gesetzt Namen anzeigen
        if(character.getName().length()!=0){
            TextView menu_name = (TextView) findViewById(R.id.menu_name);
            menu_name.setText(character.getName());
        }

        //QuestButton
        button_startAc(R.id.id_quests_button,"com.apps.kahlmann.gamifiedto_do.Create_Char" );

        //Quit Button
        quit_button();

    }

    //springe zu Activity mit Button
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
                    finish();
                    System.exit(0);
                }
            });
        }
    }
}
