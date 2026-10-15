import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;

public class TrafficLights extends Application {
    StackPane stackPane = new StackPane(); // create stackpane

    // Create radio buttons
    RadioButton rbRed = new RadioButton("Red");
    RadioButton rbYellow = new RadioButton("Yellow");
    RadioButton rbGreen = new RadioButton("Green");

    @Override // override start method in Application class
    public void start(Stage primaryStage) {
        // Create Toggle Group
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbGreen.setToggleGroup(group);

        // Create Top Circle
        Circle topCircle = new Circle(15);
        topCircle.setFill(Color.WHITE);
        topCircle.setStroke(Color.BLACK);

        // Create Middle Circle
        Circle middleCircle = new Circle(15);
        middleCircle.setFill(Color.WHITE);
        middleCircle.setStroke(Color.BLACK);

        // Create bottom circle
        Circle bottomCircle = new Circle(15);
        bottomCircle.setFill(Color.WHITE);
        bottomCircle.setStroke(Color.BLACK);

        // Create rectangle
        Rectangle rectangle = new Rectangle(50, 120);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        // Create VBox
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(topCircle, middleCircle, bottomCircle);

        // Add rectangle and vBox to stackpane
        stackPane.getChildren().addAll(rectangle, vBox);

        // Create HBox for radiobuttons
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(rbRed, rbYellow, rbGreen);

        // Create borderpane
        BorderPane pane = new BorderPane();
        pane.setCenter(stackPane);
        pane.setBottom(hBox);

        // Set Actions
        rbRed.setOnAction(e -> {
            topCircle.setFill(Color.RED);
            middleCircle.setFill(Color.WHITE);
            bottomCircle.setFill(Color.WHITE);
        });

        rbYellow.setOnAction(e -> {
            topCircle.setFill(Color.WHITE);
            middleCircle.setFill(Color.YELLOW);
            bottomCircle.setFill(Color.WHITE);
        });

        rbGreen.setOnAction(e -> {
            topCircle.setFill(Color.WHITE);
            middleCircle.setFill(Color.WHITE);
            bottomCircle.setFill(Color.GREEN);
        });

        // Create scene and set stage
        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("TrafficLights"); // Set title for stage
        primaryStage.setScene(scene); // place scene on stage
        primaryStage.show(); // Display stage
    }   
}
