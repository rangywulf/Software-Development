import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.util.List;
import java.util.Arrays;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FourCards extends Application {
    // Declare variables
    private ArrayList<String> deck = new ArrayList<>();
    private ArrayList<Label> cardLabels = new ArrayList<>();

    @Override // override start method in Application
    public void start(Stage primaryStage) {
        // CreateDeck to fill the deck with 52 cards
        

        // Create an HBox for the card row
        HBox hBox = new HBox(10); // spacing between cards is 10
        hBox.setAlignment(Pos.CENTER); // alignment to center

        // Loop 4 times
        for (int i = 0; i < 4; i++) {
            // Create an empty label
            Label cardLabel = new Label();
            // Add label to cardLabels
            cardLabels.add(cardLabel);
            // add the label to the HBox
            hBox.getChildren().add(cardLabel);
        }

        // Create a button with text "Refresh"
        Button btRefresh = new Button("Refresh");
        // When clicked, call refresh
        btRefresh.setOnAction(e -> refresh());
        // Create a VBox
        VBox vBox = new VBox(20); // Set spacing to 20
        vBox.setAlignment(Pos.CENTER); // Set Alignment to center

        // Add the HBox to the VBox
        vBox.getChildren().add(hBox);
        // Add the button to the VBox
        vBox.getChildren().add(btRefresh);

        // Create a scene using the VBox
        Scene scene = new Scene(vBox, 600, 300); // Set width to 600 and height to 300
        primaryStage.setTitle("Four Cards"); // Set the stage title to "Four Cards"
        primaryStage.setScene(scene); // Set the scene on the stage
        primaryStage.show(); // Show the stage
    }

    /* Create Deck */
    public void createDeck() {
        // Create a file object using the cards folder path
        File folder = new File("D:/Python/swtech/Software-Development/TESD_1800_Software_Development_Coursework/Chapter_15/Exercises/cards");
        List<String> names = Arrays.asList(folder.list()); // file names
        
        // Convert the file names to a list of strings
        List<String> names = Arrays.asList(folder.list());

        for (int i = 0; i < names.size(); i++) {// Loop through each file name
            // Skip the jokers
            if (!names.get(i).contains("joker")) {
                // Combine "file:" + folder path + "/" + file name
                String path = new File(folder, names.get(i)).toURI().toString();
                // Add the full path to the deck
                deck.add(path);
            }
        }
    }

    /** refresh method */
    public void refresh() {
        // Shuffle the deck using Collections.shuffle
        Collections.shuffle(names);
        
        // loop while counter is less than 4
        for (int i = 0; i < 4; i++) {
            // get the full path from deck at counter
            // create an image using the full path
            // create an Imageview using the image
                // Set the Imageview width to 100
                // keep the raio so the card is not stretched
            // get the label from the cardLabels at counter
            // set the label graphic to the ImageView
            // add 1 to counter
        }
        // do no remove cards from the deck
            // every click reshuffles all 52, so no repeates in one hand
    }
}
