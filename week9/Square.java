package week9;

import java.awt.*;
public class Square extends Shape {

    private String type;
    private int x;
    private int y;

    public Square(int width, int height) {
        super(width, height);
        this.type = "square";
        this.x = 20;
        this.y = 0;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "This is a " + getType() + " shape";
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(x, y,x+this.getWidth(),y+this.getHeight());
    }

}
