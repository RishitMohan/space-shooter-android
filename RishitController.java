package com.example.mygame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import android.view.MotionEvent;


public class RishitController {


    public static boolean MovementAllowed;////initially false
    Context context;
    MotionEvent motionEvent;
    static float motionEventY = 540, PreviousPositionY = 540;
    static float motionEventX = 123, PreviousPositionX = 123;
    static float deltaX = 6600, deltaY = 3300;
    static float magnitudeMovement, directionVector;
    Paint OuterCircle = new Paint();
    Paint innerCircle = new Paint();

    static int height;

    public RishitController(Gameclass gameclass) {
        context = gameclass.getContext();
        //you dont declare variables in constructor
    }


    public void setVal(MotionEvent motionEvent) {
        this.motionEvent = motionEvent;

        if (RishitController.boundary(motionEvent.getX(), motionEvent.getY())) {
            motionEventX = motionEvent.getX();
            motionEventY = motionEvent.getY();
            deltaMovement();


        } else {
            reset();
        }

    }


    public void drawing(Canvas canvas) {


        innerCircle.setColor(Color.GREEN);
        OuterCircle.setColor(Color.GRAY);

        height = canvas.getHeight();
        OuterCircle.setStrokeWidth(50);
        OuterCircle.setStyle(Paint.Style.STROKE);
        canvas.drawRect(50, height, 400, 0, OuterCircle);

        canvas.drawCircle(motionEventX, motionEventY, 25, innerCircle);


        PreviousPositionX = motionEventX;
        PreviousPositionY = motionEventY;

    }

    public static Boolean boundary(float X, float Y) {

        return X < 400 && X > 100 && Y > 50 && Y < (height - 50);

    }


    public static void deltaMovement() {
        deltaX = motionEventX - PreviousPositionX;
        deltaY = motionEventY - PreviousPositionY;

        magnitudeMovement = (float) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        directionVector = (float) Math.atan(deltaY / deltaX);

        Player.moving();
    }


    public void reset() {


        motionEventX = PreviousPositionX;
        motionEventY = PreviousPositionY;
        RishitController.MovementAllowed = true;


    }


}
