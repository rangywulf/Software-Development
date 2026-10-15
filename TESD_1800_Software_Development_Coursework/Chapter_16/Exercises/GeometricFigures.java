import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;

public class GeometricFigures extends Application {
    StackPane stackPane = new StackPane(); // create StackPane for figure

    // Create radio buttons
    RadioButton rbCircle = new RadioButton("Circle");
    RadioButton rbRectangle = new RadioButton("Rectangle");
    RadioButton rbEllipse = new RadioButton("Ellipse");

    // create fill check box
    CheckBox cbFill = new CheckBox("Fill");

    @Override // override start method in application class
    public void start(Stage primaryStage) {
        // Create Toggle Group
        ToggleGroup group = new ToggleGroup();
        rbCircle.setToggleGroup(group);
        rbRectangle.setToggleGroup(group);
        rbEllipse.setToggleGroup(group);
        rbRectangle.setSelected(true); // set rectangle as default

        // Create hbox for radio buttons
        HBox hbRadio = new HBox(10);
        hbRadio.setAlignment(Pos.CENTER);
        hbRadio.getChildren().addAll(rbCircle, rbRectangle, rbEllipse, cbFill);

        // Create BorderPane
        BorderPane pane = new BorderPane();
        pane.setCenter(stackPane);
        pane.setBottom(hbRadio);

        // Set actions to call refresh
        rbCircle.setOnAction(e -> refresh()); // when circle clicked, run the refresh method
        rbRectangle.setOnAction(e -> refresh()); // when rectangle clicked, run the refresh method
        rbEllipse.setOnAction(e -> refresh()); // when ellipse clicked, run the refresh method
        cbFill.setOnAction(e -> refresh()); // when Fill selected, run the refresh method

        // Call Refresh to draw first figure
        refresh();

        // create stage and set scene
        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("GeometricFigures"); // set title for stage
        primaryStage.setScene(scene); // place scene on stage
        primaryStage.show(); // display stage
    }

    /** Refresh Method */
    private void refresh() {
        stackPane.getChildren().clear(); // Clear stack pane
        Shape shape;// Create shape variable

        if (rbCircle.isSelected()) {
            shape = new Circle(30);
        } 
        else if (rbRectangle.isSelected()) {
            shape = new Rectangle(100, 60);
        } 
        else {
            shape = new Ellipse(30, 40);
        }

        shape.setStroke(Color.BLACK);
        shape.setFill(Color.WHITE);

        if (cbFill.isSelected()) {
            shape.setFill(Color.BLACK);
        }

        stackPane.getChildren().add(shape);
    }
    
    
}
