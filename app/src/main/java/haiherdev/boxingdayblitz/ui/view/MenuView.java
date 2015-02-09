package haiherdev.boxingdayblitz.ui.view;

import android.content.Context;

import haiherdev.boxingdayblitz.object.button.Button;
import haiherdev.boxingdayblitz.object.button.ButtonFunction;
import haiherdev.boxingdayblitz.object.vector.Vector4z;

/**
 * Created by David on 1/31/2015.
 */
public class MenuView extends GameView {

    /**
     * constructor that reads in a context (MainActivity)
     */
    public MenuView(Context context) {
        super(context);
    }

    protected void initList () {
        list.add(new Button(new Vector4z(100, 100, 200, 100), ButtonFunction.CONTINUE));
        list.add(new Button(new Vector4z(100, 300, 200, 100), ButtonFunction.EXIT));
    }

    public void resetView () {

    }

}