

public class CheckPint14_4 {
    /* 14.4.1
    How do you create a Scene object?
    - Scene scene = new Scene(pane, 200, 50);
    How do you set a scene in a stage?
    - primaryStage.setScene(scene);
    How do you place a circle into a scene?
    - Pane pane = new Pane();
    - pane.getChildren().add(circle);
     */

    /* 14.4.2
    What is a pane?
    - A container that automatically lays out the nodes inside it (location and size)
    What is a node?
    - a node is a Shape, ImageView, UI Control, Group, or Pane.
    How do you place a node in a pane?
    - StackPane pane = new StackPane(); // a pane that stacks nodes in the center
    - pane.getChildren().add(new Button("OK")); // getChildren() returns the pane's list of child nodes
    Can you directly place a Shape or an ImageView into a Scene?
    - No. They are a subtype of the node and need a pane. A Scene only accepts a Parent as it's top-level item (root).
    Can you directly place a Control or a Pane into a Scene?
    - Yes.
    
    */

    /* 14.4.3
    How do you create a Circle?
    - Circle circle = new Circle();
    How do you set its center location and radius?
    - circle.setCenterX(100);
    - circle.setCenterY(100);
    - circle.setRadius(50);
    How do you set its stroke color and fill color?
    - circle.setStroke(Color.BLACK);
    - circle.setFill(Color.WHITE); 
    */

    /* 14.4.4
    HOw do you replace the code in the following lines?
    Pane pane = new Pane();
    pane.getChildren().add(circle) 
    
    - Pane pane = new Pane(circle);
    - The Pane constructor (the method that builds it) can accept nodes directly. 
    - It does the getChildren().add(...) step for you.
    */
}
