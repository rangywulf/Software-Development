package Software-Development.TESD_1800_Software_Development_Coursework.Chapter_15.Checkpoints;

public class CheckPoint15_2 {
    /* 15.2.1
    What is an event source object?
    - The component that creates and fires the event (a Button)
    What is an event object?
    - An object holding details about what happened.
    Describe the relationship between an event source object and an event object. 
    - The event source is the thing that the user interacts with.
    - When something happens to the source, it creates/fires an event object containing information
    - about what happened.
    - Analogy: The doorbell button(source) creates a "someone pressed me" signal (event).
    */

    /* 15.2.2
    Can a button fire a MouseEvent?
    - no. MouseEvent = mouse action and not a button
    Can a button fire a KeyEvent?
    - no. KeyEvent = keyboard action, and not a button
    Can a button fire an ActionEvent?
    - yes. ActionEvent = action performed on a control, such as activating a button
     */
}
