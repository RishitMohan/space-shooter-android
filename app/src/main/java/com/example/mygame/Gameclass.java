package com.example.mygame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;


class Gameclass extends SurfaceView implements SurfaceHolder.Callback {
    Context context;
    RishitController rishitController;
    enemy enemy;
    Player player;
deigning Designing;
    Gameloop gameloop;
    Paint paint = new Paint();
    fire bullets = new fire(Player.x, Player.y);

    public Gameclass(Context context) {
        super(context);
        SurfaceHolder surfaceHolder;
        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);

        this.context = context;
        rishitController = new RishitController(this);
      enemy=new enemy(this,1344,250,0.5f);

        Designing=new deigning(this);
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
    public void draw(Canvas canvas) {

        super.draw(canvas);

        player.drawing(canvas);
        rishitController.drawing(canvas);

         enemy.drawing(canvas);
        Designing.drawing(canvas);

        if (fire.bmw = true) {
            bullets.reset();
            bullets.drawing(canvas);

        }

    }



}