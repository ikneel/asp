package com.example.menu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class bolita extends Activity{
    public void onCreate(Bundle si){
        super.onCreate(si);
        bolitajr bola = new bolitajr(this);
        setContentView(bola);
    }

    class bolitajr extends View {
        float x = 40;
        float y = 40;

        public bolitajr(Context c) { super(c);}

        protected  void onDraw(Canvas c){
            c.drawColor(Color.GRAY);
            Paint lapizverde = new Paint();
            lapizverde.setColor(Color.GREEN);
            c.drawCircle(x, y, 20, lapizverde);
        }

        public boolean onTouchEvent(MotionEvent me){
            if(me.getAction() == MotionEvent.ACTION_MOVE){
                x = me.getX();
                y = me.getY();
            }
            invalidate();
            return true;
        }
    }
}
