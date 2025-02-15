package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.WritableImage;
import javafx.stage.FileChooser;
import javafx.beans.binding.DoubleBinding;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.imageio.ImageIO;

public class Drawer {
    
    private Double bound;
    private Double n;
    private Double leftHeight;
    private Double leftWidth;
    private Double wordSize;
    private Double rate1;
    private Double textToRecatngle;
    private String title;
    private double scaleFactor;
    private int width;
    private int height;
    private DoubleProperty buttonheight;
    private DoubleProperty buttonwidth;
    private Double maxWordSize;
    private Double minWordSize;
    private String stringFamily;
    private String[] dataPaths;
    private Double outHScene;
    private Double outScene;
    private Double minRate1;
    private Double maxRate1;

    public Drawer(int width, int height, Double outScene, String stringFamily, Double bound, Double n, Double leftHeight, Double leftWidth, Double wordSize, Double rate1,Double textToRecatngle, DoubleProperty buttonheight, DoubleProperty buttonwidth, Double maxWordSize,Double minWordSize,String[] dataPaths, Double outHScene, Double minRate1, Double maxRate1 ){
        this.width=width;
        this.height=height;
        this.leftHeight=leftHeight;
        this.leftWidth=leftWidth;
        this.n=n;
        this.bound=bound;
        this.wordSize=wordSize;
        this.rate1=rate1;
        this.textToRecatngle=textToRecatngle;
        this.stringFamily=stringFamily;
        this.buttonheight=buttonheight;
        this.buttonwidth=buttonwidth;
        this.maxWordSize=maxWordSize;
        this.minWordSize=minWordSize;
        this.dataPaths=dataPaths;
        this.outHScene=outHScene;
        this.outScene=outScene;
        this.minRate1=minRate1;
        this.maxRate1=maxRate1;
    }
    
    public void draw(Pane pane, Pane curvePane,Pane textPane,Stage primaryStage, Scene scene){

        DoubleBinding buttonXProperty = pane.widthProperty().multiply(outScene / width);
       
        // cunstruct sliders
        ScrollBar reoSlider = createScrollBar("Rectangle Opacity", buttonXProperty, pane.heightProperty().multiply((height - outHScene * 2) / height).subtract(buttonheight),-1, 1, 0);
        addReoSliderProperty(reoSlider, curvePane);
        ScrollBar textSlider = createScrollBar("Text Size", buttonXProperty, pane.heightProperty().multiply((height-outHScene*3)/height).subtract(buttonheight), 0, 1, 0.5);
        addTextSliderProperty(textSlider ,textPane);
        ScrollBar colorSlider = createScrollBar("Curve Opacity", buttonXProperty, pane.heightProperty().multiply((height-outHScene*4)/height).subtract(buttonheight), -1, 1, 0);
        addColorSliderProperty(colorSlider, curvePane);
        ScrollBar slopeSlider =createScrollBar("Curve Slope", buttonXProperty, pane.heightProperty().multiply((height-outHScene*5)/height).subtract(buttonheight), 0, 1, 0.5);
        addSlopeSliderProperty(slopeSlider, curvePane);   
        
        // construct controlBtn
        Button controlBtn = createButton("AdjustImage",buttonXProperty, pane.heightProperty().multiply((height - outHScene) / height).subtract(buttonheight));
        addControlButtonProperty( controlBtn, reoSlider, textSlider, slopeSlider, colorSlider, pane);
        
        // construct filemenuBtn
        MenuButton fileMenuButton = createFileMenuButton("SelectFile", pane, textPane,curvePane, primaryStage);
        addFileMenuButtonProperty(fileMenuButton,reoSlider,textSlider,slopeSlider, colorSlider, pane, textPane, curvePane, primaryStage);
        
        // construct saveBtn
        Button saveButton = createButton("SaveImage",pane.widthProperty().multiply(2*outScene/width).add(buttonwidth).add(buttonwidth),pane.heightProperty().multiply((height-outHScene)/height).subtract(buttonheight));
        addSaveButtonProperty( saveButton, controlBtn, fileMenuButton,reoSlider, textSlider, slopeSlider, colorSlider, pane, primaryStage);

        pane.getChildren().addAll(controlBtn,fileMenuButton,saveButton);
        addSceneListener(scene,textPane);
    }

