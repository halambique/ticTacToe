package com.halambique.tictactoe.model;

import java.util.ArrayList;
import java.util.Scanner;

import static com.halambique.tictactoe.model.Piece.piece;

public class Board {

    public static char[][] board(){
        char[][] board = new char[3][3];
        for (int x = 0 ; x < 3 ; x++){
            for (int y = 0 ; y < 3 ; y++){
                board[x][y] = '-';
            }
        }
        return board;
    }

    public static void drawBoard(char[][] board) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(board[x][y]);
            }
            System.out.println();
            }
        }



    public static void placePiece(Player player, char[][] board) {
        Scanner input = new Scanner(System.in);
        int row = -1;
        int column = -1;

        while (true) {
            System.out.print(player.getName() + " Enter a column (1-3): ");
            if (input.hasNextInt()) {
                column = input.nextInt();
            } else {
                System.out.println("Invalid input, please enter a number.");
                input.next();
                continue;
            }

            System.out.print(player.getName() + " Enter a row (1-3): ");
            if (input.hasNextInt()) {
                row = input.nextInt();
            } else {
                System.out.println("Invalid input, please enter a number.");
                input.next();
                continue;
            }

            if (row < 1 || row > 3 || column < 1 || column > 3) {
                System.out.println("Invalid input, please enter a number between 1 and 3.");
            } else if (board[row - 1][column - 1] != '-') {
                System.out.println("There is already a piece there!");
            } else {
                break;
            }
        }
        board[row - 1][column - 1] = player.getPiece();
    }



}
