import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.geometry.Pos;

class BallPane extends Pane {
    private Circle circle;
    
    /** Ball Pane */
    public BallPane() {
        circle = new Circle(30, 30, 20); // Create circle
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        getChildren().add(circle); // add circle to BallPane
    }

    /** Move Left */
    public void moveLeft() {
        if ((circle.getCenterX() - circle.getRadius()) > 0) 
            circle.setCenterX(circle.getCenterX() - 10);
    }

    /** Move right */
    public void moveRight() {
        if ((circle.getCenterX() + circle.getRadius() < getWidth()))
            circle.setCenterX(circle.getCenterX() + 10);
    }

    /** Move up */
    public void moveUp() {
        if ((circle.getCenterY() - circle.getRadius()) > 0)
            circle.setCenterY(circle.getCenterY() - 10);
    }

    /** Move Down */
    public void moveDown() {
        if ((circle.getCenterY() + circle.getRadius() < getHeight()))
            circle.setCenterY(circle.getCenterY() + 10);
    }    
}

public class MoveBall extends Application {
    @Override // override the start method in application
    public void start(Stage primaryStage) {
        BallPane ballPane = new BallPane(); // create BallPane
        // Create left, right, up and down buttons
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");

        btLeft.setOnAction(e -> ballPane.moveLeft()); // left button calls moveLeft
        btRight.setOnAction(e -> ballPane.moveRight()); // Right button calls moveRight
        btUp.setOnAction(e -> ballPane.moveUp()); // Up button calls moveUP
        btDown.setOnAction(e -> ballPane.moveDown()); // Down button calls moveDown

        // Create HBox with spacing 10
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER); // set alignment to center
        hBox.getChildren().addAll(btLeft, btRight, btUp, btDown); // add the four buttons
        
        // create BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(ballPane); // set BallPane in center
        borderPane.setBottom(hBox); // set HBox at bottom
        
        // Create stage
        Scene scene = new Scene(borderPane, 300, 200); // create scene with width 300 and height 200
        primaryStage.setTitle("Move Ball"); // set stage title to "Move Ball"
        primaryStage.setScene(scene); // Place scene on stage
        primaryStage.show(); // display the stage
    }
}
