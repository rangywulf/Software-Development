public class CheckPoint14_3 {
    /* 14.3.1
    How do you define a JavaFX main class?
    - you need to extend Application. public class MyjavaFXApp extends Application
    What is the signature of the start method?
    - @Override
    - public void start(javafx.stage.Stage primaryStage)
    What is a stage?
    - It represents the to-level container of your user interface. It's essentially the window itself.
    What is a primary stage?
    - the initial, main window created automatically by the runtime environment when your application launches.
    Is a primary stage-automatically created?
    - yes
    How do you display a stage?
    - you use the show() method ex. primaryStage.show();
    Can you prevent the user from resizing the stage?
    - Yes. Use setResizable(false)
    Can you place Application.launch(args by launch(args) in line 22 of the example?
    - As long as you are calling it directly inside a class that extends Application. */

    /* 14.3.2 
    Show the output of the following JavaFX program 
    import javafx.application.Application;
    import javafx.stage.Stage;

    public class Test extends Application {
        public Test() {
            System.out.println("Test constructor is invoked");
        }
        @Override // Override the start method in the Application class
        public void start(Stage primaryStage) {
            System.out.println("start method is invoked");
        }

        public static void main(String[] args) {
            System.out.println("launch application");
            Application.launch(args);
        }
    }
    
    launch application
    Test constructor is invoked
    Start method is invoked
    */

    
}
