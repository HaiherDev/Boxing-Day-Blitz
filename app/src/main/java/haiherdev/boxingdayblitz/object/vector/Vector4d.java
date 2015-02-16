package haiherdev.boxingdayblitz.object.vector;

/**
 * Created by David on 2/1/2015.
 */
public class Vector4d {

    private double x;
    private double y;
    private double width;
    private double height;

    public Vector4d(double x, double y, double width, double height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    public void addVector2d (Vector2d v2d) {
        this.setX(this.getX() + v2d.getX());
        this.setY(this.getY() + v2d.getY());
    }


    /**
     * check collision between 2 Vector4z objects
     * @param v1
     * @param v2
     * @return
     */
    public static boolean isColliding (Vector4d v1, Vector4d v2) {
        if (v1.getX() + v1.getWidth() < v2.getX() ||
            v1.getY() + v1.getWidth() < v2.getY() ||
            v2.getX() + v2.getWidth() < v1.getX() ||
            v2.getY() + v2.getWidth() < v1.getY()) {

            return false;
        } else {
            return true;
        }
    }

    public void setX (double x) {
        this.x = x;
    }

    public void setY (double y) {
        this.y = y;
    }

    public void setWidth (double width) {
        this.width = width;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    public double getX () {
        return this.x;
    }

    public double getY () {
        return this.y;
    }

    public double getWidth () {
        return this.width;
    }

    public double getHeight () {
        return this.height;
    }
}
