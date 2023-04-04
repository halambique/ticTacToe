package com.halambique.tictactoe.model;

public class Piece {

    static boolean player1 = true;

    static char piece = ' ';

    public static void xOrO() {
        if (player1) {
            piece = 'X';
        } else piece = 'O';
    }

    public static char getPiece() {
        return piece;
    }

    public static void setPiece(char piece) {
        Piece.piece = piece;
    }
}
