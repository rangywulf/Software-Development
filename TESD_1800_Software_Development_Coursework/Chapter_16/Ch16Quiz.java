import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ch16Quiz extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        Pane pane = new FlowPane();

        ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Java");
        RadioButton rb2 = new RadioButton("C++");
        pane.getChildren().addAll(rb1, rb2);

        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("Test"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}


