package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class endingActivity extends AppCompatActivity {


    int score;
    Intent intent;
    TextView textView;
    Button btExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_ending);
        textView=findViewById(R.id.textView);

btExit=findViewById(R.id.button4);

        score=(int) getIntent().getFloatExtra(enemy.MSG,0.0f);
      textView.setText(" "+score);
        Log.d("hello"," "+score);



    btExit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

                intent=new Intent(endingActivity.this,openingActivity.class);

                 intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
//            intent.putExtra("restart?","yes!");
                 endingActivity.this.startActivity(intent);


        }
    });
    }
}
