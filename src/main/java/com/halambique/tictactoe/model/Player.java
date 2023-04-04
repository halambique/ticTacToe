package com.halambique.tictactoe.model;

import java.util.Scanner;

public class Player {

    public static void readPlayerInput(){
    }

    Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of PLAYER 1: ");
    String p1 = input.nextLine();

        System.out.print("Enter the name of PLAYER 2: ");
    String p2 = input.nextLine();
}
