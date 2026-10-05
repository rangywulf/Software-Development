import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;

public class DisplayRandom1or0 extends Application {
    @Override // Override start method in Application
    public void start(Stage primaryStage) {
        // Create the layout
        GridPane pane = new GridPane();

        // Fill the 10x10 grid
        for (int i = 0; i < 10; i++) { //row
            for (int j = 0; j < 10; j++) { // column
                int value = (int)(Math.random() * 2); // Random 0 or 1
                
                // Make the text field
                TextField field = new TextField();
                field.setText(String.valueOf(value)); // setText needs a string
                field.setAlignment(Pos.CENTER); // centers the digit
                field.setPrefWidth(30); // narrow, like the figure

                pane.add(field, j, i);
            }
        }

        // Display the stage
        Scene scene = new Scene(pane); // create scene
        primaryStage.setTitle("Display 1 or 0"); // set title of stage
        primaryStage.setScene(scene); // Place scene on stage
        primaryStage.show(); // Display stage
    }
    
}
