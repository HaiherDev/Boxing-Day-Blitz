package haiherdev.boxingdayblitz;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceView;

import haiherdev.boxingdayblitz.object.vector.Vector2d;
import haiherdev.boxingdayblitz.ui.view.View;

import java.util.HashMap;

/**
 * Created by David on 2/1/2015.
 */
public class Game extends SurfaceView {

    private HashMap<String, View> viewMap = new HashMap<String, View>();
    private View currentView;

    private final Context context;
    private final Vector2d screenSize;


    /**
     * constructor
     */
    public Game (Context context, Vector2d screenSize) {
        super(context);
        this.context = context;
        this.screenSize = screenSize;

        //initiate all views and set the current one to menu
        initMap ();
        setView(getView ("menu"));

        invalidate ();
    }


    /**
     * the game loop
     * (invalidate calls onDraw)
     */
    @Override
    public void onDraw (Canvas c) {
        currentView.updateList();
        currentView.renderList(c);

        invalidate();
    }


    /**
     * respond to touch events
     */
    @Override
    public boolean onTouchEvent (MotionEvent e) {
        currentView.inputList(e);
        return false;
    }


    /**
     * fills viewMap with all views...
     * needed in the program
     */
    private void initMap () {
        viewMap.put("menu", new View(this));
    }


    /**
     * return a View with a specific name
     */
    private View getView (String viewName) {
        return viewMap.get(viewName);
    }


    /**
     * set the currentView to the one specified...
     * after resetting the current view
     */
    public void setView (View gameView) {
        gameView.resetView();
        this.currentView = gameView;
    }






    // getters and setters below

    public double getScreenWidth () {
        return screenSize.getX();
    }

    public double getScreenHeight () {
        return screenSize.getY();
    }
}
