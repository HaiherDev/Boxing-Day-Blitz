package haiherdev.boxingdayblitz.object.button;

/**
 * Created by David on 2/1/2015.
 */
public class ButtonFunction {

    public static final int CONTINUE = 0;
    public static final int EXIT = 1;

    private int function;

    protected ButtonFunction (int function) {
        this.function = function;
    }

    /**
     * What happens when button is touched?
     */
    protected void performFunction () {
        switch (this.function) {
            case CONTINUE:
                functionContinue();
                break;
            case EXIT:
                functionExit();
                break;
        }
    }

    private void functionContinue () {

    }

    private void functionExit () {

    }
}
