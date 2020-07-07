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
Gameclass gameclass;
    Random random = new Random();
float enemyX,enemyY;
    Paint paint = new Paint();

    double sumOfRadius=25+10;
public static final String MSG ="com.example.mygame@points";
 static  float points;
 static Boolean check=true;
int LowerBound=50;
  int  maxHeight;
   Context context;
 int color=Color.BLUE;
private  int pass;
enemy(Gameclass gameclass,float enemyX,float enemyY,float points){
    context=gameclass.getContext();
this.enemyX=enemyX;
this.enemyY=enemyY;
this.points=points;
}


    @Override
    public void drawing(Canvas canvas) {
//

paint.setColor(color);
     maxHeight = random.nextInt(canvas.getHeight());
     enemyX =  enemyX - (points*0.5f);

        if(check) {
            canvas.drawCircle(enemyX, enemyY, 25, paint);
        }
        checkStatus();



    }

    private void checkStatus() {
        Intent intent = new Intent(context, endingActivity.class);


//        Distance between centers of enemy and bullet


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



    public  void reset()
{  pass=random.nextInt(5);
    changeColor();
     int upperBound=100;

        enemyX = 1334;
    enemyY = random.nextInt(maxHeight-upperBound);
    enemyY=enemyY+LowerBound;
    check=true;



}

private  void changeColor(){
    if(pass==0){
        color=Color.RED;
    }
else if(pass==1){
    color=Color.GREEN;
    }
else if (pass==2){
    color=Color.YELLOW;
}
else if (pass==3){
    color=Color.MAGENTA;
    }
else if(pass==4){
    color=Color.BLUE;
    }

}

public void enemyDead(){
     points++;

Log.d("points","points are : "+ points);
        check=false;
      reset();


}
/////////when user clicks on exit & then play again//future functionality point al
//static void reload(){
//    enemy enemy=new enemy();
//    enemy.reset();
//}



}
