package com.halambique.tictactoe;
import com.halambique.tictactoe.model.Board;
import com.halambique.tictactoe.model.Player;

public class Main {
    public static void main(String[] args) {
        // create a new board
        char[][] board = Board.board();

        // draw the board
        Board.drawBoard(board);

        // place a piece on the board
        Player player1 = new Player();
        Board.placePiece(player1, board);

        // draw the board again to show the updated state
        Board.drawBoard(board);
    }



}