/*
Author: Jess Stubbs
Date: 10/05/2026

This program uses JavaFX to display a stop sign. It builds a red octagon from 
eight corner points calculated with cos and sin, then centers white "STOP" 
text on top using a StackPane.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;


public class StopSign extends Application {
    @Override // Override start method in Application
    public void start(Stage primaryStage) {
        // Settings
        int radius = 120;
        int sides = 8;
        double offset = Math.PI / sides; // half a step, gives a flat top

        // Create the layout
        StackPane pane = new StackPane();

        // Build the octagon
        Polygon octagon = new Polygon();
        ObservableList<Double> points = octagon.getPoints();

        for (int i = 0; i < sides; i++) { // one corner per pass
            double angle = 2 * Math.PI * i / sides + offset;
            points.add(radius + radius * Math.cos(angle)); // x
            points.add(radius - radius * Math.sin(angle)); // y
        }

        octagon.setFill(Color.RED); // Fill octagon

        // Build the text
        Text text = new Text("STOP");
        text.setFill(Color.WHITE);
        text.setFont(Font.font("Arial", FontWeight.BOLD, 60));

        // Add in stacking order
        pane.getChildren().addAll(octagon, text);

        // Show the stage
        Scene scene = new Scene(pane, 300, 300); // Create the scene
        primaryStage.setTitle("Stop Sign"); // Set stage title
        primaryStage.setScene(scene); // Place scene on stage
        primaryStage.show(); // Display stage
        
    }
    
}
