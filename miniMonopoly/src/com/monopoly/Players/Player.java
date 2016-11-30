package com.monopoly.Players;

import java.util.*;
import com.monopoly.Lands.Land;
import com.monopoly.Observers.Observer;
import com.monopoly.util.Dice;
import com.monopoly.util.Map;

import static com.monopoly.Constants.Constant.*;
import com.monopoly.Lands.EstateTypeLand;

/**
 * Created by matthew on 2016/11/5.
 */
public class Player {
    private boolean isAlive;
    private double balance;
    private int position;
    private String name;
    private boolean inJail;
    private ArrayList<EstateTypeLand> ownedLands;
    private ArrayList<Observer> willList;

    public Player (String playerName) {
        this.name = playerName;
        this.isAlive = true;
        this.balance = INITIAL_BALANCE;
        this.position = 0;
        this.inJail = false;
        this.ownedLands = new ArrayList<>();
        this.willList = new ArrayList<>();       
    }

    public boolean alive() {
        return this.isAlive;        
    }
    
    // set isAlive as false
    public void goDie(){        
        this.isAlive = false;               
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
    
    public void setInJail() {
        this.inJail = true;
    }
    
    public boolean getInJail() {
        return this.inJail;
    }

    public ArrayList<EstateTypeLand> getLands(){
        return this.ownedLands;
    }
    
    // remove a estate land from this user's property
    public void removeLand( ) {
        System.out.println("removing this land");
        this.ownedLands.clear();
        System.out.println("after removed");
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
        System.out.println("current position is " + this.position);
        Land land = Map.getLandbyIndex(position);
        

        // land triggered purchase or opportunity events
        land.trigger(this);
        
        System.out.println("Player " + this.name + "has finished.");
        
        // check player if already dead
        if (getTotalAsset() < 0) {
            System.out.println("Player " + this.name + "is dead.");
            System.out.println("final balance: " + getTotalAsset());
            exeWill();
        }        
    }
    
    public void updateBalance(double change) {
        this.balance = this.balance + change;
    }

    //attach items into this player's willList
    public void attach(Observer obs) {
        this.willList.add(obs);
    }
    
    //delete items from athis player's willList
    public void detach(Observer obs) {
        this.willList.remove(obs);
    }

    //execute items in will list at the time this player fails
    public void exeWill() {
        for(Observer obs:this.willList){
            //execute a specific item in will list via a common method, execute()
            obs.execute(this);
        }
    }

    public void addLand(EstateTypeLand esLand) {
        this.ownedLands.add(esLand);
    }

}
