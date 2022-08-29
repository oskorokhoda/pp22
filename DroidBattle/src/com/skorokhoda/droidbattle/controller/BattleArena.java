package com.skorokhoda.droidbattle.controller;

import com.skorokhoda.droidbattle.droid.BaseDroid;

public class BattleArena {
    private BaseDroid firstDroid;
    private BaseDroid secondDroid;
    private BaseDroid attacker;
    private BaseDroid defender;

    public BattleArena(BaseDroid firstDroid, BaseDroid secondDroid) {
        this.firstDroid = firstDroid;
        this.secondDroid = secondDroid;
    }

    public void startFight() {
        attacker = firstDroid;
        defender = secondDroid;
        do {
            BaseDroid temp = attacker;
            attacker = defender;
            defender = temp;

            defender.health -= attacker.damage;
            System.out.println(defender.name + " get hit with " + attacker.damage + " damage");
            System.out.println(defender);

        } while(defender.health > 0);

        System.out.println(attacker + " is the winner");
    }
}
