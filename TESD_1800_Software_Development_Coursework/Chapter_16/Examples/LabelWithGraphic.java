import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;

public class LabelWithGraphic extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Label 1: text + image
    ImageView us = new ImageView(new Image("image/8 Bit Cat GIF.gif"));
    Label lb1 = new Label("US\n50 States", us);          // \n = two lines of text
    lb1.setStyle("-fx-border-color: green; -fx-border-width: 2"); // green border
    lb1.setContentDisplay(ContentDisplay.BOTTOM);        // image goes below the text
    lb1.setTextFill(Color.RED);                          // red text

    // Label 2: text + circle
    Label lb2 = new Label("Circle", new Circle(50, 50, 25));
    lb2.setContentDisplay(ContentDisplay.TOP);           // circle goes above the text
    lb2.setTextFill(Color.ORANGE);

    // Label 3: text + rectangle
    Label lb3 = new Label("Rectangle", new Rectangle(10, 10, 50, 25));
    lb3.setContentDisplay(ContentDisplay.RIGHT);         // rectangle goes right of the text

    // Label 4: text + ellipse
    Label lb4 = new Label("Ellipse", new Ellipse(50, 50, 50, 25));
    lb4.setContentDisplay(ContentDisplay.LEFT);          // ellipse goes left of the text

    // Label 5: text + a whole pane (an ellipse with a label on top of it)
    Ellipse ellipse = new Ellipse(50, 50, 50, 25);
    ellipse.setStroke(Color.GREEN);
    ellipse.setFill(Color.WHITE);
    StackPane stackPane = new StackPane();
    stackPane.getChildren().addAll(ellipse, new Label("JavaFX")); // label sits on the ellipse
    Label lb5 = new Label("A pane inside a label", stackPane);
    lb5.setContentDisplay(ContentDisplay.BOTTOM);

    // Put all five labels in a row with 20px between them
    HBox pane = new HBox(20);
    pane.getChildren().addAll(lb1, lb2, lb3, lb4, lb5);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 450, 150);
    primaryStage.setTitle("LabelWithGraphic"); // Set the stage title
    primaryStage.setScene(scene);              // Place the scene in the stage
    primaryStage.show();                       // Display the stage
  }
}


