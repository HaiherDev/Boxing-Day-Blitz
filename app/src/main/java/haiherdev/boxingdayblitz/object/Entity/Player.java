package haiherdev.boxingdayblitz.object.Entity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;

import haiherdev.boxingdayblitz.Game;
import haiherdev.boxingdayblitz.object.GameObject;
import haiherdev.boxingdayblitz.object.movable.Movable;
import haiherdev.boxingdayblitz.object.movable.MovementVector;
import haiherdev.boxingdayblitz.object.vector.Vector2d;
import haiherdev.boxingdayblitz.object.vector.Vector4d;

/**
 * Created by David on 2/11/2015.
 */
public class Player extends Movable {

    //damaged state
    private boolean isDamaged;

    //how long ago was the character damaged?
    private double damagedTime;

    //the time it takes to get out of damage cycle
    private final double DAMAGE_TIME = 1000;
    
    //minumum height the player can travel up
    private final double MIN_HEIGHT = 100;
    
    //height where player will die if reached
    private final double MAX_HEIGHT;


    /**
     * Constructor
     * @param v4d: contains x, y, width and height of character
     *           x and y can be changed in the future
     */
    public Player (Game g, Vector4d v4d, double maxHeight) {
        super (g);
        setV4d (v4d);
        MAX_HEIGHT = maxHeight;
    }

    @Override
    public void render(Canvas c) {
        Paint p = new Paint();
        p.setColor(Color.RED);
        c.drawRect((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight(), p);
    }

    @Override
    public void update() {

        //temporary point that the player will use to translate
        //at the end of the method
        Vector2d temp = new Vector2d(0, 0);

        //count damage time when hit after being hit by an object
        if (isDamaged) {
            if (damagedTime < DAMAGE_TIME)
                damagedTime ++;
            else
                isDamaged = false;
        } else {
            //if the player is not damaged, slowly move up at constant speed until maximum height is reached
            if (getY() > MIN_HEIGHT)
                temp.setY(temp.getY() - 0.01);
        }
        
        move (temp);
        updateMovements();
    }

    @Override
    public void input(MotionEvent e) {

    }

    private void damagePlayer () {
        isDamaged = true;
        damagedTime = 0;
        movements.add(new MovementVector(this, new Vector2d(0, 100), 1000000000L));
    }
}
