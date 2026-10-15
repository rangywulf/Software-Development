/*
Author: Jess Stubbs
Date: 2026-10-15

This program displays a text field where the user enters a time 
in seconds and presses Enter. The remaining seconds are redisplayed 
every second. When the time reaches 0, the program stops the 
countdown and plays an alarm sound continuously.
*/

import javafx.application.Application;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class StopWatch extends Application {
    private static final String MEDIA_URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
    TextField text = new TextField();
    Timeline time;
    MediaPlayer mediaPlayer;
    int secondsLeft;

    @Override // override start method in Application class
    public void start(Stage primaryStage) {
        mediaPlayer = new MediaPlayer(new Media(MEDIA_URL)); 
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // set media player to repeat forever

        //set timeline to a new timeline with a key frame every 1 second
        time = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            secondsLeft--; // lower seconds left by 1
            text.setText(secondsLeft + ""); // show the number in the text field
            if (secondsLeft == 0) {
                time.stop(); // stop the timeline
                mediaPlayer.play(); //play the media player
            }
        }));

        time.setCycleCount(Timeline.INDEFINITE); // set timeline to repeat forever

        //Set actions for text field
        text.setOnAction(e -> {
            //set seconds left to the number typed in the text field
            secondsLeft = Integer.parseInt(text.getText());
            //play the timeline
            time.play();
        });
        
        text.setFont(Font.font(40)); //set text field font size
        text.setAlignment(Pos.CENTER); //center the text in the text field

        // Create scene and set stage
        Scene scene = new Scene(text, 200, 100);
        primaryStage.setTitle("Countdown"); // Set title for stage
        primaryStage.setScene(scene); // place scene on stage
        primaryStage.show(); // display stage
        
    }
    
}
