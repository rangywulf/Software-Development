import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class AlternateMessages extends Application {
    Label message;
    
    @Override // override start method in class Application
    public void start(Stage primaryStage) {
        // Create first message
        message = new Label("Java is fun");

        // Create StackPane
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(message); // add message to StackPane
        stackPane.setOnMouseClicked(e -> switchMessage()); // Mouse click calls switchMessage

        // Create scene and set stage
        Scene scene = new Scene(stackPane, 300, 200);
        primaryStage.setTitle("Alternate Messages"); // set title of stage
        primaryStage.setScene(scene); // Place scene on stage
        primaryStage.show(); // Display stage
    }

    private void switchMessage() {
        if (message.getText().equals("Java is fun")) {
            message.setText("Java is powerful");
        }
        else
            message.setText("Java is fun");
    }
}
