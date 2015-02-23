package haiherdev.boxingdayblitz.object.movable;

import haiherdev.boxingdayblitz.object.GameObject;
import haiherdev.boxingdayblitz.object.vector.Vector2d;

/**
 * Created by David on 2/16/2015.
 */
public class MovementVector {

    private Vector2d v2d;
    private long startTime;
    private long lastTime;
    private final long END_TIME;

    private Movable o;

    private Vector2d scale;

    /**
     * stuff
     * @param o
     * @param v2d
     * @param time
     */
    public MovementVector (Movable o, Vector2d v2d, long time) {
        this.v2d = v2d;
        this.END_TIME = time;
        this.startTime = System.nanoTime();
        this.lastTime = startTime;

        this.o = o;

        this.scale = new Vector2d (
            deltaX() / END_TIME,
            deltaY() / END_TIME
        );
    }

    public void updateTime () {
        if (getDeltaStartTime() >= END_TIME) {
            destroy ();
        } else {
            moveObject ();
        }

        lastTime = System.nanoTime();
    }

    private void moveObject () {
        long deltaTime = getDeltaLastTime();
        double xScale = scale.getX() * deltaTime;
        double yScale = scale.getY() * deltaTime;
        o.move(new Vector2d (xScale, yScale));
    }

    private long getDeltaStartTime () {
        return System.nanoTime() - startTime;
    }

    private long getDeltaLastTime () {
        return System.nanoTime() - lastTime;
    }

    private double deltaX () {
        return Math.abs (o.getX() - v2d.getX());
    }

    private double deltaY () {
        return Math.abs (o.getY() - v2d.getY());
    }

    private void destroy () {
        o.movements.remove(this);
    }

}
