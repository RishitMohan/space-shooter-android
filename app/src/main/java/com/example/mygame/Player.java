package com.example.mygame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

import androidx.core.content.ContextCompat;

class Player {
private  float x=50;
private  float y=50;
private  float  z=50;

///we want canvas of draw method which comes from canvas declared in gameloop method   hence all canvas are same
    Context context;
//Canvas canvas;
            Player(Gameclass gc) {
        this.context=gc.getContext();
       // this.canvas=canvas;
    }

    Paint paint =new Paint();

//
//    public void update() {
//
//
//        setPos(x,y);
//   }

    public void setPos(float x, float y) {
    this.x=x;
    this.y=y;
    }


    public void drawing(Canvas canvas) {
        int ink= ContextCompat.getColor(context,R.color.colorAccent);
        paint.setColor(ink);
        canvas.drawCircle( x, y, z,paint);

    }


}
