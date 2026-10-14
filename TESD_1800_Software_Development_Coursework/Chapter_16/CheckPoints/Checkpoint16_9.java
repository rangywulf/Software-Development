package Software-Development.TESD_1800_Software_Development_Coursework.Chapter_16.CheckPoints;

public class Checkpoint16_9 {
    /* 16.9.1
    How do you create an observable list with an array of string?
    - ObservableList<String> items = FXCollections.observableArrayList(
        "Item 1", "Item 2", "Item 3",
        "Item 4", "Item 5", "Item 6");
    - or
    - ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
    */

    /* 16.9.2
    How do you set the orientation in a list view?
    lv.setOrientation(Orientation.VERTICAL or HORIzONTAL)
    */

    /* 16.9.3
    What selection modes are available for a list view?
    - SelectionMode.SINGLE
    - SelectionMode.MULTIPLE
    What is the default selection mode?
    - SelectionMode.SINGLE
    How do you set a selection mode?
    - .getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE)
    */

    /* 16.9.4
    How do you obtain the selected items and selected indices?
    - lv.getSelectionModel().getSelectedItems();
    - lv.getSelectionModel().getSelectedIndices();
    */

}
