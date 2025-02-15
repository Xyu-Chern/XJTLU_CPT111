package week9;

import java.awt.*;
import javax.swing.*;

public class Shape extends JPanel {

    private int width;
    private int height;
    
    public Shape(int width, int height){
        this.width=width;
        this.height=height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public String getType() {
        return "nothing";
    }

    @Override
    public String toString(){
        return "This is a shape";
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}







