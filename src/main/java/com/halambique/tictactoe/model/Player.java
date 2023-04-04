package com.halambique.tictactoe.model;

import java.util.Scanner;


import java.util.Scanner;

public class Player {
    private String name;
    private char piece;
    static Scanner input = new Scanner(System.in);

    public Player() {
        System.out.print("Enter the name of PLAYER 1: ");
        String p1 = input.nextLine();
        name = p1;
        piece = 'X';

        System.out.print("Enter the name of player 2: ");
        String p2 = input.nextLine();
        name = p2;
        piece = 'O';

        if (name.equals(p1)) {
            piece = 'X';
        } else {
            piece = 'O';
        }
    }


    public String getName() {
        return name;
    }

    public char getPiece() {
        return piece;
    }
}
