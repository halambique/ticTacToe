package com.halambique.tictactoe.model;

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

    public checkBoard(board){

    }
    
    public <row, column> void placePiece(int row, int column){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a column. 1, 2 or 3: ");
        int x = input.nextInt()-1;
        System.out.print("Enter a row. 1, 2 or 3: ");
        int y = input.nextInt()-1;

        while (true) {
            if (row < 1 || column < 1 || row > 3 || column > 3) {
                System.out.println("You can't place a piece outside the board!");
            } else if (board()[row][column] != '-') {
                System.out.println("There is already a piece there!");
            } else{
                break;
            }
        }
        board()[row][column] = Piece.getPiece();
    }

}
