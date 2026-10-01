import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class ShowRectangle extends Application {
    @Override
    public void start(Stage primaryStage) {
        Rectangle r1 = new Rectangle(25, 10, 60, 30);
        // Rectangle(x, y, width, height)

        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);

        Rectangle r2 = new Rectangle(25, 50, 60, 30);
        // no stroke/fill set, so defaults apply (see note below)

        Rectangle r3 = new Rectangle(25, 90, 60, 30);
        r3.setArcWidth(15);
        r3.setArcHeight(25);
        // rounds r3's corners, turning it into a rounded rectangle

        Group group = new Group();
        // Group from 14.4/14.10: holds nodes so transformations apply to all of them

        group.getChildren().addAll(new Text(10, 27, "r1"), r1,
            new Text(10, 67, "r2"), r2, new Text(10, 107, "r3"), r3);
        // labels each rectangle with a Text node, then adds the rectangle itself

        for (int i = 0; i < 4; i++) {
            Rectangle r = new Rectangle(100, 50, 100, 30);

            r.setRotate(i * 360 / 8);
            // rotates each rectangle a different amount: 0, 45, 90, 135 degrees
            // (i goes 0,1,2,3 so i*360/8 = 0, 45, 90, 135)

            r.setStroke(Color.color(Math.random(), Math.random(),
                Math.random()));
            // random outline color each time through the loop
            // uses the random color technique from the 14.7 extension notes

            r.setFill(Color.WHITE);
            group.getChildren().add(r);
        }

        Scene scene = new Scene(new BorderPane(group), 250, 150);
        // group is placed inside a BorderPane's CENTER region (see explanation below)

        primaryStage.setTitle("ShowRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}