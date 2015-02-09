package haiherdev.boxingdayblitz.object.vector;

/**
 * Created by David on 2/1/2015.
 */
public class Vector2z {

    private int x;
    private int y;

    public Vector2z (int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public int getX () {
        return this.x;
    }

    public int getY () {
        return this.y;
    }
}
