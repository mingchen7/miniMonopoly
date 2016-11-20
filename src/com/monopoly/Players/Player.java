package com.monopoly.Players;

import java.util.*;
import com.monopoly.Lands.Land;
import com.monopoly.Observers.Observer;
import com.monopoly.util.Dice;
import com.monopoly.util.Map;

import static com.monopoly.Constants.Constant.*;

/**
 * Created by matthew on 2016/11/5.
 */
public class Player {
    private boolean isAlive;
    private double balance;
    private int position;
    private String name;
    private ArrayList<Land> ownedLands;
    private ArrayList<Observer> willList;

    public Player (String playerName) {
        this.name = playerName;
        this.isAlive = true;
        this.balance = 0.0;
        this.position = 0;
        this.ownedLands = new ArrayList<>();
        this.willList = new ArrayList<>();
    }

    public boolean alive() {
        return this.isAlive;
    }

    public int rollDice() {
        Dice dice = Dice.getInstance();
        return dice.roll();
    }

    public double getTotalAsset() {
        return balance;
    }

    public String getName() {
        return this.name;
    }

    public void move(int steps) {
        int numCells = NUM_CELLS_ON_MAP_STANDARD;
        if (Map.getPackageCode() == STANDARD_PACKAGE_CODE) {
            numCells = NUM_CELLS_ON_MAP_STANDARD;
        }
        else if (Map.getPackageCode() == EXTENDED_PACAKGE_CODE) {
            numCells = NUM_CELLS_ON_MAP_EXTENDED;
        }

        this.position = (this.position + steps) % numCells;
    }

    // main logic for play to move
    public void play() {
        System.out.println("Player " + this.name + " started to play...");
        System.out.println("Current balance: " + getTotalAsset());

        // roll a dice to move
        int steps = rollDice();
        System.out.println("Player diced " + steps);

        // move
        move(steps);
        Land land = Map.getLandbyIndex(position);

        // land triggered purchase or opportunity events
        land.trigger();

        System.out.println("Player " + this.name + "has finished.");
    }

    public void attach(Observer obs) {

    }

    public void detach(Observer obs) {

    }

    public void notifyObs() {

    }

}
