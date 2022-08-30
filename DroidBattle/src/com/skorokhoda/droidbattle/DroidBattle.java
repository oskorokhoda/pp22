package com.skorokhoda.droidbattle;

import com.skorokhoda.droidbattle.controller.BattleArena;
import com.skorokhoda.droidbattle.droid.BaseDroid;

public class DroidBattle {
    public void battle() throws InterruptedException {
        BaseDroid droid1 = new BaseDroid(30, 10, "c3p0");
        BaseDroid droid2 = new BaseDroid(30, 10, "r2d2");

        BattleArena arena = new BattleArena(droid1, droid2);
        BaseDroid winner = arena.startFight();

        System.out.println("--------------");
        System.out.println("The winner is " + winner.getName());
    }
}
