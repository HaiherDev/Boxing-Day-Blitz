package haiherdev.boxingdayblitz.object.Entity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;

import haiherdev.boxingdayblitz.object.GameObject;
import haiherdev.boxingdayblitz.object.vector.Vector2z;
import haiherdev.boxingdayblitz.object.vector.Vector4z;

/**
 * Created by David on 2/11/2015.
 */
public class Player extends GameObject {

    private Vector4z v4z;

    //damaged state
    private boolean isDamaged;

    //how long ago was the character damaged?
    private int damagedTime;

    //the time it takes to get out of damage cycle
    private final int DAMAGE_TIME = 1000;


    /**
     * Constructor
     * @param v4z: contains x, y, width and height of character
     *           x and y can be changed in the future
     */
    public Player (Vector4z v4z) {
        this.v4z = v4z;
    }

    @Override
    public void render(Canvas c) {
        Paint p = new Paint();
        p.setColor(Color.RED);
        c.drawRect(v4z.getX(), v4z.getY(), v4z.getWidth(), v4z.getHeight(), p);
    }

    @Override
    public void update() {

        //count damage time when hit after being hit by an object
        if (isDamaged) {
            if (damagedTime < DAMAGE_TIME)
                damagedTime ++;
            else
                isDamaged = false;
        }
    }

    @Override
    public void input(MotionEvent e) {

    }

    private void move (Vector2z v2z) {
        this.v4z.addVector2z(v2z);
    }

    private boolean checkCollision (Vector4z v4z) {
        if (Vector4z.isColliding(this.v4z, v4z)) {
            return true;
        }
        return false;
    }


    public int getX () {
        return v4z.getX();
    }

    public int getY () {
        return v4z.getY();
    }

    public void setX (int x) {
        v4z.setX(x);
    }

    public void setY (int y) {
        v4z.setY(y);
    }
}