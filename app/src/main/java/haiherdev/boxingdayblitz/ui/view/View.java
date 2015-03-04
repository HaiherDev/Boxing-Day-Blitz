package haiherdev.boxingdayblitz.ui.view;

import android.graphics.Canvas;
import android.view.MotionEvent;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import haiherdev.boxingdayblitz.Game;
import haiherdev.boxingdayblitz.object.GameObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by David on 1/31/2015.
 */
public class View {

    ArrayList<GameObject> list = new ArrayList<GameObject>();

    public Game g;
    private File f;

    public View(Game g, File f) {
        this.g = g;
        this.f = f;

        initList();
    }

    private void initList () {

        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            reader.parse(new InputSource(f.getPath()));

        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

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
