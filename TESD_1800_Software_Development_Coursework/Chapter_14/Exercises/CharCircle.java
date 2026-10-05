import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class CharCircle extends Application {
    @Override // Override start method in Application
    public void start(Stage primaryStage) {
        // Settings
        String message = "Welcome to Java".toUpperCase();
        double centerX = 150;
        double centerY = 150;
        double radius = 100;

        // Create the layout
        Pane pane = new Pane();

        // Angle between letters
        double step = 2 * Math.PI / (message.length() + 1);   // was message.length()

        // Place each character
        for (int i = 0; i < message.length(); i++) {
            double angle = i * step;
            double x = centerX + radius * Math.cos(angle);
            double y = centerY + radius * Math.sin(angle);

            Text letter = new Text(String.valueOf(message.charAt(i)));
            letter.setFont(Font.font("Times New Roman", FontWeight.BOLD, 24));
            letter.setX(x - letter.getLayoutBounds().getWidth() / 2);    // shift left by half the width
            letter.setY(y + letter.getLayoutBounds().getHeight() / 4);   // shift down so the letter is centered on the ring
            letter.setRotate(Math.toDegrees(angle) + 90);

            pane.getChildren().add(letter);
        }

        // Display the stage
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Characters in a Circle"); // set Title of stage
        primaryStage.setScene(scene); // Place scene on stage
        primaryStage.show(); // Display the stage
    }
}
