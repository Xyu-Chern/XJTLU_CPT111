package week10;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class LinePane extends Pane {
    public LinePane() {
        Line line1 = new Line(10, 10, 10, 10);
        //将line1的结束点的坐标绑定到了LinePane的宽度和高度上，通过绑定使得线段随着容器的大小而变化
        //(10,10),(width-10, height-10)
        line1.endXProperty().bind(widthProperty().subtract(10));
        line1.endYProperty().bind(heightProperty().subtract(10));
        //line1的线宽为5个单位，并且将线的颜色设置为绿色。
        line1.setStrokeWidth(5);
        line1.setStroke(Color.GREEN);
        getChildren().add(line1);

        Line line2 = new Line(10, 10, 10, 10);
        //(width-10,10),(10, height-10)
        line2.startXProperty().bind(widthProperty().subtract(10));
        line2.endYProperty().bind(heightProperty().subtract(10));
        line2.setStrokeWidth(5);
        line2.setStroke(Color.GREEN);
        getChildren().add(line2);

    }
}
