import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class ColorFont extends Application {
    @Override // Override start method in Application
    public void start(Stage primaryStage) {
        // Create the layout
        HBox pane = new HBox(30);
        pane.setPadding(new Insets(20)); // 20 pixels on all four sides

        // Build the texts
        for (int i = 0; i < 5; i++) { // randomly sets color and opacity of text
            double red = Math.random();
            double green = Math.random();
            double blue = Math.random();
            double opacity = Math.random();

            Text text = new Text("Java");
            text.setFill(new Color(red, green, blue, opacity));
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            text.setRotate(90); // turns the word sideways

            pane.getChildren().add(text);
        }

        // Display the stage
        Scene scene = new Scene(pane); // Create the scene
        primaryStage.setTitle("Color and Font"); // Set title for the stage
        primaryStage.setScene(scene); // Place scene on stage
        primaryStage.show(); // display the stage
    }
    
}
