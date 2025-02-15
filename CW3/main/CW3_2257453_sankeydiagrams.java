
package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CW3_2257453_sankeydiagrams extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane =new Pane();
        Pane curvePane = new Pane();
        Pane textPane = new Pane();
        Scene scene = new Scene(pane, Settings.getWidth(),Settings.getHeight());

        Drawer drawer= new Drawer(Settings.getWidth(),Settings.getHeight(), Settings.getOutScene(), Settings.getStringFamily() ,
        Settings.getBound(),Settings.getN() , Settings.getLeftHeight() , Settings.getLeftWidth() ,Settings.getWordSize() ,Settings.getRate1() ,
        Settings.getTextToRectangle(), Settings.getButtonHeight(), Settings.getButtonWidth() ,Settings.getMaxWordSize() ,Settings.getMinWordSize() ,
        Settings.getDataPaths()  ,Settings.getOutHScene(),Settings.getMinRate1() ,Settings.getMaxRate1());
        drawer.draw(pane, curvePane, textPane, primaryStage, scene);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



