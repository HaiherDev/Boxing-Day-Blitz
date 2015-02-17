package haiherdev.boxingdayblitz.object.movable;

import java.util.ArrayList;

import haiherdev.boxingdayblitz.Game;
import haiherdev.boxingdayblitz.object.GameObject;
import haiherdev.boxingdayblitz.object.vector.Vector2d;
import haiherdev.boxingdayblitz.object.vector.Vector4d;

/**
 * Created by David on 2/16/2015.
 */
public abstract class Movable extends GameObject {

    public ArrayList<MovementVector> movements = new ArrayList<MovementVector>();

    //contains x, y, width, and height of the player
    private Vector4d v4d;


    public Movable (Game g) {
        super (g);
    }

    public void updateMovements () {
        for (MovementVector m : movements) {
            m.updateTime();
        }
    }

    public void move (Vector2d v2d) {
        v4d.addVector2d(v2d);
    }

    private boolean checkCollision (Vector4d v4z) {
        if (Vector4d.isColliding(this.v4d, v4z)) {
            return true;
        }
        return false;
    }


    public double getX () {
        return v4d.getX();
    }

    public double getY () {
        return v4d.getY();
    }

    public double getWidth () {
        return v4d.getWidth();
    }

    public double getHeight () {
        return v4d.getHeight();
    }

    public void setX (double x) {
        v4d.setX(x);
    }

    public void setY (double y) {
        v4d.setY(y);
    }

    public void setV4d (Vector4d v4d) {
        this.v4d = v4d;
    }
}
