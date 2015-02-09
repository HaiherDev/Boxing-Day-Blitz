package haiherdev.boxingdayblitz.object;

import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * Created by David on 1/31/2015.
 */
public abstract class GameObject {

    public abstract void render (Canvas c);
    public abstract void update ();
    public abstract void input (MotionEvent e);

}
