package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class openingActivity extends AppCompatActivity {
Button button,button_1;

MediaPlayer mediaPlayer;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
        mediaPlayer=MediaPlayer.create(this,R.raw.music);
        mediaPlayer.start();



        button=findViewById(R.id.button);
button_1=findViewById(R.id.button2);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(openingActivity.this,MainActivity.class);

        startActivity(intent);

    }
});


    button_1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        //    System.exit(0);
       mediaPlayer.stop();
        finish();
        }
    });



    }





}
