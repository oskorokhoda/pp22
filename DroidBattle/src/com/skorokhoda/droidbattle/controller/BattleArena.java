package com.skorokhoda.droidbattle.controller;

import com.skorokhoda.droidbattle.droid.BaseDroid;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BattleArena {
    private final BaseDroid firstDroid;
    private final BaseDroid secondDroid;
    private BaseDroid attacker;
    private BaseDroid defender;
    private int currentRound = 0;

    public BattleArena(BaseDroid firstDroid, BaseDroid secondDroid) {
        this.firstDroid = firstDroid;
        this.secondDroid = secondDroid;
    }

    public BaseDroid startFight() throws InterruptedException {
        do {
            prepareRound();
            int actualDamage = doFight();
            printRoundInfo(actualDamage);

            TimeUnit.SECONDS.sleep(1);
        } while (defender.isAlive());

        return attacker;
    }

    private void prepareRound() {
        initFighters();
        currentRound++;
        System.out.println("-------------------------------------");
        System.out.println("Round " + currentRound);
    }

    private int doFight() {
        return defender.getHit(attacker.getDamage());
    }

    private void printRoundInfo(int actualDamage) {
        System.out.println(defender.getName() + " get hit with " + actualDamage + " damage");
        System.out.println("Defender " + defender);
        System.out.println("Attacker " + attacker);
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
