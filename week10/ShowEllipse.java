package week10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;

//在Java中，一个Java源文件中可以有多个类定义。但是，在这些类中只能有一个被声明为public，并且该类的名称必须与源文件的名称相同。其他类可以是默认访问修饰符（即包私有），或者是protected或private访问修饰符。这些类通常用于支持主类，或在不同成分之间共享代码。

public class ShowEllipse extends Application {

  @Override
  public void start(Stage primaryStage) {   
    Scene scene = new Scene(new MyEllipse(), 300, 200);//由于这里在别的类访问MyEllipse所以不能设置为private
    primaryStage.setTitle("ShowEllipse"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}

class MyEllipse extends Pane {
  private void paint() {
    getChildren().clear();//清空当前 Pane 对象中所有已添加的子节点
    for (int i = 0; i < 16; i++) {
      Ellipse e1 = new Ellipse(getWidth() / 2, getHeight() / 2, getWidth() / 2 - 50, getHeight() / 2 - 50);
      e1.setStroke(Color.color(Math.random(), Math.random(),Math.random(),0.4));
      e1.setFill(Color.WHITE);
      e1.setRotate(i * 180 / 16);
      getChildren().add(e1);
    }
  }
  //当 MyEllipse 对象的宽度改变时，调用父类 setWidth 方法，并重新绘制椭圆。
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
