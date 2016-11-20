package com.monopoly.util;

import static com.monopoly.Constants.Constant.*;
import java.util.Random;
/**
 * Created by matthew on 2016/11/5.
 */
public class Dice {
    int maxFaceValue;
    private Random randomGenerator;
    private static Dice instance;

    public Dice (int max) {
        this.maxFaceValue = max;
        randomGenerator = new Random();
    }

    public static Dice getInstance() {
        if (instance == null) {
            instance = new Dice(DICE_FACE_VALUE);
        }
        return instance;
    }

    public int roll() {
        return randomGenerator.nextInt(maxFaceValue) + 1;
    }
}
