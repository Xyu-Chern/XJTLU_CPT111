package week9;
import java.awt.*;

import javax.swing.JFrame;
// import javax.swing.*;
public class Circle extends Shape {
   
    private String type;
    
    public Circle(int width,int height) {
        super(width,height);
        this.type="circle";
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString(){
        return "This is a "+getType()+" shape";
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = 50;
        g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }
    
    public static void main(String[] args) {
        Circle square1 = new Circle(100, 100);

        JFrame frame = new JFrame("Draw " + square1.getType());
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(square1);
        frame.setVisible(true);
    }

}

