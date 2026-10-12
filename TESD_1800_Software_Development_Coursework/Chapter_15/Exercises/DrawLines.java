import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class DrawLines extends Application {
    Pane pane;
    double x = 100;
    double y = 100;

    @Override // Override start method in Application class
    public void start(Stage primaryStage) {
        // create pane
        pane = new Pane();
        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case RIGHT:
                    drawLine(x + 10, y);
                    break;
                case UP:
                    drawLine(x, y - 10);
                    break;
                case LEFT:
                    drawLine(x - 10, y);
                    break;
                case DOWN:
                    drawLine(x, y + 10);
                    break;
            }
        });

        // Create scene and stage
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("Draw Lines"); // set title for stage
        primaryStage.setScene(scene); // place scene on stage
        primaryStage.show(); // Display stage
        pane.requestFocus();
    }

    private void drawLine(double newX, double newY) {
        // Create line from x, y  to newX, newY
        Line line = new Line(x, y, newX, newY);
        pane.getChildren().add(line);
        x = newX;
        y = newY;
    }
    
}
