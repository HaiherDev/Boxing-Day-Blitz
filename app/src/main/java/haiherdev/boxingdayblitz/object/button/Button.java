package haiherdev.boxingdayblitz.object.button;

import android.graphics.Canvas;
import android.view.MotionEvent;

import haiherdev.boxingdayblitz.object.GameObject;
import haiherdev.boxingdayblitz.object.vector.Vector4z;

/**
 * Created by David on 2/1/2015.
 */
public class Button extends GameObject {

    private Vector4z v4z;
    private ButtonFunction buttonFunction;

    public Button (Vector4z v4z, int function) {
        this.v4z = v4z;
        buttonFunction = new ButtonFunction(function);
    }

    @Override
    public void render(Canvas c) {

    }

    @Override
    public void update() {

    }

    @Override
    public void input(MotionEvent e) {

        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:
                //if the user touches inside the button
                if (e.getX() >= this.getX() &&
                    e.getY() >= this.getY() &&
                    e.getX() <= this.getX() + this.getWidth() &&
                    e.getY() <= this.getY() + this.getHeight()) {

                    buttonFunction.performFunction();

                }
                break;
        }
    }



    public int getX () {
        return this.v4z.getX();
    }

    public int getY () {
        return this.v4z.getY();
    }

    public int getWidth () {
        return this.v4z.getWidth();
    }

    public int getHeight () {
        return this.v4z.getHeight();
    }
}
