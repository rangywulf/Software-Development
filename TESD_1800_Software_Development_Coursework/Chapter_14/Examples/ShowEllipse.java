import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;

public class ShowEllipse extends Application {
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new MyEllipse(), 300, 200);
        // MyEllipse is our own custom pane class, defined below

        primaryStage.setTitle("ShowEllipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyEllipse extends Pane {

    private void paint() {
        getChildren().clear();
        // wipes out everything currently drawn, so we can redraw fresh
        // this matters a LOT when the window is resized (explained below)

        for (int i = 0; i < 16; i++) {
            Ellipse e1 = new Ellipse(getWidth() / 2, getHeight() / 2,
                getWidth() / 2 - 50, getHeight() / 2 - 50);
            // centerX = pane's width/2, centerY = pane's height/2 (always centered)
            // radiusX/radiusY = half the pane's size, minus 50px of margin

            e1.setStroke(Color.color(Math.random(), Math.random(),
                Math.random()));
            // random outline color (same random color technique from 14.7/14.11.3)

            e1.setFill(Color.WHITE);

            e1.setRotate(i * 180 / 16);
            // rotates each ellipse a little more than the last
            // i goes 0 to 15, so this spreads 16 ellipses across 180 degrees

            getChildren().add(e1);
        }
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        // calls the ORIGINAL setWidth() from Pane first (the parent class)
        // super = "run the parent class's version of this method"

        paint();
        // THEN re-draws all the ellipses using the new width
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paint();
    }
}