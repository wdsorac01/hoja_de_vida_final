package com.example.hojadevida;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    Button boton;
    CheckBox miprimerCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton= (Button) findViewById(R.id.siguiente);
        miprimerCheck = (CheckBox) findViewById(R.id.checkBox);
        miprimerCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (miprimerCheck.isChecked()){
                        boton.setBackgroundColor(0xFFFFFFF);

                } else {
                    boton.setBackgroundColor(0xFF3700B3);


                }

            }{

            }
        });

        {

        }

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));

            }
        });
    }

}