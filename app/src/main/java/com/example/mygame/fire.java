package com.example.mygame;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

public class fire {
    public float fireX, fireY;
    // constructor
    fire(float x, float y) {
        //Gameloop.update();
        fireX = x;
        fireY = y;
        //y=Player.y;
    }

    Paint paint = new Paint();
 public static Boolean bmw=true;
    public void drawingBullets(Canvas canvas) {
//if(Gameloop.noOfMovements<13390) {




        paint.setColor(Color.WHITE);


        fireX=fireX+37;

        //int ink = ContextCompat.getColor( R.color.colorPrimary);
//if(fireX<1000)
        canvas.drawCircle((fireX+60), (fireY+30), 10, paint);
       // canvas.drawCircle(fireX, (fireY), 10, paint);
        Log.d("mm","x is"+ fireX);


    }

public void reset   (){

    if(fireX>2500)
    {
        bmw=false;
      fireX=Player.x;
      fireY=Player.y;
bmw=true;



    }
}




}
