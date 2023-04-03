package com.halambique.tictactoe.model;

public class Board {

    public static char[][] board(){
        char[][] board = new char[3][3];
        for (int x = 0 ; x < 3 ; x++){
            for (int y = 0 ; y < 3 ; y++){
                board[x][y] = '#';
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
    }