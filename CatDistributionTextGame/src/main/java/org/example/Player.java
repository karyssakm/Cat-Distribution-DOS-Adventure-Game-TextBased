package org.example;


//player inherits everything from character superclass
public class Player extends Character {

    //int to store # of upgrades/skills
    public int numAttackUpgrades, numDefUpgrades;



    //array to store skill names (happens before every story act)
    public String[] attackUpgrades = {"Tuna", "Persuasion", "Catnip", "Cat Whisperer"};
    public String[] defUpgrades = {"Sweatshirt", "Oven Gloves", "Toy Mouse", "Laser Pointer"};


    //player specific constructor
    public Player (String name) {
        super(name, 100, 0);    //name based on user input, starting HP = 100, starting XP = 0;
        this.numAttackUpgrades = 0;
        this.numDefUpgrades = 0;           //setting to 0 to start, but will store attack and def skills further in game, initialize to 0
        chooseTrait();                      //immediately choose a trait when creating a character
    }


    //player specific: methods changed from what they are assigned in character (superclass)
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }


    //immediately choosing a trait when creating a character; will not return anything

    public void chooseTrait() {
        GameLogic.clearConsole();
        GameLogic.printHeading("Choose a trait:");

        System.out.println("(1) Attack");
        System.out.println("(2) Defense");
        int input = GameLogic.readInt("-> ", 2);
        GameLogic.clearConsole();

        if (input == 1) {
            System.out.println("(1) " + attackUpgrades[numAttackUpgrades]);

            int input2 = GameLogic.readInt("->", 1);
            GameLogic.clearConsole();

            if (input2 == 1 ) {
                GameLogic.printHeading("You chose " + attackUpgrades[numAttackUpgrades] + "!");
                numAttackUpgrades++;
            }

        } else {
            System.out.println("(1) " + defUpgrades[numDefUpgrades]);

            int input2 = GameLogic.readInt("->", 1);
            GameLogic.clearConsole();

            if (input2 == 1) {
                GameLogic.printHeading("You chose " + defUpgrades[numDefUpgrades] + "!");
                numDefUpgrades++;
            }

        }
        GameLogic.anythingToContinue();











        //player chooses
//        int input = GameLogic.readInt("-> ", 2);
//        GameLogic.clearConsole();

        //attack or def upgrades
//        if(input == 1) {
//            GameLogic.printHeading("You chose " + attackUpgrades[numAttackUpgrades] + "!");
//            numAttackUpgrades++;
//        } else {
//            GameLogic.printHeading("You chose " + defUpgrades[numDefUpgrades] + "!");
//            numDefUpgrades++;
//        }
//        GameLogic.anythingToContinue();
    }




}
