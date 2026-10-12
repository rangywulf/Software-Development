import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ChangeColor extends Application {
    @Override // Override start method in Application class
    public void start(Stage primaryStage) {
        // Create a circle
        Circle circle = new Circle(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setOnMousePressed(e -> circle.setFill(Color.BLACK));
        circle.setOnMouseReleased(e -> circle.setFill(Color.WHITE));

        // Create StackPane
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle); // add circle to stackPane

        // Create stage and scene
        Scene scene = new Scene(stackPane, 300, 200);
        primaryStage.setTitle("Change Color"); // Set title for stage
        primaryStage.setScene(scene); // place scene on stage
        primaryStage.show(); // Display stage
    }
    
}
