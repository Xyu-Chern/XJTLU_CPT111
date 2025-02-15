package week10;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class OKBUTTON extends Application {
    @Override
    public void start(Stage primaryStage) {  
        //在start方法中，这里使用了一个StackPane布局来放置按钮控件。StackPane是一种基本的布局容器，它允许我们在其中添加子节点，并且会按照层叠顺序排列这些子节点。      
        // StackPane pane = new StackPane();
        // pane.getChildren().add(new Button("OK"));

       // 在创建StackPane对象时，这里使用了一种简写方式来添加按钮控件。
       //我们可以在StackPane的构造函数中直接传入一个新的Button对象，而不需要通过调用getChildren().add()方法来添加按钮控件。
        StackPane pane = new StackPane(new Button("OK"));
        Scene scene = new Scene(pane, 200, 50);        
        primaryStage.setTitle("Button in a pane.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);                
    }
}
