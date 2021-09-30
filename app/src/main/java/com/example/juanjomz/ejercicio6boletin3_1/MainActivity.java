package com.example.juanjomz.ejercicio6boletin3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imgBtn;
    int[] idImages;
    int actualImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actualImage=0;
        imgBtn=findViewById(R.id.speaker);
        imgBtn.setImageResource(R.drawable.altavoz_activado);
        idImages=new int[]{R.drawable.altavoz_activado,R.drawable.altavoz_desactivado};
        imgBtn.setOnClickListener(x->changueImageSpeaker());
    }

    public void changueImageSpeaker(){
        if(idImages[idImages.length-1]==idImages[actualImage]){
            actualImage--;
        }else{
            actualImage++;
        }
        imgBtn.setImageResource(idImages[actualImage]);

    }
}