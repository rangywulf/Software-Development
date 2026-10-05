import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Collections;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class DisplayThreeCards extends Application {
    @Override // Override start in Application
    public void start(Stage primaryStage) {
        // Build the deck (54 cards, jokers included)
        File folder = new File("D:/Python/swtech/Software-Development/TESD_1800_Software_Development_Coursework/Chapter_14/Exercises/cards");
        List<String> names = Arrays.asList(folder.list()); // file names

        // Shuffle the deck
        Collections.shuffle(names);

        // Create the layout (one row)
        HBox pane = new HBox();

        // Show the first 3 cards
        for (int i = 0; i < 3; i++) {
            String path = new File(folder, names.get(i)).toURI().toString(); // builds the link to the card
            Image cardImage = new Image(path); // loads the picture
            ImageView cardView = new ImageView(cardImage); // the frame that displays the card
            pane.getChildren().add(cardView); // add cardView to pane
        }

        // Show the stage
        Scene scene = new Scene(pane); // Create the scene
        primaryStage.setTitle("Display Three Cards"); // Set stage title
        primaryStage.setScene(scene); // Place the scene on the stage
        primaryStage.show(); // Display the stage.
    }
    
}
