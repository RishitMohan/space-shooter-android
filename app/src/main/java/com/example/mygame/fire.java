package com.example.mygame;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

import com.example.mygame.motherMethods.circle;

public class fire implements circle {
    public static Boolean bmw = true;
    public static float fireX;
          public static float fireY;
    Paint paint = new Paint();





    fire(float x, float y) {

        fireX = x;
        fireY = y;
       setPos();
    }


    void setPos(){
        fireX=fireX+60;
        fireY=fireY+30;
    }


    @Override
    public void drawing(Canvas canvas) {


        paint.setColor(Color.WHITE);


        fireX = fireX + 37+(int)((enemy.points)/2);


        canvas.drawCircle(fireX,fireY, 10, paint);

        Log.d("mm", "x is  :   " + (fireX+60)+ " y is :  "+(fireY+30));


    }

    public void reset() {

        if (fireX > 2500) {
            bmw = false;
            fireX = Player.x;
            fireY = Player.y;
            setPos();
            bmw = true;


        }
    }


}
