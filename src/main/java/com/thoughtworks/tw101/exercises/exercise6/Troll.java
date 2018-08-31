package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    int hp;
    String name;

    public Troll () {
        this.hp = 40;
        this.name = "Troll";
    }

    public void takeDamage (int amount) {
        hp -= amount / 2;
    }

    public void reportStatus () {
        System.out.println(name + " " + hp);
    }
}
