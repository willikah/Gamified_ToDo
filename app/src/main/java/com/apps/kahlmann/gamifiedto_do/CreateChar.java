package com.apps.kahlmann.gamifiedto_do;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateChar extends AppCompatActivity {

    protected Char character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_char);

        character=(Char)getApplication();


        OK_button();

    }

    // CharNamen aus Textedit abspeichern
    public void OK_button() {
        final EditText name_field = (EditText)findViewById(R.id.id_Name_field);
        //Wenn OK button geklickt wird...
        Button OK_button = (Button)findViewById(R.id.id_start_button);
        if (OK_button != null) {
            OK_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //Nimm Text aus Feld, trage in Char ein

                    character.setName(name_field.getText().toString());
                    //Starte Menü
                    Intent intent = new Intent("com.apps.kahlmann.gamifiedto_do.Menu");
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }
            });
        }
        //Wenn enter gedrückt wird
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
                                character.setName(name_field.getText().toString());//eintragen
                                //Starte Menü
                                Intent intent = new Intent("com.apps.kahlmann.gamifiedto_do.Menu");
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
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
