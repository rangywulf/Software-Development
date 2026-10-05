import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class DisplayImages extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Make the GridPane
        GridPane pane = new GridPane();

        // Make four ImageViews
        Image image1 = new Image("image/8 Bit Cat GIF.gif");
        Image image2 = new Image("image/Screenshot_20260910_225859_Instagram.jpg");
        Image image3 = new Image("image/space-balls-funny.gif");
        Image image4 = new Image("image/WhiteSharkControversy201902_1.jpg");

        ImageView view1 = new ImageView(image1);
        ImageView view2 = new ImageView(image2);
        ImageView view3 = new ImageView(image3);
        ImageView view4 = new ImageView(image4);

        // Set size for images
        view1.setFitWidth(200);
        view1.setPreserveRatio(true);
        view2.setFitWidth(200);
        view2.setPreserveRatio(true);
        view3.setFitWidth(200);
        view3.setPreserveRatio(true);
        view4.setFitWidth(200);
        view4.setPreserveRatio(true);
        
        // Place each image in the grid
        pane.add(view1, 0, 0);
        pane.add(view2, 1, 0);
        pane.add(view3, 0, 1);
        pane.add(view4, 1, 1);

        // Put GridPane in a Scene
        Scene scene = new Scene(pane);
        primaryStage.setTitle("DisplayImages"); // Set title of the stage
        primaryStage.setScene(scene); // Place scene on the stage
        primaryStage.show(); // Display the stage
    }

    /** Main Method */
    public static void main(String[] args) {
        launch(args);
    }
    
}
