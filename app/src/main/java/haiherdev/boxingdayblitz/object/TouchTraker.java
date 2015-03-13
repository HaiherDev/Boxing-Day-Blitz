package haiherdev.boxingdayblitz.object;

import java.util.ArrayList;
import java.util.List;

import haiherdev.boxingdayblitz.object.vector.Vector2d;
import haiherdev.boxingdayblitz.object.vector.VectorV;

/**
 * Created by David on 3/12/2015.
 */
public class TouchTraker {

    //maximum size of the buffers
    private final int BUFFER_SIZE;

    //lists which hold previous points of the finger on the screen
    List<VectorV> lastTouch = new ArrayList<VectorV>();

    public TouchTraker (int bufferSize) {
        this.BUFFER_SIZE = bufferSize;
    }

    //update the lists by adding new postions and removing old ones
    public void update (VectorV vecV) {
        //add new position
        lastTouch.add(vecV);
        //remove old positions
        while (lastTouch.size() > BUFFER_SIZE) {
            lastTouch.remove(lastTouch.get(0));
        }
    }

    //get the latest velocity from the list
    public VectorV deltaV () {
        VectorV v1 = lastTouch.get(lastTouch.size()-1);
        VectorV v2 = lastTouch.get(0);
        return new VectorV (v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getNanoTime() - v2.getNanoTime());
    }

}
