package com.example.mygame;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

import androidx.core.content.ContextCompat;

import com.example.mygame.motherMethods.circle;

import java.util.ArrayList;

class Player implements circle {
    public static float x = 500;
    public static float y = 500;
    public Bitmap bitmapp;
    Context context;
    Paint paint = new Paint();
    private float z = 50;

    Player(Gameclass gc) {
        this.context = gc.getContext();

    }

    public static void moving() {


        x = x + (RishitController.deltaX);
        y = y + (RishitController.deltaY);
    }

@Override
    public void drawing(Canvas canvas) {
        try {
            bitmapp = BitmapFactory.decodeResource(context.getResources(), R.drawable.fighter);

        } catch (Exception e) {
            e.printStackTrace();

        }


        try {
            canvas.drawBitmap(bitmapp, x, y, null);


        } catch (Exception e) {
            canvas.drawCircle(x, y, z, paint);
            e.printStackTrace();

        }


    }


}
