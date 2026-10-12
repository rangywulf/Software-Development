/*
Author: Jess Stubbs
Date: 10/11/2026

This JavaFX program animates a blue rectangle moving along the outline 
of a pentagon while its opacity fades in and out. A left mouse click 
resumes the animation, and a right click pauses it.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseButton;
import javafx.animation.PathTransition;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class PentagonAnimation extends Application {
    @Override // Override start method in Application class
    public void start(Stage primaryStage) {
        Pane pane = new Pane(); // Create Pane

        // Create Polygon
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(150.0, 50.0, 245.0, 119.0, 209.0, 231.0, 91.0, 231.0, 55.0, 119.0); // create points
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);

        // Create Rectangle
        Rectangle rectangle = new Rectangle(40, 20);
        rectangle.setFill(Color.BLUE);

        // Create Path Transition
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setNode(rectangle);
        pt.setPath(polygon);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setInterpolator(Interpolator.LINEAR); //steady speed
        pt.play(); // start animation

        // Create fade transition
        FadeTransition ft = new FadeTransition(Duration.millis(2000), rectangle);
        ft.setFromValue(1.0);
        ft.setToValue(0.2);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play(); // Start animation

        // add shapes to pane
        pane.getChildren().addAll(polygon, rectangle);

        // Set Mouse Click action
        pane.setOnMouseClicked(e -> {
            // if the button is the left buttong
            if (e.getButton() == MouseButton.PRIMARY) {
                pt.play(); // play path transition
                ft.play(); // play fade transition
            }
            else if (e.getButton() == MouseButton.SECONDARY) {
                pt.pause(); // pause path transition
                ft.pause(); // pause fade transition
            }
        });

        // Create scene and stage
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Pentagon Animation"); // Set title for stage
        primaryStage.setScene(scene); // place scene on stage
        primaryStage.show(); // display the stage     
    }
    
}
