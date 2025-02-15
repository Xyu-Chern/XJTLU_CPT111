package week10;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class OverlappingRectangle extends Application {
    public void start(Stage primaryStage) {

        Group group = new Group();

        Rectangle r1 = new Rectangle(25, 10, 20, 20);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);

        Rectangle r2 = new Rectangle(30, 20, 60, 30);
        r2.setStroke(Color.BLACK);
        r2.setFill(Color.WHITE);

        Line line1 = new Line(30, 30, 45, 30);
        line1.setStroke(Color.GREEN);

        Line line2 = new Line(45, 20, 45, 30);
        line2.setStroke(Color.GREEN);


        group.getChildren().addAll(r1, r2,line1,line2);

        Scene scene = new Scene(new BorderPane(group), 250, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    } 
}

