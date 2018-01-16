package com.company;

import java.util.*;

/**
 * Created by je565 on 1/16/18.
 */
public class TowersofHanoi {

    public static String askUser;
    public static int numDisks;

    public static void startGame()
    {
        System.out.println("Welcome to the Towers of Hanoi. Please input the number of disks you would like to solve for.");

        Scanner input = new Scanner(System.in);
        askUser = input.next();
        askUser.trim();
        numDisks = Integer.parseInt(askUser);
    }

    public static void solve()
    {
        System.out.println("Instructions: ");

        for(int j = 0; j < numDisks; j++)
        {
            System.out.println((j + 1) + ": ");
            
        }
    }
}
