package com.example.hojadevida;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
Button boton1;
Switch miPrimerSwtich;
TextView miprimertexto,texto2,textView5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        boton1=(Button) findViewById(R.id.next);
        miprimertexto = (TextView)findViewById(R.id.descripcion);
        texto2 = (TextView)findViewById(R.id.texto2);
        textView5 = (TextView)findViewById(R.id.textView5);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });
        miPrimerSwtich = (Switch) findViewById(R.id.switch2);
        miPrimerSwtich.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (miPrimerSwtich.isChecked()){
                    miprimertexto.setTextSize(18);
                    miprimertexto.setTextColor(0xED63F806);
                    texto2.setTextSize(18);
                    textView5.setTextSize(18);


                }else{
                    miprimertexto.setTextSize(15);
                    texto2.setTextSize(15);
                    miprimertexto.setTextColor(0xEDE60B12);
                    texto2.setTextColor(0xEDE60B12);
                    textView5.setTextSize(15);





                }

            }
        });

    }
}