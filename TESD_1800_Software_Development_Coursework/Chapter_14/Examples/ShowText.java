import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class ShowText extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));

        Text text1 = new Text(20, 20, "Programming is fun");
        // Text(x, y, string) — starts at position (20, 20)

        text1.setFont(Font.font("Courier", FontWeight.BOLD,
            FontPosture.ITALIC, 15));
        // same Font.font() pattern from 14.8: name, weight, posture, size

        pane.getChildren().add(text1);

        Text text2 = new Text(60, 60, "Programming is fun\nDisplay text");
        // \n breaks this into two lines of text

        pane.getChildren().add(text2);

        Text text3 = new Text(10, 100, "Programming is fun\nDisplay text");
        text3.setFill(Color.RED);
        // fill = text color here (text doesn't really have a visible "outline"
        // in normal use, so fill is what controls the color you actually see)

        text3.setUnderline(true);
        text3.setStrikethrough(true);
        // adds an underline AND a strike-through line

        pane.getChildren().add(text3);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowText");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}