
package week10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class  LineDrawer  extends Application {

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(new LinePane(),200,200);
        primaryStage.setTitle("ShowLine");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}