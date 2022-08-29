package com.skorokhoda.droidbattle.droid;

public class BaseDroid {
    public int health;
    public int damage;
    public String name;

    public BaseDroid(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " health = " + health;
    }
}
