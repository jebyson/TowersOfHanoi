package com.company;

import java.util.*;

public class TowersofHanoi {

    public int numDisks = 1;
    public int minMoves = 1;
    public int numOfMove = 1;

    public  void startGame()
    {
        System.out.println("Welcome to the Towers of Hanoi. Please input the number of disks you would like to solve for.");

        Scanner input = new Scanner(System.in);
        numDisks = input.nextInt();

        minMoves = (int)(Math.pow(2, numDisks)) - 1;
    }

    public void solve(int numOfDisks, String rod1, String rod2, String rod3)
    {
        if (numOfDisks == 1)
        {
            System.out.println(numOfMove + " - Move disk from the " + rod1 + " to the " + rod3 + ".");
            numOfMove++;
        }
        else
        {
            solve(numOfDisks - 1, rod1, rod3, rod2);
            System.out.println(numOfMove + " - Move disk from the " + rod1 + " to the " + rod3 + ".");
            numOfMove++;
            solve(numOfDisks - 1, rod2, rod1, rod3);
        }
    }
}
