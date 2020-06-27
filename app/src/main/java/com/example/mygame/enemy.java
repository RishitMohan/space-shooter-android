package com.example.mygame;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

import com.example.mygame.motherMethods.circle;

import java.util.Random;

import static com.example.mygame.Player.x;

public class enemy implements circle {
    Random random = new Random();
    Paint paint = new Paint();
    float enemyX = 1344, enemyY = 250;
    double sumOfRadius=25+10;
public static final String MSG ="com.example.mygame@points";
 static  float points=  0.5f;
 Boolean check=true;
int LowerBound=50;
 int  maxHeight;
   Context context;
enemy(Gameclass gameclass){
    context=gameclass.getContext();
}

    @Override
    public void drawing(Canvas canvas) {

     paint.setColor(Color.MAGENTA);
     maxHeight = random.nextInt(canvas.getHeight());



         //   reset();
//        }


        enemyX =  enemyX - (points*0.5f);

        if(check) {
            canvas.drawCircle(enemyX, enemyY, 25, paint);
        }
        checkStatus();



    }

    private void checkStatus() {
        Intent intent = new Intent(context, endingActivity.class);


//        Distance between centers of enemy and bullet
        Log.d("firex","is "+fire.fireX+"enemyx is "  +enemyX);

double distance=

        Math.sqrt(
                Math.pow(enemyX-fire.fireX,2)
              +
                        Math.pow(enemyY-fire.fireY,2));
//       to check if  Circle intersects each other

if(distance<=sumOfRadius){
    //System.exit(0);
    enemyDead();
}
////////////game over enemy entered your base////////////////
        if (enemyX < 500) {
intent.putExtra(MSG,points);
            context.startActivity(intent);

        }


        }



    public void reset()
{
     int upperBound=100;

        enemyX = 1334;
    enemyY = random.nextInt(maxHeight-upperBound);
    enemyY=enemyY+LowerBound;
    check=true;



}

public void enemyDead(){
     points++;

Log.d("points","points are : "+ points);
        check=false;
      reset();


}





}
