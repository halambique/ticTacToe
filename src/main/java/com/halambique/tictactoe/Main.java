package com.halambique.tictactoe;
import java.util.Scanner;

import static com.halambique.tictactoe.model.Board.board;
import static com.halambique.tictactoe.model.Board.drawBoard;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of PLAYER 1: ");
        String p1 = input.nextLine();

        System.out.print("Enter the name of PLAYER 2: ");
        String p2 = input.nextLine();


        char[][] board = board();
        drawBoard(board);
    }
}