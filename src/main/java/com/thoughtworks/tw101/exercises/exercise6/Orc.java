package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    int hp;
    String name;

    public Orc () {
        this.hp = 20;
        this.name = "Orc";
    }

    public void takeDamage (int amount) {
        hp -= amount;
    }

    public void reportStatus () {
        System.out.println(name + " " + hp);
    }
}
