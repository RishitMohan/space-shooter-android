package com.example.mygame;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

class Player {
    public static float x = 500;
    public static float y = 500;
    //ArrayList<fire> bullets = new ArrayList<fire>()
    private float z = 50;

    Context context;
    public Bitmap bitmapp;

    Player(Gameclass gc) {
        this.context = gc.getContext();

    }

    Paint paint = new Paint();


    public static void moving() {


        x = x + (RishitController.deltaX);
        y = y + (RishitController.deltaY);
    }


    public void drawing(Canvas canvas) {
        try {
            bitmapp = BitmapFactory.decodeResource(context.getResources(), R.drawable.fighter);

        } catch (Exception e) {
            e.printStackTrace();
            Log.d("two", "in initialising bitmap");
        }

//
//          Gameloop.shootX= (int) x;
//          Gameloop.shootY=(int)y;
        try {
            canvas.drawBitmap(bitmapp, x, y, null);

            //Log.d("pink", "xpink : " + x);
        } catch (Exception e) {
            canvas.drawCircle(x, y, z, paint);
            e.printStackTrace();
            Log.d("one", "in draw bitmap");
        }


    }


}
