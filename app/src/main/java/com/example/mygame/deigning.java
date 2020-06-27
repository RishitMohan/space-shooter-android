package com.example.mygame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

import com.example.mygame.motherMethods.circle;

public class deigning implements circle {
   Context context;
    public deigning(Gameclass gameclass) {
        context=gameclass.getContext();
    }
@Override
    public void drawing(Canvas canvas) {
     Paint paint=new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(canvas.getWidth() / 2, 0, canvas.getWidth() / 2, canvas.getHeight(), paint);
paint.setTextSize(40);
       canvas.drawText("S C O R E : "+(enemy.points-0.5),100,100,paint);
    paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(50);

        paint.setTypeface(Typeface.MONOSPACE);
        paint.setTextScaleX((float) 1.5);
        //canvas.save();
        canvas.rotate(-90f, 500, 500);
        canvas.drawText("A T T A C K !", canvas.getWidth() / 2, ((canvas.getHeight() / 2) + 300), paint);
        canvas.rotate(90f, 500, 500);

    }
}
