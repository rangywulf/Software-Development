import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

public class TextAreaDemo extends Application {
    @Override // override the start method in the Application class
    public void start(Stage primaryStage) {
        // Declare and create a description pane
        DescriptionPane descriptionPane = new DescriptionPane();

        // Set title, text, and image in the description pane
        descriptionPane.setTitle("Canada");
        String description = "The Canadian national flag ...";
        descriptionPane.setImageView(new ImageView("image/canadiaFlagIcon.png"));
        descriptionPane.setDescription(description);

        // Create a scene and place it in the stage
        Scene scene = new Scene(descriptionPane, 450, 200);
        primaryStage.setTitle("TextAreaDemo"); // set title for stage
        primaryStage.setScene(scene); // Place scene on stage
        primaryStage.show(); // display stage
    }
    
}
