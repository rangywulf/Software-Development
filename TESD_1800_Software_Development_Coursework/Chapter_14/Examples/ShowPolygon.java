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
        // MyPolygon is our own custom pane class, defined below

        primaryStage.setTitle("ShowPolygon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class MyPolygon extends Pane {

    private void paint() {
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);

        ObservableList<Double> list = polygon.getPoints();
        // getPoints() returns a list that holds the polygon's x,y coordinates
        // one after another: x1, y1, x2, y2, x3, y3, etc.

        double centerX = getWidth() / 2, centerY = getHeight() / 2;
        double radius = Math.min(getWidth(), getHeight()) * 0.4;
        // Math.min picks whichever is smaller, width or height
        // so the hexagon always fits inside the pane no matter its shape

        for (int i = 0; i < 6; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
        }
        // loops 6 times to generate the 6 corner points of a hexagon
        // uses trigonometry (cos/sin) to calculate each point's position
        // around a circle, evenly spaced

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