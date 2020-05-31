package com.example.mygame;

import android.content.Context;

import android.graphics.Canvas;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;

import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.ArrayList;
import java.util.List;


class Gameclass extends SurfaceView implements SurfaceHolder.Callback {
    Context context;
    RishitController rishitController;
    Player player;
    //Canvas canvas1;
    Gameloop gameloop;
    Paint paint = new Paint();

    public Gameclass(Context context) {
        super(context);
        SurfaceHolder surfaceHolder;
        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
        //  super();
        this.context = context;
        rishitController = new RishitController(this);
        player = new Player(this);
        gameloop = new Gameloop(this, surfaceHolder);
        setFocusable(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {


            case MotionEvent.ACTION_DOWN:
                if (RishitController.boundary(event.getX(), event.getY())) {
                    RishitController.MovementAllowed = true;

                }
                return true;


            case MotionEvent.ACTION_MOVE:

                if (RishitController.MovementAllowed)


                    rishitController.setVal(event);
                return true;


            case MotionEvent.ACTION_UP:

                rishitController.reset();

                return true;

        }


        return super.onTouchEvent(event);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {


        gameloop.setRunning(true);
        gameloop.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

  //  List<fire> bullets = new ArrayList<fire>();//fire[1000];
 //bullets[1] = new fire(Player.x,Player.y);
fire bullets =new fire(Player.x,Player.y);


    @Override
    public void draw( Canvas canvas) {

        super.draw(canvas);

        player.drawing(canvas);
        rishitController.drawing(canvas);
//update(canvas);

        lakshmanRekha(canvas);
//// bullet

     //   bullets.add(new fire(Player.x,Player.y));
//        fire finee = bullets.get(1);
//
    //  for(fire f: bullets){
//while(fire.bmw) {
  if(fire.bmw=true) {
bullets.reset();
      bullets.drawingBullets(canvas);
  //fire.bmw=false;
  }
    //fire.bmw=false;
 //  }
      }





    public void lakshmanRekha(Canvas canvas) {
        paint.setColor(Color.RED);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight(), paint);


        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(50);

        paint.setTypeface(Typeface.MONOSPACE);
        paint.setTextScaleX((float) 1.5);
        //canvas.save();
        canvas.rotate(-90f, 500, 500);
        canvas.drawText("A T T A C K !", getWidth() / 2, ((getHeight() / 2) + 300), paint);
        canvas.rotate(90f, 500, 500);

    }


//public void update(final Canvas canvas) {
//    new CountDownTimer(10000, 1000) {
//        @Override
//        public void onTick(long millisUntilFinished) {
//
//        }
//
//        @Override
//        public void onFinish() {
//            Log.d("f","fin");
//        }
//    }.start();

//}
}