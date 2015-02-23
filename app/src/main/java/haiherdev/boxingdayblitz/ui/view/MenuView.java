package haiherdev.boxingdayblitz.ui.view;

import android.content.Context;

import haiherdev.boxingdayblitz.Game;
import haiherdev.boxingdayblitz.object.button.Button;
import haiherdev.boxingdayblitz.object.button.ButtonFunction;
import haiherdev.boxingdayblitz.object.vector.Vector4d;

/**
 * Created by David on 1/31/2015.
 */
public class MenuView extends AbstractView {

    /**
     * constructor that reads in a context (MainActivity)
     */
    public MenuView(Context context, Game g) {
        super(context, g);
    }

    protected void initList () {
        list.add(new Button(g, new Vector4d(100, 100, 200, 100), ButtonFunction.CONTINUE));
        list.add(new Button(g, new Vector4d(100, 300, 200, 100), ButtonFunction.EXIT));
    }

    public void resetView () {

    }

}
