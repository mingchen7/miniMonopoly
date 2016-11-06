package com.monopoly.util;

import java.util.Random;
/**
 * Created by matthew on 2016/11/5.
 */
public class Dice {
    int maxFaceValue;
    Random randomGenerator;

    public Dice (int max) {
        this.maxFaceValue = max;
        randomGenerator = new Random();
    }

    public int roll() {
        return randomGenerator.nextInt(maxFaceValue) + 1;
    }
}
