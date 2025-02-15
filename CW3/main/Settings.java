package main;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Settings {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static DoubleProperty buttonheight = new SimpleDoubleProperty(20);
    private static DoubleProperty buttonwidth = new SimpleDoubleProperty(91);
    private static Double wordSize = 16.0;
    private static String stringFamily = "Courier";
    private static Double rate1 = 0.5;
    private static Double bound = 0.08 * HEIGHT;
    private static String[] dataPaths = {"Example/example1.txt", "Example/example2.txt", "Example/example3.txt", "Example/example4.txt"};
    private static Double leftwidth = 0.1 * WIDTH;
    private static Double leftheight = 0.4 * HEIGHT;
    private static Double outScene = 0.05 * WIDTH;
    private static Double outHScene = 0.05 * HEIGHT;
    private static Double n = 5.0;
    private static Double textToRectangle = 0.03 * WIDTH;
    private static final Double MIN_RATE1 = 0.1;
    private static final Double MAX_RATE1 = 0.9;
    private static final Double MIN_WORD_SIZE = 14.0;
    private static final Double MAX_WORD_SIZE = 20.0;

    public static int getWidth() {
        return WIDTH;
    }

    public static int getHeight() {
        return HEIGHT;
    }

    public static DoubleProperty getButtonHeight() {
        return buttonheight;
    }

    public static DoubleProperty getButtonWidth() {
        return buttonwidth;
    }

    public static Double getWordSize() {
        return wordSize;
    }

    public static String getStringFamily() {
        return stringFamily;
    }

    public static Double getRate1() {
        return rate1;
    }

    public static Double getBound() {
        return bound;
    }

    public static String[] getDataPaths() {
        return dataPaths;
    }

    public static Double getLeftWidth() {
        return leftwidth;
    }

    public static Double getLeftHeight() {
        return leftheight;
    }

    public static Double getOutScene() {
        return outScene;
    }

    public static Double getOutHScene() {
        return outHScene;
    }

    public static Double getN() {
        return n;
    }

    public static Double getTextToRectangle() {
        return textToRectangle;
    }

    public static Double getMinRate1() {
        return MIN_RATE1;
    }

    public static Double getMaxRate1() {
        return MAX_RATE1;
    }

    public static Double getMinWordSize() {
        return MIN_WORD_SIZE;
    }

    public static Double getMaxWordSize() {
        return MAX_WORD_SIZE;
    }
}
