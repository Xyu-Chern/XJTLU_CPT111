package week10;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class DrawCircle extends Application {
    @Override
    public void start(Stage primaryStage) {     
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        Color color = new Color(0, 1, 0.333, 0.51);//四个参数都是0-1前三个（RGB)red,green,blue,最后一个是透明度，0为完全不可见
        circle.setStroke(color);//设定边框颜色
        circle.setFill(Color.ORANGE);//设定内部颜色

        Pane pane = new Pane();
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

// StackPane和Pane是JavaFX中两种常用的布局容器，它们有一些区别和适用场景上的差异。
// 布局方式：
// StackPane：StackPane将子节点按照层叠顺序堆叠在一起，通常用于将多个子节点居中显示，后添加的子节点会覆盖在先添加的子节点上面。
// Pane：Pane是一个基本的布局容器，它允许自由定位和堆叠子节点，子节点的位置由开发者手动指定，可以更灵活地控制布局。
// 层叠顺序：
// StackPane：子节点按照添加顺序层叠，后添加的子节点会覆盖在先添加的子节点上面。
// Pane：子节点的层叠顺序由Node对象在Pane中的添加顺序决定，后添加的子节点会覆盖在先添加的子节点上面。
// 使用场景：
// StackPane通常用于居中显示内容，并且自动调整子节点的位置和大小。
// Pane通常用于需要对子节点进行精确定位和自定义布局的场景，因为它允许开发者手动指定子节点的位置和大小。