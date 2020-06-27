package com.example.mygame;


import android.graphics.Canvas;
import android.view.SurfaceHolder;


class Gameloop extends Thread {

    Boolean running;

    SurfaceHolder surfaceHolder;
    Gameclass gameclass;
    Canvas canvasRishit;
    static int noOfMovements;

    public Gameloop(Gameclass gameclass, SurfaceHolder surfaceHolder) {
        this.gameclass = gameclass;
        this.surfaceHolder = surfaceHolder;
    }

    public void setRunning(Boolean running) {
        this.running = running;

    }




    @Override
    public void run() {
        super.run();

        while (running) {
            noOfMovements++;


            try {
                canvasRishit = surfaceHolder.lockCanvas();
                gameclass.draw(canvasRishit);
            } catch (Exception e) {
                e.printStackTrace();
            }


            try {
                surfaceHolder.unlockCanvasAndPost(canvasRishit);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }


    }


}
