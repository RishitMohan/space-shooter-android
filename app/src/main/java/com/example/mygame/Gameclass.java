package com.example.mygame;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

class Gameclass extends SurfaceView implements SurfaceHolder.Callback {
Context context;
    Player player;
 // Canvas canvas=draw(canvas);
    Gameloop gameloop;
    public Gameclass(Context context)// creating a parameterised constructor of gameview class  with context as parameter
    {   super(context);//it must be the first statement in the constructor body
        SurfaceHolder surfaceHolder;
    surfaceHolder=getHolder();
        surfaceHolder.addCallback(this);
        //  super();
       this.context=context;
        player= new Player(this);
   gameloop= new Gameloop(this,surfaceHolder);
   setFocusable(true);
    }

   @Override
    public boolean onTouchEvent(MotionEvent event) {
 switch(event.getAction()) {
     case MotionEvent.ACTION_DOWN:
case MotionEvent.ACTION_MOVE:
    player.setPos(event.getX(),event.getY());   ////mistake---|event|.getX()
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
    }
//
//    public void update(){
//        player.update();
//    }












//
//public  void drawing(){
//
//
//
//}










}
