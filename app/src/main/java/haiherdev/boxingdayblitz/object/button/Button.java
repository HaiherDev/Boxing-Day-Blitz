package haiherdev.boxingdayblitz.object.button;

import android.graphics.Canvas;
import android.view.MotionEvent;

import haiherdev.boxingdayblitz.object.GameObject;
import haiherdev.boxingdayblitz.object.vector.Vector4d;

/**
 * Created by David on 2/1/2015.
 */
public class Button extends GameObject {

    private Vector4d v4d;
    private ButtonFunction buttonFunction;

    public Button (Vector4d v4d, int function) {
        this.v4d = v4d;
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



    public double getX () {
        return this.v4d.getX();
    }

    public double getY () {
        return this.v4d.getY();
    }

    public double getWidth () {
        return this.v4d.getWidth();
    }

    public double getHeight () {
        return this.v4d.getHeight();
    }
}
