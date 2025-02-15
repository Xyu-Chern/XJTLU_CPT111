package week10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class addjavafx extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BROWN);
        circle.setFill(new Color(0.4, 0.4, 0.4, 1));
        pane.getChildren().add(circle);

        Label label = new Label("JavaFx");

        // "Times New Roman"：这是字体的名称，指定了要在 Label 上使用的字体。在这种情况下，您指定了使用 "Times New Roman" 字体。
        // FontWeight.BOLD：这是字体的粗细属性。在这里，指定了使用粗体字体。
        // FontPosture.ITALIC：这是字体的倾斜程度属性。在这里，指定了使用斜体字体。
        // 20：这是字体的大小，以磅（point）为单位。在这里，指定了字体大小为 20 磅。
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        label.setTextFill(Color.WHITE);//设置文本颜色
        //将 Label 的左上角定位在圆心上方的位置，x 坐标为 72，y 坐标为 85。
        label.setLayoutX(72);
        label.setLayoutY(85);
        pane.getChildren().add(label);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("FontDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
