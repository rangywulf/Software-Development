import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class quiz extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

    // Create a button and place it in the scene
    Button btOK = new Button("OK");
    btOK.setOnAction(e -> System.out.println("OK 1"));
    btOK.setOnAction(e -> System.out.println("OK 2"));
    Scene scene = new Scene(btOK, 200, 250);
    primaryStage.setTitle("MyJavaFX"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    }
}