package org.example;


//only stores methods to print out story
public class Story {

    public static void printIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("STORY");
        GameLogic.printSeparator(30);
        System.out.println("You are going on an early morning walk, when you hear rustling in the bushes. You look to your right, and you see two glowy eyes staring at you.");
        System.out.println("As you move closer, you hear a small purr followed by a growl. Through the leaves, you see...");
        System.out.println("\na kitty!");

        System.out.println("                                    .-. ");
        System.out.println("                                    | |");
        System.out.println("                                    | |");
        System.out.println("                                    | | ");
        System.out.println("                                    | | ");
        System.out.println("                /\\---/\\   _,---._ | | ");
        System.out.println("               /^   ^   \\,'       `. ;");
        System.out.println("              ( O   O    )           ;");
        System.out.println("               `.=o=__,'             \\ ");
        System.out.println("                 /         ,_,--.__   \\ ");
        System.out.println("                /  _ )   ,'    `-. `-. \\ ");
        System.out.println("               / ,' /  ,'         |  || \\ ");
        System.out.println("              / /  / ,'           (,_)(,_) ");
        System.out.println("             (,;  (,,)  ");

        System.out.println("There is no sign of its mother around, and now you are on a mission to capture this cat!");
        GameLogic.anythingToContinue();
    }

    public static void printFirstActIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT I - INTRO");
        GameLogic.printSeparator(30);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        GameLogic.anythingToContinue();
    }

    public static void printFirstActOutro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT I - OUTRO");
        GameLogic.printSeparator(30);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        GameLogic.anythingToContinue();
    }

    public static void printSecondActIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT II - INTRO");
        GameLogic.printSeparator(30);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        GameLogic.anythingToContinue();
    }

    public static void printSecondActOutro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT II - OUTRO");
        GameLogic.printSeparator(30);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        GameLogic.anythingToContinue();
    }

    public static void printThirdActIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT III - INTRO");
        GameLogic.printSeparator(30);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        GameLogic.anythingToContinue();
    }

    public static void printThirdActOutro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT III - OUTRO");
        GameLogic.printSeparator(30);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        GameLogic.anythingToContinue();
    }

    public static void printFourthActIntro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT IV - INTRO");
        GameLogic.printSeparator(30);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        GameLogic.anythingToContinue();
    }

    public static void printFourthActOutro() {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("ACT IV - OUTRO");
        GameLogic.printSeparator(30);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        GameLogic.anythingToContinue();
    }

    public static void printEnd(Player player) {
        GameLogic.clearConsole();
        GameLogic.printSeparator(30);
        System.out.println("Congratulations, " + player.name + "! You have been selected by the cat distribution system, and are the proud owner of a new cat!");
        GameLogic.printSeparator(30);
        System.out.println("This game was developed by Karyssa Miller");
        System.out.println("I hope you have enjoyed playing it!");
        System.out.println("You can find the project file under my GitHub: https://github.com/karyssakm or go directly to the repository here: https://github.com/karyssakm/Cat-Distribution-DOS-Adventure-Game-TextBased");
        GameLogic.anythingToContinue();
    }

}
