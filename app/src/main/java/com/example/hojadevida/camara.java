package com.example.hojadevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class camara extends AppCompatActivity implements View.OnClickListener {

    Button btnCamara;
    Button atras;
    ImageView imgView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camara);
        btnCamara = findViewById(R.id.btnCamara);
        atras = findViewById(R.id.button4);
        atras.setOnClickListener(this);
        imgView = findViewById(R.id.imageView);

        btnCamara.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                abrirCamara();


            }
        });
    }

    private void abrirCamara(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //if(intent.resolveActivity(getPackageManager()) != null){
        startActivityForResult(intent, 1);
        //}
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data ) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imgBitmap = (Bitmap) extras.get("data");
            imgView.setImageBitmap(imgBitmap);

        }
    }

    @Override
    public void onClick(View view) {
        setContentView(R.layout.activity_camara);
        atras = (Button) findViewById(R.id.button4);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(camara.this,MainActivity.class));
            }
        });
    }
}

