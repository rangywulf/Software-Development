package Software-Development.TESD_1800_Software_Development_Coursework.Chapter_15.Checkpoints;

public class CheckPoint15_3 {
    /* 15.3.1
    Why must a handler be an instance of an appropriate handler interface? 
    - The handler interface defines the method that JavaFX uses to handle
    - a specific type of event.
    - The handler must use the appropriate interface so JavaFX know which
    - method to call when that event occurs.
    */

    /* 15.3.2
    Explain how to register a handler object and how to implement a handler interface.
    - Register by invoking ex: source.setOnAction(listener);
    - Create a class that implements the appropriate handler interface.
    - ex. class MyHandler implements EventHandler<ActionEvent>
     */

    /* 15.3.3
    What is the handler method for the EventHandler<ActionEvent> interface?
    - handle(ActionEvent event)
    - ex: public void handle(ActionEvent event)
    */

    /* 15.3.4
    What is the registration method for a button to register an ActionEvent handler? 
    - Use the button's setOnAction() method.
    - btButton.setOnAction(new ButtonHandler());
    */
}
