/*
Author: Jess Stubbs
Date: 10/05/2026

RandomTime is a JavaFX program that shows a ClockPane set to a random hour (0 to 11) 
and a minute of 0 or 30, with the second hand hidden and the time in a label below.
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class RandomTime extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a clock and a label
        int hour = (int)(Math.random() * 12); 
        int minute = (int)(Math.random() * 2) * 30;
        ClockPane clock = new ClockPane(hour, minute, 0);
        clock.setSecondHandVisible(false); // hides the second hand
        String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);

        // Place clock and label in border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene (pane, 250, 250);
        primaryStage.setTitle("RandomTime"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    
}
