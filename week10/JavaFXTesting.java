package week10;
//其中Application是JavaFX应用程序的基类，Stage代表窗口，Scene代表一个场景，Button代表按钮控件。
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class JavaFXTesting extends Application {
    @Override
    public void start(Stage primaryStage) {        
        Button helloButton = new Button("Hello World!");
        Scene scene = new Scene(helloButton, 1000, 250);        
        primaryStage.setTitle("My First JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);    //调用launch方法来启动JavaFX应用程序。launch方法将自动调用JavaFXTesting类的start方法来开始应用程序。            
    }
}

