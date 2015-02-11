package haiherdev.boxingdayblitz.object.vector;

/**
 * Created by David on 2/1/2015.
 */
public class Vector4z {

    private int x;
    private int y;
    private int width;
    private int height;

    public Vector4z (int x, int y, int width, int height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    public void addVector2z (Vector2z v2z) {
        this.setX(this.getX() + v2z.getX());
        this.setY(this.getY() + v2z.getY());
    }


    /**
     * check collision between 2 Vector4z objects
     * @param v1
     * @param v2
     * @return
     */
    public static boolean isColliding (Vector4z v1, Vector4z v2) {
        if (v1.getX() + v1.getWidth() < v2.getX() ||
            v1.getY() + v1.getWidth() < v2.getY() ||
            v2.getX() + v2.getWidth() < v1.getX() ||
            v2.getY() + v2.getWidth() < v1.getY()) {

            return false;
        } else {
            return true;
        }
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public void setWidth (int width) {
        this.width = width;
    }

    public void setHeight (int height) {
        this.height = height;
    }

    public int getX () {
        return this.x;
    }

    public int getY () {
        return this.y;
    }

    public int getWidth () {
        return this.width;
    }

    public int getHeight () {
        return this.height;
    }
}
