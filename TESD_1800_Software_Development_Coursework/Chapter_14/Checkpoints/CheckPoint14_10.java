package Software-Development.TESD_1800_Software_Development_Coursework.Chapter_14.Checkpoints;

public class CheckPoint14_10 {
    /* 14.10.1
    How do you add a node to a Pane, StackPane, FlowPane, GridPane, BorderPane, HBox, and VBox?
    - pane.getChildren().add(node)
    - stackPane.getChildren().add(node)
    - flowPane.getChildren().add(node)
    - hBox.getChildren().add(node)
    - vBox.getChildren().add(node)
    - gridPane.getChildren().add(node)
    - borderPane.getChildren().add(node)

    How do you remove a node from these panes?
    pane.getChildren().remove(node)
    */

    /* 14.10.2
    How do you set the alignment to right for nodes in a FlowPane, Gridpane, HBox, and VBox
    - hBox.setAlignment(Pos.CENTER_RIGHT)
    - vBox.setAlignment(Pos.TOP_RIGHT)
    - flowPane.setAlignment(Pos.TOP_RIGHT)
    - gridPane.setAlignment(Pos.TOP_RIGHT)
    
    */

    /* 14.10.3
    How do you set the horizontal gap and vertical gap between nodes in 9 pixels in a FlowPane and GridPane
    and set spacing in 8 pixels in an HBox and VBox?
    - FlowPane setHgap(9) and setVgap(9)
    - GridPaen setHgap(9) and setVgap(9)
    - HBox setSpacing(8)
    - VBox setSpacing(8)
    */

    /* 14.10.4
    How do you get the column and row index of a node in a GridPane?
    - GridPane.getColumnIndex(node) and GridPane.getRowIndex(node)
    How do you reposition a node in a GridPane?
    - Change Index GridPane.setColumnIndex(node, 3)
    - Set both at once: GridPane.setConstraints(node, 3, 0)
    - Remove: gridPane.getChildren().remove(nameLabel);
    - re-add: gridPane.add(nameLabel, 3, 0);
    */

    /* 14.10.5
    What are the differences between a FlowPane and an HBox and VBox?
    - A FlowPane places nodes in a line and wraps to a new row when it runs out of space, like words in a paragraph. 
    An HBox is locked to a single row and a VBox is locked to a single column, so if there are too many nodes, 
    they run off the edge instead of wrapping. FlowPane uses two gap settings (setHgap and setVgap), while HBox 
    and VBox use one (setSpacing). Use a FlowPane when you want things to rearrange as the window resizes, and 
    an HBox or VBox when you want a fixed row or column.
    */
}
