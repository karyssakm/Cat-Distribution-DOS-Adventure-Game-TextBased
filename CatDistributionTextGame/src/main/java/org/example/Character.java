package org.example;

public abstract class Character {

    //creating an abstract class so you are only able to create a player or an enemy- this will be overwritten by the inheriting children (not able to directly create a character)


    //attributes all characters will have
    public String name;
    public int maxHp;
    public int hp;
    public int xp;


    //constructor
    public Character(String name, int maxHp, int xp) {
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
    }


    //methods characters have
    public abstract int attack();
    public abstract int defend();

}
