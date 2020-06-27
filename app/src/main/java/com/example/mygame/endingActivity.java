package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class endingActivity extends AppCompatActivity {
int score;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        textView=findViewById(R.id.textView);


        score=(int) getIntent().getFloatExtra(enemy.MSG,0.0f);
      textView.setText(" "+score);
        Log.d("hello"," "+score);
    }
}
