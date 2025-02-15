package week10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class CirclePoly extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        Color color = new Color(1, 0, 0.333, 0.51);
        circle.setStroke(color);//设定边框颜色
        circle.setFill(Color.WHITE);

        Polygon polygon = createPolygon(circle.getCenterX(), circle.getCenterY(), circle.getRadius(), 5);

        Pane pane = new Pane();
        pane.getChildren().addAll(circle, polygon);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Show Circle with Poly");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private Polygon createPolygon(double centerX, double centerY, double radius, int sides) {
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);

        double[] tableq=createPI(sides);
        double m_k =0;
        for (int i = 0; i < sides; i++) {
            m_k=m_k+tableq[i];
            double x = centerX + radius * Math.cos(2*Math.PI*m_k);
            double y = centerY - radius * Math.sin(2*Math.PI*m_k);
            polygon.getPoints().addAll(x, y);
        }

        return polygon;
    }

    private double[] createPI(int sides){
        double[] tableq = new double[sides];
        double sum =1;
        for (int i = 0; i < sides-1; i++) {
            tableq[i] =res(sum);
            sum =sum-tableq[i];
        }
        tableq[sides-1]=sum;
        if (tableq[sides-1]>=0.5){
            createPI(sides);
        }
        return tableq;
    }

    private double res(double sum){
        double input =sum*Math.random();
        while (input >=0.5) {
            input =sum*Math.random();
        }
        return input;
    }
}
