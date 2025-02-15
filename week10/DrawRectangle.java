package week10;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DrawRectangle extends Application {
    public void start(Stage primaryStage) {
        Rectangle r1 = new Rectangle(25, 10, 60, 30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);

        Rectangle r2 = new Rectangle(25, 50, 60, 30);
        Rectangle r3 = new Rectangle(25, 90, 60, 30);

        //setArcHeight() 和 setArcWidth() 方法用于设置其圆角的垂直和水平半径。默认情况下，矩形的四个角是直角的，即半径为 0。
        //通过调用 setArcHeight() 和 setArcWidth() 方法，我们可以将矩形的圆角设置为椭圆的形状，从而使其看起来更加圆润。具体来说，setArcHeight(25) 将垂直半径设置为 25 个单位，setArcWidth(15) 将水平半径设置为 15 个单位。这样，矩形的四个角就变成了椭圆的形状，而不是直角。
        r3.setArcHeight(25);
        r3.setArcWidth(15);

        Group group = new Group();

        //将多个节点添加到group中，其中包括三个Text对象和三个Rectangle对象r1、r2、r3。其中每个Text对象都表示对应的矩形的标签，而每个Rectangle对象则表示一个矩形。这里使用了getChildren()方法获取group的子节点列表，并使用addAll()方法向其中添加多个子节点。
        group.getChildren().addAll(new Text(10, 27, "r1"),  new Text(10, 67, "r2"), new Text(10, 107, "r3"), r1,r2,r3);

        for (int i = 0; i < 4; i++) {
            Rectangle r = new Rectangle(100, 50, 100, 30);
            r.setRotate(i * 360 / 8);
            r.setStroke(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
            r.setFill(Color.WHITE);
            group.getChildren().add(r);
        }

        Scene scene = new Scene(new BorderPane(group), 250, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
