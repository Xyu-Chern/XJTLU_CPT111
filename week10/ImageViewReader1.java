package week10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ImageViewReader1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Pane pane = new HBox();：创建了一个 HBox 容器，用于放置界面元素。
        //HBox是一个水平布局容器，它按照水平方向依次排列其子节点。你可以将子节点水平排列在一行上，并根据需要设置它们的对齐方式和间距。
        // Pane是一个通用的布局容器，它提供了一个空白的画布，你可以在上面自由地放置子节点。Pane没有特定的布局方式，你可以通过设置子节点的坐标来自由布局子节点。
        Pane pane = new HBox();
        // pane.setPadding(new Insets(5, 5, 5, 5));：设置了容器的内边距为 (5, 5, 5, 5)，这样可以在容器边缘留出一定的空白,内边距（padding）是指HTML元素的内容与边框之间的空间
        //上下左右四个方向的内边距大小都为5个像素。如果希望上下方向的内边距比左右方向大
        pane.setPadding(new Insets(5, 5, 5, 5));
        Image image =new Image("image/US.jpg");

        ImageView imageView1 =new ImageView(image);
        pane.getChildren().add(imageView1);

        ImageView imageView2 =new ImageView(image);
        //按原始图比例长宽等比例缩放到100像素
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane.getChildren().add(imageView2);
  
        ImageView imageView3 =new ImageView(image);
        imageView3.setRotate(90);// 顺时针旋转 90 度
        pane.getChildren().add(imageView3);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}