    private ScrollBar createScrollBar(String tooltip, DoubleBinding layoutX, DoubleBinding layoutY, double min, double max, double value) {
        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setTooltip(new Tooltip(tooltip));
        scrollBar.setMin(min);
        scrollBar.setMax(max);
        scrollBar.setValue(value);
        scrollBar.layoutXProperty().bind(layoutX);
        scrollBar.layoutYProperty().bind(layoutY);
        return scrollBar;
    }

    private void addReoSliderProperty(ScrollBar reoSlider,Pane curvePane){
        reoSlider.valueProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
            double opacity = (new_val.doubleValue() + 1) / 2; 
            for (Node node : curvePane.getChildren()) {
                if (node instanceof Rectangle) {
                    ((Rectangle) node).setOpacity(opacity);
                }
            }
        });
    }

    private void addTextSliderProperty(ScrollBar textSlider , Pane textPane){
        textSlider.valueProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
            Double wordSize = (maxWordSize - minWordSize) * new_val.doubleValue() + minWordSize;
            for (Node node : textPane.getChildren()) {
                if (node instanceof Text) {
                    double curX = ((Text) node).getLayoutX();
                    double textWidth1 = ((Text) node).getBoundsInLocal().getWidth();
                    ((Text) node).setFont(Font.font(stringFamily, FontWeight.BOLD, FontPosture.ITALIC, wordSize));
                    double textWidth2 = ((Text) node).getBoundsInLocal().getWidth();
                    ((Text) node).setLayoutX(curX-textWidth2+textWidth1); 
                }
            }
        });
    }

    private void addColorSliderProperty(ScrollBar colorSlider, Pane curvePane){
        colorSlider.valueProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
            double opacity = (new_val.doubleValue() + 1) / 2; 
            for (Node node : curvePane.getChildren()) {
                if (node instanceof CubicCurve) {
                    ((CubicCurve) node).setOpacity(opacity);
                }
            }
        });
    }

    private void addSlopeSliderProperty(ScrollBar slopeSlider,Pane curvePane){
        slopeSlider.valueProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
            Double rate1 = (maxRate1 - minRate1) * new_val.doubleValue() + minRate1;
            for (Node node : curvePane.getChildren()) {
                if (node instanceof CubicCurve) {
                    CubicCurve curve = (CubicCurve) node;
                    curve.controlX1Property().unbind();
                    curve.controlX2Property().unbind();
                    curve.controlX1Property().bind(curve.startXProperty().multiply(1-rate1).add(curve.endXProperty().multiply(rate1)));
                    curve.controlX2Property().bind(curve.endXProperty().multiply(1-rate1).add(curve.startXProperty().multiply(rate1)));
                }
            }
        });
    }

    private Button createButton(String text, DoubleBinding layoutX, DoubleBinding layoutY) {
        Button button = new Button(text);
        button.prefWidthProperty().bind(buttonwidth);
        button.prefHeightProperty().bind(buttonheight);
        button.layoutXProperty().bind(layoutX);
        button.layoutYProperty().bind(layoutY);
        return button;
    }

    private void addControlButtonProperty(Button controlBtn,ScrollBar reoSlider,ScrollBar textSlider,ScrollBar slopeSlider,ScrollBar colorSlider,Pane pane){
        controlBtn.setOnAction(event -> {
            List<Node> sliders = Arrays.asList(reoSlider, textSlider, colorSlider, slopeSlider);
            if (!pane.getChildren().containsAll(sliders)) {
            pane.getChildren().addAll(sliders);
            } else {
                pane.getChildren().removeAll(sliders);
            }
        });
    }

    private MenuButton createFileMenuButton(String text, Pane pane, Pane textPane, Pane curvePane, Stage primaryStage) {
        MenuButton fileMenuButton = new MenuButton(text);
        fileMenuButton.prefWidthProperty().bind(buttonwidth);
        fileMenuButton.prefHeightProperty().bind(buttonheight);
        fileMenuButton.setPopupSide(Side.TOP);
        fileMenuButton.layoutXProperty().bind(pane.widthProperty().multiply(1.5 * outScene / width).add(buttonwidth));
        fileMenuButton.layoutYProperty().bind(pane.heightProperty().multiply((height - outHScene) / height).subtract(buttonheight));
        return fileMenuButton;
    }

    private void addFileMenuButtonProperty(MenuButton fileMenuButton,ScrollBar reoSlider,ScrollBar textSlider,ScrollBar slopeSlider,ScrollBar colorSlider,Pane pane,Pane textPane,Pane curvePane,Stage primaryStage){
        List<MenuItem> menuItems = new ArrayList<>();
        for (int i = 0; i < dataPaths.length; i++) {
            final int index = i;
            MenuItem menuItem = new MenuItem("File " + (i + 1));
            menuItem.setOnAction(event -> {
                if (pane.getChildren().containsAll(Arrays.asList(reoSlider, textSlider, colorSlider, slopeSlider))) {
                    pane.getChildren().removeAll(reoSlider, textSlider, colorSlider, slopeSlider);
                }
                pane.getChildren().removeAll(textPane, curvePane);
                textPane.getChildren().clear();
                curvePane.getChildren().clear();
                FileReader dataFile = new FileReader(dataPaths[index]);
                title = dataFile.getTitle();
                FileSorter data = new FileSorter(dataFile.getMap());
                chartDraw( primaryStage, pane, textPane, curvePane, data);
                primaryStage.setTitle(title);
            });
            menuItems.add(menuItem);
        }
        fileMenuButton.getItems().addAll(menuItems);
    }
    
    private void chartDraw(Stage primaryStage,Pane pane,Pane textPane,Pane curvePane,FileSorter data){

        Double initialleft=0.5*(height-leftHeight);
        Double startRectangle = n*outScene;

        Rectangle r1 =  addRectangle(pane.widthProperty().multiply(startRectangle/width),pane.heightProperty().multiply(initialleft/height),pane.widthProperty().multiply(leftWidth/width),pane.heightProperty().multiply(leftHeight/height));
        curvePane.getChildren().add(r1);
        Text text1 =addText(data.getSortedString().get(0) + ": " + data.getSortedInteger().get(0),pane.widthProperty().multiply((startRectangle-textToRecatngle)/width),pane.heightProperty().multiply((initialleft+leftHeight*0.5)/height));
        textPane.getChildren().add(text1);

        int len =data.getSortedInteger().size();
        Double right_height_location = 0.5*(height-leftHeight-(len-2)*bound);
        Double initalline=initialleft;

        for (int i=1;i<len;i++){
            Double rate = 1.0*data.getSortedInteger().get(i)/data.getSortedInteger().get(0);
            Double Rate_leftHeight= rate* leftHeight;

            Rectangle r2 =  addRectangle(pane.widthProperty().multiply((width-leftWidth-outScene)/width),pane.heightProperty().multiply((right_height_location)/height),pane.widthProperty().multiply(leftWidth/width),pane.heightProperty().multiply(Rate_leftHeight/height));
            curvePane.getChildren().add(r2);
            Text text2 =addText(data.getSortedString().get(i)+": "+data.getSortedInteger().get(i),pane.widthProperty().multiply((width-outScene-leftWidth-textToRecatngle)/width),pane.heightProperty().multiply((right_height_location+Rate_leftHeight*0.5)/height));
            textPane.getChildren().add(text2);

            Double startY = initalline+0.5*Rate_leftHeight;  
            Double endY = right_height_location+0.5*Rate_leftHeight;  
            CubicCurve curve1 = addCubicCurve( pane, startY, endY, startRectangle, Rate_leftHeight);
            curvePane.getChildren().add(curve1);  

            initalline=initalline+rate*leftHeight;
            right_height_location=right_height_location+bound+Rate_leftHeight;
        }
        pane.getChildren().addAll(curvePane, textPane);
        textPane.toFront(); //置顶
    }   
    
    private Rectangle addRectangle(DoubleBinding xProperty,DoubleBinding yProperty,DoubleBinding wProperty,DoubleBinding hProperty){
        Rectangle r = new Rectangle();
        r.xProperty().bind(xProperty);
        r.yProperty().bind(yProperty);
        r.widthProperty().bind(wProperty);
        r.heightProperty().bind(hProperty);
        Color color0 = new Color(Math.random(), Math.random(), Math.random(), Math.random());
        r.setStroke(color0);
        r.setFill(color0);
        return r;
    }

    private Text addText(String textString,DoubleBinding xProperty,DoubleBinding yProperty){
        Text text = new Text(textString);
        text.setFont(Font.font(stringFamily, FontWeight.BOLD, FontPosture.ITALIC, wordSize));
        double textWidth = text.getBoundsInLocal().getWidth();
        text.xProperty().bind(xProperty.subtract(textWidth));
        text.yProperty().bind(yProperty);
        return text;
    }

    private CubicCurve addCubicCurve(Pane pane,Double startY,Double endY,Double startRectangle,Double Rate_leftright){
        CubicCurve curve1 = new CubicCurve();
        curve1.startXProperty().bind(pane.widthProperty().multiply((startRectangle+leftWidth)/ width).add(pane.heightProperty().multiply(0.5*Rate_leftright/height)));
        curve1.startYProperty().bind(pane.heightProperty().multiply(startY/height));
        curve1.endXProperty().bind(pane.widthProperty().multiply((width-leftWidth-outScene)/width).subtract(pane.heightProperty().multiply(0.5*Rate_leftright/height)));
        curve1.endYProperty().bind(pane.heightProperty().multiply(endY/height));
        curve1.controlX1Property().bind(curve1.startXProperty().multiply(1-rate1).add(curve1.endXProperty().multiply(rate1)));
        curve1.controlY1Property().bind(curve1.startYProperty());
        curve1.controlX2Property().bind(curve1.endXProperty().multiply(1-rate1).add(curve1.startXProperty().multiply(rate1)));
        curve1.controlY2Property().bind(curve1.endYProperty());
        curve1.strokeWidthProperty().bind(pane.heightProperty().multiply(Rate_leftright/height));//规避定值
        Color color2 = new Color(Math.random(), Math.random(), Math.random(), Math.random());
        Color color3 = new Color(Math.random(), Math.random(), Math.random(), 0);
        curve1.setStroke(color2);
        curve1.setFill(color3); //非常重要，防止露馅
        return curve1;
    }
    
    private void addSaveButtonProperty(Button saveButton,Button controlBtn,MenuButton fileMenuButton,ScrollBar reoSlider,ScrollBar textSlider,ScrollBar slopeSlider,ScrollBar colorSlider,Pane pane,Stage primaryStage){
        saveButton.setOnAction(event -> {
            saveButton.setVisible(false);
            controlBtn.setVisible(false);
            reoSlider.setVisible(false);
            textSlider.setVisible(false);
            colorSlider.setVisible(false);
            slopeSlider.setVisible(false);
            fileMenuButton.setVisible(false);

            WritableImage image = pane.snapshot(null, null);
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Chart");
            FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.png");
            fileChooser.getExtensionFilters().addAll(extFilterPNG);
            File file = fileChooser.showSaveDialog(primaryStage);
            if (file != null) {
                String extension = "";
                String fileName = file.getName();
                int i = fileName.lastIndexOf('.');
                if (i > 0 && i < fileName.length() - 1) {
                    extension = fileName.substring(i + 1).toLowerCase();
                }
                try {
                    ImageIO.write(SwingFXUtils.fromFXImage(image, null), extension, file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            saveButton.setVisible(true);
            controlBtn.setVisible(true);
            fileMenuButton.setVisible(true);
            reoSlider.setVisible(true);
            textSlider.setVisible(true);
            colorSlider.setVisible(true);
            slopeSlider.setVisible(true);
        });
    }
    
    private void addSceneListener(Scene scene,Pane textPane){
        scene.widthProperty().addListener((obs, oldVal, newVal) -> {
            scaleFactor = Math.min(newVal.doubleValue()/width, scene.getHeight()/height);
            repairText(textPane );
        });
        scene.heightProperty().addListener((obs, oldVal, newVal) -> {
            scaleFactor = Math.min(scene.getWidth()/width, newVal.doubleValue()/height);
            repairText(textPane);
        });

    }
    
    private void repairText(Pane textPane ) {
        Double wordSize = (maxWordSize+minWordSize)/2 * scaleFactor;
        for (Node node : textPane.getChildren()) {
            if (node instanceof Text) {
                double curX = ((Text) node).getLayoutX();
                double textWidth1 = ((Text) node).getBoundsInLocal().getWidth();
                ((Text) node).setFont(Font.font(stringFamily, FontWeight.BOLD, FontPosture.ITALIC, wordSize));
                double textWidth2 = ((Text) node).getBoundsInLocal().getWidth();
                ((Text) node).setLayoutX(curX-textWidth2+textWidth1); 
            }
        }
    }



    


}
