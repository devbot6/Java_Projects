import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner(System.in);

    static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    static int turn = 1;

    public static void main(String[] args) {
        printBoard();
        while (true) {
            if (turn % 2 == 1) {
                System.out.print("Player 1's turn (X). Enter row and column: ");
                int row = sc.nextInt() - 1;
                int col = sc.nextInt() - 1;
                if (board[row][col] == ' ') {
                    board[row][col] = 'X';
                    turn++;
                    printBoard();
                    if (checkWin('X')) {
                        System.out.println("Player 1 wins!");
                        break;
                    }
                } else {
                    System.out.println("This cell is already occupied. Try again.");
                }
            } else {
                System.out.print("Player 2's turn (O). Enter row and column: ");
                int row = sc.nextInt() - 1;
                int col = sc.nextInt() - 1;
                if (board[row][col] == ' ') {
                    board[row][col] = 'O';
                    turn++;
                    printBoard();
                    if (checkWin('O')) {
                        System.out.println("Player 2 wins!");
                        break;
                    }
                } else {
                    System.out.println("This cell is already occupied. Try again.");
                }
            }
        }
    }

    static void printBoard() {
        System.out.println("  1 2 3");
        System.out.println(" +-+-+-+");
        System.out.println("1|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
        System.out.println(" +-+-+-+");
        System.out.println("2|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
        System.out.println(" +-+-+-+");
        System.out.println("3|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
        System.out.println(" +-+-+-+");
    }

    static boolean checkWin(char c) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == c && board[i][1] == c && board[i][2] == c) {
                return true;
            }
            if (board[0][i] == c && board[1][i] == c && board[2][i] == c) {
                return true;
            }
        }
        if (board[0][0] == c && board[1][1] == c && board[2][
