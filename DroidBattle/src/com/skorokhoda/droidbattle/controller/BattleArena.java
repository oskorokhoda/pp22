package com.skorokhoda.droidbattle.controller;

import com.skorokhoda.droidbattle.droid.BaseDroid;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BattleArena {
    private BaseDroid firstDroid;
    private BaseDroid secondDroid;
    private BaseDroid attacker;
    private BaseDroid defender;

    public BattleArena(BaseDroid firstDroid, BaseDroid secondDroid) {
        this.firstDroid = firstDroid;
        this.secondDroid = secondDroid;
    }

    public BaseDroid startFight() throws InterruptedException {
        int round = 1;
        do {
            initFighters();

            System.out.println("-------------------------------------");
            System.out.println("Round " + round);

            int actualDamage = defender.getHit(attacker.getDamage());
            System.out.println(defender.getName() + " get hit with " + actualDamage + " damage");


            System.out.println("Defender " +defender);
            System.out.println("Attacker " + attacker);
            round++;

            TimeUnit.SECONDS.sleep(1);
        } while(defender.isAlive());

        return attacker;
    }

    private void initFighters() {
        Random random = new Random();
        if (random.nextBoolean()) {
            attacker = firstDroid;
            defender = secondDroid;
        } else {
            attacker = secondDroid;
            defender = firstDroid;
        }
    }
}
