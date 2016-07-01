package com.apps.kahlmann.gamifiedto_do;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateChar extends AppCompatActivity {

    private static Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_char);
        ClickButton1();
    }

    public void ClickButton1() {
        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ibutton1 = new Intent("com.apps.kahlmann.gamifiedto_do.Menu");
                startActivity(ibutton1);
            }
        });
    }
}
