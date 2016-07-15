package com.apps.kahlmann.gamifiedto_do;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateChar extends AppCompatActivity {

    private static Button start_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }//Für Quit

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_char);

        start_button();

    }

    //Wenn Startbutton geklickt wird...
    public void start_button() {
        start_button = (Button)findViewById(R.id.id_start_button);
        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Nimm Text aus Feld
                EditText name = (EditText)findViewById(R.id.id_Name_field);

                //Starte Menü
                Intent menu_ac = new Intent("com.apps.kahlmann.gamifiedto_do.Menu");
                menu_ac.putExtra("character_name",name.getText().toString()); // Übergib Textfeld
                startActivity(menu_ac);
            }
        });
    }
}
