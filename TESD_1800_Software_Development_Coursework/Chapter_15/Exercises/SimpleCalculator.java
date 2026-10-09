import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class SimpleCalculator extends Application {
    @Override // override start method in Application
    public void start(Stage primaryStage) {
        // Create first label and text field
        Label firstLabel = new Label("Number 1:");
        TextField firstField = new TextField();
        firstField.setPrefColumnCount(4);

        // Create second label and text field
        Label secondLabel = new Label("Number 2:");
        TextField secondField = new TextField();
        secondField.setPrefColumnCount(4);

        // Create result label and text field
        Label resultLabel = new Label("Result: ");
        TextField resultField = new TextField();
        resultField.setPrefColumnCount(4);
        resultField.setEditable(false); // makes text field uneditable

        // Create Row 1
        HBox row1 = new HBox(5); // 5px spacing between elements
        row1.setAlignment(Pos.CENTER);
        row1.getChildren().addAll(firstLabel, firstField, secondLabel, secondField, resultLabel, resultField);

        // Create buttons
        Button btAdd = new Button("Add");
        Button btSubtract = new Button("Subtract");
        Button btMultiply = new Button("Multiply");
        Button btDivide = new Button("Divide");

        // Create row 2
        HBox row2 = new HBox(10); // 10px spacing between elements
        row2.setAlignment(Pos.CENTER);
        row2.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);

        // Main Container
        VBox vBox = new VBox(15); // 15px vertical spacing between rows
        vBox.setPadding(new Insets(15));
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(row1, row2);

        // Create stage
        Scene scene = new Scene(vBox, 450, 100);
        primaryStage.setTitle("Simple Calculator"); // set title for stage
        primaryStage.setScene(scene); // place scene on stage
        primaryStage.show(); // display the stage

        // Button actions
        btAdd.setOnAction(e -> calculate(firstField, secondField, resultField, '+'));
        btSubtract.setOnAction(e -> calculate(firstField, secondField, resultField, '-'));
        btMultiply.setOnAction(e -> calculate(firstField, secondField, resultField, '*'));
        btDivide.setOnAction(e -> calculate(firstField, secondField, resultField, '/'));    
    }

    /** calculate method */
    private void calculate(TextField firstField, TextField secondField, TextField resultField, char operator) {
        double num1 = Double.parseDouble(firstField.getText());
        double num2 = Double.parseDouble(secondField.getText());
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    resultField.setText("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
                break;
        }

        resultField.setText(String.valueOf(result));
    }
    
}
