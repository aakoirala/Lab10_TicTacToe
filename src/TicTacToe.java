import java.util.Scanner;

public class TicTacToe {
    //Make game board here so it can be accessed by all methods
    private static String[][] board = new String[3][3];


    //main method - game simulated here
    public static void main(String[] args) {
        //Variables you might want to make
        Scanner scan = new Scanner(System.in);
        String player1 = "X";
        String player2 = "O";
        int p1row;
        int p1col;
        int p2row;
        int p2col;
        boolean player1Valid;
        boolean player2Valid;
        boolean gameOver;
        boolean playAgain;


        //This do-while loops allows for multiple games to be played
        do {

//This do-while loop keeps running while the game is still going
//Stops once a winner or tie occurs
            do {

                //Player 1 - loops until valid move made
                do {

                } while (???);


                //Player 2 - loops until valid move made
                do {

                } while (???);

            } while (???);

        } while (???);
    }
    //helper methods go here
    private static void clearBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.println(" - ");
            }
        }
    }

    private static void displayBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.println(board[r][c]);
                System.out.println(" ");
            }
        }
    }

    private static boolean isValidMove(int row, int col) {
        return board[row][col].equals("-");
    }

    private static boolean isWin(String player) {
        return isRowWin(player) || isColWin(player) || isDiagonalWin(player);
    }

    private static boolean isColWin(String player) {
        for (int c = 0; c < 3; c++) {
            if (board[0][c].equals(player) && board[1][c].equals(player) && board[2][c].equals(player)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isRowWin(String player) {
        for (int r = 0; r < 3; r++) {
            if (board[r][0].equals(player) && board[r][1].equals(player) && board[r][2].equals(player)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDiagonalWin(String player) {
        return ((board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) || (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player));
    }

    private static boolean isTie(String player1, String player2) {
        if (isWin(player1) || isWin(player2)) {
            return false;
        }
    }

}
