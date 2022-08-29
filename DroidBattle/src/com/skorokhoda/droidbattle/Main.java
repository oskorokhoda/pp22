package com.skorokhoda.droidbattle;

import com.skorokhoda.droidbattle.controller.BattleArena;
import com.skorokhoda.droidbattle.droid.BaseDroid;

public class Main {
    public static void main(String[] args) {
        BaseDroid droid1 = new BaseDroid(100, 10, "c3p0");
        BaseDroid droid2 = new BaseDroid(100, 10, "r2d2");

        BattleArena arena = new BattleArena(droid1, droid2);
        arena.startFight();
    }
}
