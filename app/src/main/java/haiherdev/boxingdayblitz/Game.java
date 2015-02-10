package haiherdev.boxingdayblitz;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

import haiherdev.boxingdayblitz.object.vector.Vector2z;
import haiherdev.boxingdayblitz.ui.view.GameView;
import haiherdev.boxingdayblitz.ui.view.MenuView;

import java.util.HashMap;

/**
 * Created by David on 2/1/2015.
 */
public class Game extends SurfaceView {

    private HashMap<String, GameView> viewMap = new HashMap<String, GameView>();
    private GameView currentView;

    private final Context context;
    private final Vector2z screenSize;


    /**
     * constructor
     */
    public Game (Context context, Vector2z screenSize) {
        super(context);
        this.context = context;
        this.screenSize = screenSize;

        //initiate all views and set the current one to menu
        initMap ();
        setView(getView ("menu"));


        System.out.println ("Wwowo");
        //Yay it works!

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
        viewMap.put("menu", new MenuView(context));
    }


    /**
     * return a View with a specific name
     */
    private GameView getView (String viewName) {
        return viewMap.get(viewName);
    }


    /**
     * set the currentView to the one specified...
     * after resetting the current view
     */
    public void setView (GameView gameView) {
        if (currentView != null) currentView.resetView();
        this.currentView = gameView;
    }






    // getters and setters below

    public int getScreenWidth () {
        return screenSize.getX();
    }

    public int getScreenHeight () {
        return screenSize.getY();
    }
}
