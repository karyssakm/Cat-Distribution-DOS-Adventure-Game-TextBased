package org.example;

import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    static Player player;       //player object stored in a static object of type player with the name player
    public static boolean isRunning;

    //store random encounters
    public static String[] encounters = {"Battle", "Battle", "Battle", "Rest", "Rest"};

    //enemy names
    public static String[] enemies = {"enemy1", "enemy2", "enemy3", "enemey4", "enemy5"};


    public static int place = 0, act = 1;       //story elements & initialize
    public static String[] places = {"Lake", "Mountain Trail Head", "Abandoned Cabin", "Peak of the Mountain"};


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

        Story.printIntro();

        player = new Player(name);      //create a new player object and pass the name as the argument

        Story.printFirstActIntro();

        isRunning = true;               //set to true so game  will play

        //start main game loop
        gameLoop();
    }



    //main game loop - will run as long as isRunning = true
    public static void gameLoop() {
        while(isRunning) {
            printMenu();
            int input = readInt("-> ", 3);
            if(input == 1)
                continueJourney();
            else if(input == 2)
                characterInfo();
            else
                isRunning = false;
        }
    }




    //printing the main menu
    public static void printMenu() {
        clearConsole();
        printHeading(places[place]);
        System.out.println("Choose an option:");
        printSeparator(20);
        System.out.println("(1) Continue on your journey");
        System.out.println("(2) Character Info");
        System.out.println("(3) Exit Game");
    }



    //method to continue the journey
    public static void continueJourney() {
        checkAct();
        if(act != 4)
            randomEncounter();
    }


    //changes game values based on player xp
    public static void checkAct() {
        if(player.xp >= 10 && act == 1) {
            act = 2;
            place = 1;
            Story.printFirstActOutro();
            player.chooseTrait();
            Story.printSecondActIntro();

        } else if (player.xp >= 50 && act == 2) {
            act = 3;
            place = 2;
            Story.printSecondActOutro();
            player.chooseTrait();
            Story.printThirdActIntro();

        } else if (player.xp >= 100 && act == 3) {
            act = 4;
            place = 3;
            Story.printThirdActOutro();
            player.chooseTrait();
            Story.printFourthActIntro();
        }
    }


    //method to show character info
    public static void characterInfo() {
        clearConsole();
        printHeading("CHARACTER INFO");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        printSeparator(20);
        System.out.println("XP: " + player.xp);
        printSeparator(20);

        //printing out traits
        if(player.numAttackUpgrades > 0) {
            System.out.println("Offensive trait(s): " + player.attackUpgrades[player.numAttackUpgrades -1]);
            printSeparator(20);
        }
        if(player.numDefUpgrades > 0) {
            System.out.println("Defensive trait(s): " + player.defUpgrades[player.numDefUpgrades - 1]);
        }

        anythingToContinue();
    }






}
