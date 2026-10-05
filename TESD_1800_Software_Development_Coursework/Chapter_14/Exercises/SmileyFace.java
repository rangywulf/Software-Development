import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;

public class SmileyFace extends Application {
    @Override // override start method in application
    public void start(Stage primaryStage) {
        // Create pane
        Pane pane = new Pane();

        // Create the face
        Circle face = new Circle(100, 100, 90);
        face.setFill(Color.WHITE);
        face.setStroke(Color.BLACK);

        // Create the eye
        Ellipse leftEye = new Ellipse(70, 70, 18, 12);
        Ellipse rightEye = new Ellipse(130, 70, 18, 12);
        leftEye.setFill(Color.WHITE);
        leftEye.setStroke(Color.BLACK);
        rightEye.setFill(Color.WHITE);
        rightEye.setStroke(Color.BLACK);

        // Create the pupil
        Circle leftPupil = new Circle(70, 70, 7);
        Circle rightPupil = new Circle(130, 70, 7);
        leftPupil.setFill(Color.BLACK);
        rightPupil.setFill(Color.BLACK);

        // Create the nose
        Polygon nose = new Polygon(100, 85, 85, 115, 115, 115);
        nose.setFill(Color.WHITE);
        nose.setStroke(Color.BLACK);

        // Create the mouth
        Arc mouth = new Arc(100, 130, 40, 25, 180, 180);
        mouth.setType(ArcType.OPEN); // curve only, no straight line
        mouth.setFill(Color.TRANSPARENT); 
        mouth.setStroke(Color.BLACK);

        // Add everything into the pane
        pane.getChildren().addAll(face, leftEye, rightEye, leftPupil, rightPupil, nose, mouth);

        // Display the stage
        Scene scene = new Scene(pane, 200, 200); // Create the scene
        primaryStage.setTitle("Smiley Face"); // Set title of the stage
        primaryStage.setScene(scene); // Place scene on stage
        primaryStage.show(); // Display the stage
    }
    
}
