package haiherdev.boxingdayblitz.object.vector;

/**
 * Created by David on 3/12/2015.
 */
public class VectorV {

    private Vector2d v2d;
    private long nanoTime;

    public VectorV(Vector2d v2d, long nanoTime) {
        this.v2d = v2d;
        this.nanoTime = nanoTime;
    }

    public VectorV(double x, double y, long nanoTime) {
        this (new Vector2d(x, y), nanoTime);
    }

    public Vector2d getDirection () {
        return new Vector2d(getX(), getY());
    }

    public long getNanoTime () {
        return this.nanoTime;
    }

    public double getX() {
        return v2d.getX();
    }

    public double getY() {
        return v2d.getY();
    }

}
