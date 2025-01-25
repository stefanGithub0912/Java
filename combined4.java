//Create a Tic-Tac-Toe game for two players, implemented with a 3x3 array, where players take turns to input their moves
import java.util.Scanner;
public class combined4 {
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char currentPlayer = 'X'; 
        boolean gameWon = false;
        Scanner sc = new Scanner(System.in);
        printBoard(board);
        for (int turn = 0; turn < 9; turn++) { // turns = 9(max)
            System.out.println("Player " + currentPlayer + ", it's your turn. Enter row and column (1-3):");
            int row, col;
            while (true) {
                System.out.print("Row: ");
                row = sc.nextInt() - 1; 
                System.out.print("Column: ");
                col = sc.nextInt() - 1;
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }
            board[row][col] = currentPlayer;
            printBoard(board);

            if (checkWin(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch player
        }

        if (!gameWon) {
            System.out.println("It's a draw!");
        }
    }

    // Function to print the board
    private static void printBoard(char[][] board) {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
    }

    //curent player has won
    private static boolean checkWin(char[][] board, char player) {
    	//rows - check
    	for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        //diagnol
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }
	}
