package haiherdev.boxingdayblitz.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

import haiherdev.boxingdayblitz.Game;
import haiherdev.boxingdayblitz.object.GameObject;

import java.util.ArrayList;

/**
 * Created by David on 1/31/2015.
 */
public abstract class AbstractView extends View {

    ArrayList<GameObject> list = new ArrayList<GameObject>();

    public Game g;

    public AbstractView(Context context, Game g) {
        super(context);
        this.g = g;

        initList();
    }

    protected abstract void initList();
    public abstract void resetView ();

    public void updateList () {
        for (GameObject o : list) {
            o.update();
        }
    }

    public void renderList (Canvas c) {
        for (GameObject o : list) {
            o.render(c);
        }
    }

    public void inputList (MotionEvent e) {
        for (GameObject o : list) {
            o.input(e);
        }
    }

}
