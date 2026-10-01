package Software-Development.TESD_1800_Software_Development_Coursework.Chapter_14.Checkpoints;

public class Checkpoint14_11 {
    /* 14.11.1
    How do you display a text, line, rectangle, circle, ellipse, arc, polygon, and polyline 
    In JavaFX, you create an object for each shape, add it to a pane, and show the pane in a scene on the stage.
    The classes are Text, Line, Rectangle, Circle, Ellipse, Arc, Polygon, and Polyline. Each one is a node, 
    so you add it to a container with pane.getChildren().add(shape). 
    Then you put the pane in a Scene, set the scene on the Stage, and call stage.show().
    Example: pane.getChildren().add(new Circle(50, 50, 25));  // circle at (50,50), radius 25
    */

    /* 14.11.2 
    Write code fragments to display a string rotated 45 degrees in the center of the pane.
    Text text = new Text("Hello");

    // Center the text (x is the left edge, so subtract half the text width)
    text.setX(pane.getWidth() / 2 - text.getLayoutBounds().getWidth() / 2);
    text.setY(pane.getHeight() / 2);

    text.setRotate(45);   // rotates 45 degrees clockwise around the text's center

    pane.getChildren().add(text);
    */

    /* 14.11.3
    Write code fragments to display a thick line of 10 pixels from (10, 10) to (70, 30)
    Line line = new Line(10, 10, 70, 30);
    line.setStrokeWidth(10); // Thickness in pixels
    pane.getChildren().add(line);
    */

    /* 14.11.4 
    Write code fragments to fill red color into a rectangle of width 100 and height 50 with the upper-left corner at (10, 10)
    Rectangle rect = new Rectangle(10, 10, 100, 50);
    rect.setFill(Color.RED);
    pane.getChildren().add(rect);
    */

    /* 14.11.5
    Write code fragments to display a round-cornered rectangle with width 100, height 200 with the upper-left corner at (10, 10), 
    corner horizontal diameter 40, and corner vertical diameter 20.

    Rectangle rect = new Rectangle(10, 10, 100, 200);
    rect.setArcWidth(40); // corner horizontal diameter
    rect.setArcHeight(20); // corner vertical diameter

    pane.getChildren().add(rect)
    */

    /* 14.11.6
    Write code fragments to display an ellipse with horizontal radius 50 and ­vertical radius 100.
    Ellipse ellipse = new Ellipse(100, 150, 50, 100);
    
    */

    /* 14.11.7
    Write code fragments to display the outline of the upper half of a circle with radius 50.
    Arc arc = new Arc(100, 100, 50, 50, 0, 180);
    arc.setType(ArcType.OPEN); // just the curve, no closing line
    arc.setFill(null); // no fill, outline only
    arc.setStroke(Color.BLACK);
    */

    /* 14.11.8
    Write code fragments to display the lower half of a circle with radius 50 filled with the red color.
    Arc arc = new Arc(100, 100, 50, 50, 180, 180) //start at 9 o'clock, sweep 180 degrees counterclockwise
    arc.setType(ArcType.CHORD); // closes the half with a straight line across the top
    arc.setFill(Color.RED);
    */

    /* 14.11.9
    Write code fragments to display a polygon connecting the following points: (20, 40), (30, 50), (40, 90), (90, 10), and (10, 30), 
    and fill the polygon with green color. 
    Polygon polygon = new Polygon();
    polygon.setFill(Color.GREEN);

    // Points go in an as x, y pairs, one after another
    polygon.getPoints().addAll(20.0, 40.0, 
        30.0, 50.0, 
        40.0, 90.0,
        90.0, 10.0,
        10.0, 30.0);
    */

    /* 14.11.10
    Write code fragments to display a polyline connecting the following points: (20, 40), (30, 50), (40, 90), (90, 10), and (10, 30).
    Polyline polyline = new Polyline();
    polyline.getPoints().addAll(20.0, 40.0, 
        30.0, 50.0, 
        40.0, 90.0,
        90.0, 10.0,
        10.0, 30.0);
     */    
}
