import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;

public class RectangleRotate extends Application {
    // Declare rectangle
    Rectangle rectangle = new Rectangle();

    @Override // override start method in Application
    public void start(Stage primaryStage) {
        rectangle.setWidth(100); // set width
        rectangle.setHeight(50); // set height
        rectangle.setFill(Color.WHITE); // set fill color
        rectangle.setStroke(Color.BLACK); // set stroke color

        // Create a button with text "Rotate"
        Button btRotate = new Button("Rotate");
        btRotate.setOnAction(e -> rotate()); // when clicked, call rotate

        // Create a VBox
        VBox vBox = new VBox(20);
        vBox.setAlignment(Pos.CENTER); // set alignment to center
        vBox.getChildren().addAll(rectangle, btRotate); // add rectangle and button to vbox

        // Create the stage and scene
        Scene scene = new Scene(vBox, 300, 200);
        primaryStage.setTitle("Rotate Rectangle"); // set title for stage
        primaryStage.setScene(scene); // place scene on stage
        primaryStage.show(); // display stage
    }

    public void rotate() {
        // get the rectangle's current rotation, then add 15
        rectangle.setRotate(rectangle.getRotate() + 15);
    }
    
}
