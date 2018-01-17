package com.company;

public class Main {

    public static void main(String[] args) {

        TowersofHanoi newGame = new TowersofHanoi();
        newGame.startGame();

        if(newGame.numDisks < 1)
        {
            System.out.println("Invalid input. Goodbye.");
        }
        else
        {
            System.out.println("Instructions: ");
            newGame.solve(newGame.numDisks, "1st rod", "2nd rod", "3rd rod");
        }
    }
}
