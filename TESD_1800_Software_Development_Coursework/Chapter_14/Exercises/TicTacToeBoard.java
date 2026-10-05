import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TicTacToeBoard extends Application {
    @Override // Override the start method in Application
    public void start(Stage primaryStage) {
        // Load images
        Image xImage = new Image("image/x.gif");
        Image oImage = new Image("image/o.gif");

        // Create the GridPane
        GridPane pane = new GridPane();

        // Build array
        char[][] board = new char[3][3]; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        // Play a random number of moves (0 to 9), alternating X and O.
        int moves = (int)(Math.random() * 10);
        char turn = 'X';

        for (int count = 0; count < moves; count++) {
            int row = (int)(Math.random() * 3);
            int col = (int)(Math.random() * 3);

            // Keep picking until the cell is empty
            while (board[row][col] != ' ') {
                row = (int)(Math.random() * 3);
                col = (int)(Math.random() * 3);
            }

            board[row][col] = turn;

            // Stop the game if this move won
            if (hasWon(board, turn)) {
                break;
            }

            // Switch turns
            if (turn == 'X') {
                turn = 'O';
            } else {
                turn = 'X';
            }
        }
        
        // Draw the board from the array
        for (int i = 0; i < 3; i++) { // loop through the 3 rows
            for (int j = 0; j < 3; j++) { // loop through the 3 columns
                ImageView cell;

                // Create ImageViews
                if (board[i][j] == 'X') {
                    cell = new ImageView(xImage);
                }

                else if (board[i][j] == 'O') {
                    cell = new ImageView(oImage);
                }

                else {
                    cell = new ImageView();
                }

                // Set size of cells
                cell.setFitWidth(50);
                cell.setFitHeight(50);

                // Add cell to grid
                pane.add(cell, j, i); // column first (j), then row (i)
            }
        }

        // Set the stage
        Scene scene = new Scene(pane); // put the grid in a scene
        primaryStage.setTitle("Tic Tac Toe"); // Title for the stage
        primaryStage.setScene(scene); // place scene on stage
        primaryStage.show(); // Display the stage
    }
    
    // Returns true if 'player' has 3 in a row anywhere
    private boolean hasWon(char[][] board, char player) {
        // Check the 3 rows and 3 columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // row i is all player
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // column i is all player
            }
        }

        // Check the 2 diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false; // no line found
    }
}
