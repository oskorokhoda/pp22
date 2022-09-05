package com.skorokhoda.droidbattle.droid;

import java.util.Random;

public class BaseDroid {
    private final String name;
    private final int damage;
    private int health;

    public BaseDroid(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHit(int damage) {
        Random random = new Random();

        int actualDamage = random.nextInt(damage);
        this.health -= actualDamage;

        if (health < 0) {
            health = 0;
        }

        return actualDamage;
    }

    @Override
    public String toString() {
        return name + " health = " + health;
    }
}
