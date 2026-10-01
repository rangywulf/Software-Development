import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class ShowLine extends Application {
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new LinePane(), 200, 200);
        // creates an instance of our own custom pane (defined below)
        // and puts it directly in the scene

        primaryStage.setTitle("ShowLine");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

// A custom pane class, built by extending Pane (same pattern as
// CustomPane extends StackPane back in 14.10.3)
class LinePane extends Pane {
    public LinePane() {
        Line line1 = new Line(10, 10, 10, 10);
        // Line(startX, startY, endX, endY)
        // starts as a single point at (10,10), since start and end match

        line1.endXProperty().bind(widthProperty().subtract(10));
        // the END x-coordinate is now BOUND to this pane's width minus 10
        // this is property binding from 14.5, applied to a shape

        line1.endYProperty().bind(heightProperty().subtract(10));
        // the END y-coordinate is bound to this pane's height minus 10

        line1.setStrokeWidth(5);
        // outline thickness, 5 pixels

        line1.setStroke(Color.GREEN);
        getChildren().add(line1);
        // note: getChildren() with no "pane." prefix, because LinePane
        // itself IS a Pane (it extends Pane), so this refers to its own list

        Line line2 = new Line(10, 10, 10, 10);
        line2.startXProperty().bind(widthProperty().subtract(10));
        // this time the START x is bound (not the end)

        line2.endYProperty().bind(heightProperty().subtract(10));
        line2.setStrokeWidth(5);
        line2.setStroke(Color.GREEN);
        getChildren().add(line2);
    }
}