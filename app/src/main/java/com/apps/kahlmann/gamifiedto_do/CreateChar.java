package com.apps.kahlmann.gamifiedto_do;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
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
        hit_enter();

    }

    public void start_button() {

        //Wenn Startbutton geklickt wird...
        start_button = (Button)findViewById(R.id.id_start_button);
        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Nimm Text aus Feld
                EditText name_field = (EditText)findViewById(R.id.id_Name_field);

                //Starte Menü
                Intent menu_ac = new Intent("com.apps.kahlmann.gamifiedto_do.Menu");
                menu_ac.putExtra("character_name",name_field.getText().toString()); // Übergib Textfeld
                startActivity(menu_ac);
            }
        });

    }

    public void hit_enter() {

        //Oder Enter
       final EditText name_field = (EditText)findViewById(R.id.id_Name_field);
       if (name_field != null) {
            name_field.setOnKeyListener(new View.OnKeyListener()
            {
                public boolean onKey(View v, int keyCode, KeyEvent event)
                {
                    if (event.getAction() == KeyEvent.ACTION_DOWN)
                    {
                        switch (keyCode)
                        {
                            case KeyEvent.KEYCODE_DPAD_CENTER:
                            case KeyEvent.KEYCODE_ENTER:

                                //Starte Menü
                                Intent menu_ac = new Intent("com.apps.kahlmann.gamifiedto_do.Menu");
                                menu_ac.putExtra("character_name",name_field.getText().toString()); // Übergib Textfeld
                                startActivity(menu_ac);

                                return true;
                            default:
                                break;
                        }
                    }
                    return false;
                }
            });
        }

    }
}
