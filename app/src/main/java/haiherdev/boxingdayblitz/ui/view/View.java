package haiherdev.boxingdayblitz.ui.view;

import android.graphics.Canvas;
import android.view.MotionEvent;

import haiherdev.boxingdayblitz.Game;
import haiherdev.boxingdayblitz.object.GameObject;

import java.util.ArrayList;

/**
 * Created by David on 1/31/2015.
 */
public class View {

    ArrayList<GameObject> list = new ArrayList<GameObject>();

    public Game g;

    public View(Game g) {
        this.g = g;


        initList();
    }

    private void initList () {

    }

    public void resetView () {

    }

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
