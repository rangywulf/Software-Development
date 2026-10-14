import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class RadioButtons extends Application {
    @Override //override start method in application class
    public void start(Stage primaryStage) {
        // Create message text
        Text text = new Text("Programming is fun");
        text.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        text.setFill(Color.RED);
        text.setX(20);
        text.setY(40);

        // Create pane for message
        Pane pane = new Pane();
        pane.getChildren().add(text);

        // Create radio buttons
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbBlack = new RadioButton("Black");
        RadioButton rbOrange = new RadioButton("Orange");
        RadioButton rbGreen = new RadioButton("Green");

        // Create toggle group
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbBlack.setToggleGroup(group);
        rbOrange.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbRed.setSelected(true); // Make red the starting choice when the window opens

        // set action for each radio button
        rbRed.setOnAction(e -> {
            if (rbRed.isSelected()) {
                text.setFill(Color.RED);
            }
        });

        rbYellow.setOnAction(e -> {
            if (rbYellow.isSelected()) {
                text.setFill(Color.YELLOW);
            }
        });

        rbBlack.setOnAction(e -> {
            if (rbBlack.isSelected()) {
                text.setFill(Color.BLACK);
            }
        });

        rbOrange.setOnAction(e -> {
            if (rbOrange.isSelected()) {
                text.setFill(Color.ORANGE);
            }
        });

        rbGreen.setOnAction(e -> {
            if (rbGreen.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });

        // Create HBox for radio buttons
        HBox rbhBox = new HBox(10);
        rbhBox.setAlignement(Pos.CENTER);
        rbhBox.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);

        // Create buttons
        Button btLeft = new Button("<=");
        Button btRight = new Button("=>");


        // Create BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(rbhBox);

    }
    
}
