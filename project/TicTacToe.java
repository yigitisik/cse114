// Mustafa Yigit Isik 113080465
package com.company;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("\tTIC TAC TOE GAME (n x n)\n");

        System.out.print("(n should be odd. Then, the system will proceed with a n x n grid)\nEnter the value of n: ");

        int n = keyboard.nextInt();
        if (n % 2 == 0 || n < 3) {
            System.out.println("You shouldn't enter an even or \"< 3\" number. Try again");
            System.exit(0);
        }
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = ' ';
            }
        }
        char player = 'X', done = ' ';
        int row, col;
        while(done == ' ') {
            System.out.println("\n\tBOARD\n");
            printBoard(board, n);
            System.out.println();

            row = getMove(keyboard, player, "row", n);
            col = getMove(keyboard, player, "column", n);
            while(board[row][col] != ' ') {
                System.out.println("invalid spot, enter again!");
                row = getMove(keyboard, player, "row", n);
                col = getMove(keyboard, player, "column", n);
            }
            board[row][col] = player;

            done=hasPlayerWon(board, n);
            if(done==' ') {
                if (player == 'X')
                    player = 'O';
                else
                    player = 'X';
            }
        }
        System.out.println("\tFINAL BOARD");
        printBoard(board, n);
        System.out.println();

        if(done=='T')
            System.out.println("it's a tie");
        else
            System.out.println("Congrats, the winner is "+done);
    }
    public static int getMove(Scanner in,char player, String what, int size) {
        int n;
        System.out.println("player " + player + "'s turn");
        System.out.println("Please enter the "+ what + " (1-" + size + "): ");
        n = in.nextInt();
        while (n < 1 || n > size) {
            System.out.println("should be between 1 and " + size);
            System.out.println("Please enter the "+ what + " (1-" + size + "): ");
            n = in.nextInt();
        }
        return n-1;
    }
    public static char hasPlayerWon(char board[][], int n) {
        boolean winner = true;
        //FOR ROWS
        for (int i = 0; i < n; i++) {
            winner = true;
            for (int j = 0; j < n-1; j++) {
                if (board[i][j] == ' ' || board[i][j] != board[i][j+1]) {
                    winner = false;
                    break;
                }
            }
            if (winner)
                return board[i][0];
        }
        //FOR COLUMNS
        for (int i = 0; i < n; i++) {
            winner = true;
            for (int j = 0; j < n-1; j++) {
                if (board[j][i] == ' ' || board[j][i] != board[j+1][i]) {
                    winner = false;
                    break;
                }
            }
            if (winner)
                return board[0][i];
        }
        winner = true;
        //FOR FIRST DIAGONAL
        for (int i = 0; i < n-1; i++) {
            if (board[i][i] == ' ' || board[i][i] != board[i+1][i+1]) {
                winner = false;
                break;
            }
        }
        if (winner) {
            return board[0][0];
        }
        winner = true;
        //FOR SECOND DIAGONAL
        for (int i = 0; i < n-1; i++) {
            if (board[i][n - i - 1] == ' ' || board[i][n - i - 1] != board[i+1][n - i - 1 - 1]) {
                winner = false;
            }
        }
        if (winner) {
            return board[0][n-1];
        }
        //FOR TIE
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == ' ')
                    return ' ';
            }
        }
        return 'T';
    }
    public static void printBoard(char[][] board, int n) {
        int row, col;
        for(row=0; row < n; row++) {
            for(col=0; col < n; col++) {
                System.out.print(" " + board[row][col] + " ");
                if(col != n-1)
                    System.out.print("|");
            }
            System.out.println();
        }
    }
}