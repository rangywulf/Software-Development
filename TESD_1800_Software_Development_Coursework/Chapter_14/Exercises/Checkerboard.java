import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Checkerboard extends Application {
    @Override // Override start method in application
    public void start(Stage primaryStage) {
        // Settings
        double size = 40; // width and height of one cell

        // Create the layout
        GridPane pane = new GridPane();

        // Fill the 8x8 grid
        for (int i = 0; i < 8; i++) { // row
            for (int j = 0; j < 8; j++) { // column
                Rectangle cell = new Rectangle(size, size); // create cell
                
                if ((i + j) % 2 == 0) {
                    cell.setFill(Color.WHITE); // even: white
                } else {
                    cell.setFill(Color.BLACK); // odd: black
                }

                pane.add(cell, j, i);
            }
        }

        // Display the stage
        Scene scene = new Scene(pane); // Create scene
        primaryStage.setTitle("Checker Board"); // Set Title for stage
        primaryStage.setScene(scene); // Place scene on stage
        primaryStage.show(); // Display stage
    }
    
}
