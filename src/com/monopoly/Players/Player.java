package com.monopoly.Players;

import java.util.*;
import com.monopoly.Lands.Land;
import com.monopoly.Observers.Observer;
import com.monopoly.util.Dice;

/**
 * Created by matthew on 2016/11/5.
 */
public class Player {
    boolean isAlive;
    double balance;
    int position;
    String name;
    ArrayList<Land> ownedLands;
    ArrayList<Observer> willList;

    public Player (String playerName) {
        this.name = playerName;
        this.isAlive = true;
        this.balance = 0.0;
        this.position = 0;
        this.ownedLands = new ArrayList<>();
        this.willList = new ArrayList<>();
    }

    public boolean ifAlive() {
        return this.isAlive;
    }

    public double getTotalAsset() {
        return balance;
    }

    public int rollDice(Dice dice) {
        return dice.roll();
    }

    public void attach(Observer obs) {

    }

    public void detach(Observer obs) {

    }

    public void notifyObs() {

    }




}
