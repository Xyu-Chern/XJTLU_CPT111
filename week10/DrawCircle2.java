package week10;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class DrawCircle2 extends Application {
    @Override
    public void start(Stage primaryStage) {   
        Pane pane = new Pane();

        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));//scene的一半
        circle.centerYProperty().bind(pane.heightProperty().divide(2));//scene的一半
        circle.setRadius(50);
        circle.setStroke(Color.RED);
        circle.setFill(Color.WHITE);

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 200, 200);        
        primaryStage.setTitle("ShowCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);                
    }
}
