package haiherdev.boxingdayblitz.object.vector;

/**
 * Created by David on 2/1/2015.
 */
public class Vector2d {

    private double x;
    private double y;

    public Vector2d(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX (double x) {
        this.x = x;
    }

    public void setY (double y) {
        this.y = y;
    }

    public double getX () {
        return this.x;
    }

    public double getY () {
        return this.y;
    }
}
