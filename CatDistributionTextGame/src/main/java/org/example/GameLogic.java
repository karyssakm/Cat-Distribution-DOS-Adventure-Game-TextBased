package org.example;

import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    static Player player;       //player object stored in a static object of type player with the name player


    //user input
    public static int readInt(String prompt, int userChoices) {
        int input;

        do {
            System.out.println(prompt);
            try {           //if user enters a non integer code won't break
                input = Integer.parseInt(scanner.next());       //convert a string into an int
            } catch (Exception e) {
                input = -1;   //set to -1 so the loop will continue and not end
                System.out.println("Please enter an integer!");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }


    //clearing out the console by printing 100 lines
    public static void clearConsole() {
        for (int i = 0; i < 100; i++)
            System.out.println();
    }


    //method to print a separator
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    public static void printSeparator2(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("*");
        System.out.println();
    }

    //header
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.print(title +"\n");
        printSeparator(30);
    }

    //stop game until user hits enter to continue
    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue:");
        scanner.next();
    }


    //start the game
    public static void startGame() {
        boolean nameSet = false;            //initalize nameSet to false to start
        String name;


        clearConsole();
        printSeparator2(40);
        printSeparator(40);
        System.out.println("THE CAT DISTRIBUTION SYSTEM");
        System.out.println("TEXT ADVENTURE GAME BY KARYSSA MILLER");
        printSeparator(40);
        printSeparator2(40);
        anythingToContinue();


        //player enters name & given option to change name
        do {
            clearConsole();
            printHeading("What is your name?");     //input name
            name = scanner.next();
            clearConsole();

            printHeading("Your name is " + name + ".\nIs this correct?");       //verify if correct or not
            System.out.println("(1) Yes!");
            System.out.println("(2) No, I want to change my name.");

            int input = readInt("->", 2);
            if(input == 1)                  // player says yes so set nameSet to true
                nameSet = true;

        } while(!nameSet);              //player says no so the loop starts over again

        player = new Player(name);      //create a new player object and pass the name as the argument


        //start main game loop
        //gameLoop();

    }




}
