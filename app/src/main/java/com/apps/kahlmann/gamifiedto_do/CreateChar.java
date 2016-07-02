package com.apps.kahlmann.gamifiedto_do;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateChar extends AppCompatActivity {

    private static Button start_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
                String name_str = name.getText().toString();

                //schreibe in tview (test)
                TextView text = (TextView) findViewById(R.id.textView);
                text.setText(name_str);

                //Starte Menü
                /*Intent menu_ac = new Intent("com.apps.kahlmann.gamifiedto_do.Menu");
                startActivity(menu_ac);*/
            }
        });
    }
}
