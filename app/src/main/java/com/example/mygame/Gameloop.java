package com.example.mygame;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

class Gameloop extends Thread{
    Boolean running;
//Canvas canvas;
SurfaceHolder surfaceHolder;
Gameclass gameclass;
  Canvas canvasRishit;
    public Gameloop(Gameclass gameclass, SurfaceHolder surfaceHolder) {
   this.gameclass=gameclass;
    this.surfaceHolder=surfaceHolder;
//this.gameclass.canvas=canvas;
    }
//
//    public Gameloop(SurfaceView surfaceView, SurfaceHolder surfaceHolder) {
//        this.canvas=canvas;
//        this.surfaceHolder=surfaceHolder;
//
//    }

    public void setRunning(Boolean running) {
        this.running = running;

    }


    @Override
    public void run() {
        super.run();

    while(running){

  canvasRishit=surfaceHolder.lockCanvas();
gameclass.draw(canvasRishit);
//gameclass.update();
surfaceHolder.unlockCanvasAndPost(canvasRishit);








    }


    }
}
