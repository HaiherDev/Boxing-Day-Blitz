package haiherdev.boxingdayblitz.object;

import android.graphics.Canvas;
import android.view.MotionEvent;

import haiherdev.boxingdayblitz.Game;

/**
 * Created by David on 1/31/2015.
 */
public abstract class GameObject {

    protected Game g;

    public GameObject (Game g) {
        this.g = g;
    }

    public abstract void render (Canvas c);
    public abstract void update ();
    public abstract void input (MotionEvent e);

}
