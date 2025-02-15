package week10;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

public class ShowPolygon extends Application {
  @Override 
  public void start(Stage primaryStage) {   

    Scene scene = new Scene(new MyPolygon(), 400, 400);
    primaryStage.setTitle("ShowPolygon"); //多边形
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}

class MyPolygon extends Pane {
  private void paint() {
    Polygon polygon = new Polygon();
    polygon.setFill(Color.WHITE);
    polygon.setStroke(Color.BLACK);
    ObservableList<Double> list = polygon.getPoints();//// 获取多边形的顶点列表
    
    double centerX = getWidth() / 2, centerY = getHeight() / 2;
    double radius = Math.min(getWidth(), getHeight()) * 0.4;

    //通过将顶点坐标添加到 list 中，然后创建一个多边形 (Polygon) 对象，在list add操作其实polygon变化了
    for (int i = 0; i < 6; i++) {
      list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6)); 
      list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));//注意gui中下x，y定义向上y就是减！！
    }     
    
    getChildren().clear();
    getChildren().add(polygon); 
  }
  
  @Override
  public void setWidth(double width) {
    super.setWidth(width);
    paint();
  }
  
  @Override
  public void setHeight(double height) {
    super.setHeight(height);
    paint();
  }
}