import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class ListViewDemo extends Application {
    // Declare na array of Strings for flag titles
    private String[] flagTitles = {"Canada", "China", "Denmark",
        "France", "Germany", "India", "Norway", "United Kingdom",
        "United States of America"};

    // Declare an ImageView array for the national flags of 9 countries
    private ImageView[] flagImage = {new ImageView("flags/ca.png"),
        new ImageView("flags/cn.png"),
        new ImageView("flags/dk.png"),
        new ImageView("flags/fr.png"),
        new ImageView("flags/de.png"),
        new ImageView("flags/in.png"),
        new ImageView("flags/no.png"),
        new ImageView("flags/gb.png"),
        new ImageView("flags/us.png")};

    @Override //override the start method in the Application class
    public void start(Stage primaryStage) {
        ListView<String> lv = new ListView<>(FXCollections.observableArrayList(flagTitles));
        lv.setPrefSize(400, 400);
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        // Create a pane to hold image views
        FlowPane imagePane = new FlowPane(10, 10);
        BorderPane pane = new BorderPane();
        pane.setLeft(new ScrollPane(lv));
        pane.setCenter(imagePane);


        lv.getSelectionModel().selectedItemProperty().addListener(ov -> {
            imagePane.getChildren().clear();
            for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
                flagImage[i].setFitWidth(80);
                flagImage[i].setPreserveRatio(true);
                imagePane.getChildren().add(flagImage[i]);
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setTitle("ListViewDemo"); // set title for stage
        primaryStage.setScene(scene); // place scene on stage
        primaryStage.show(); // display stage
    }
}
