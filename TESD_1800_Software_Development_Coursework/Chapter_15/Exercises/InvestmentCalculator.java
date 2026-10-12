import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.HPos;

public class InvestmentCalculator extends Application {
     // Declare variables and create the texfields
    TextField tfInvestment = new TextField();
    TextField tfYears = new TextField();
    TextField tfRate = new TextField();
    TextField tfFutureValue = new TextField();

    @Override // Override start method in Application class
    public void start(Stage primaryStage) {
        // Create GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER); // set alignement to center
        gridPane.setHgap(5); // set horizontal gap
        gridPane.setVgap(5); // set vertical gap

        // Create labels
        Label firstLabel = new Label("Investment Amount:");
        Label secondLabel = new Label("Number of Years:");
        Label thirdLabel = new Label("Annual Interest Rate:");
        Label fourthLabel = new Label("Future Value:");

        // add lable and tfInvestment to row 0
        gridPane.add(firstLabel, 0, 0);
        gridPane.add(tfInvestment, 1, 0);

        // add Label and tfYears to row 1
        gridPane.add(secondLabel, 0, 1);
        gridPane.add(tfYears, 1, 1);

        // add Label and tfRate to row 2
        gridPane.add(thirdLabel, 0, 2);
        gridPane.add(tfRate, 1, 2);

        // add Label and tfFutureValue to row 3
        gridPane.add(fourthLabel, 0, 3);
        gridPane.add(tfFutureValue, 1, 3);
        tfFutureValue.setEditable(false); // Make uneditable

        // Create button with text
        Button btCalculate = new Button("Calculate");

        // add button to row 4 column 1
        gridPane.add(btCalculate, 1, 4);
        GridPane.setHalignment(btCalculate, HPos.RIGHT); // set button alignment to the right

        // button calls calculate
        btCalculate.setOnAction(e -> calculate());

        // Create scene and set stage
        Scene scene = new Scene(gridPane, 350, 220);
        primaryStage.setTitle("Investment Calculator"); // set title for stage
        primaryStage.setScene(scene); // place scene on stage
        primaryStage.show(); // Display scene
    }

    private void calculate() {
        // Convert from String to Double
        double invest = Double.parseDouble(tfInvestment.getText());
        double years = Double.parseDouble(tfYears.getText());
        double rate = Double.parseDouble(tfRate.getText());

        // Get Monthly rate
        double monthlyRate = rate / 1200;

        // Calculate future value
        double futureValue = invest * Math.pow(1 + monthlyRate, years * 12);

        // Set to 2 decimal points
        tfFutureValue.setText(String.format("$%.2f", futureValue));
    }
    
}
