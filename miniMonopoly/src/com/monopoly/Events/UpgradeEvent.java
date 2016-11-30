package com.monopoly.Events;

import java.util.Scanner;

import com.monopoly.Lands.EstateTypeLand;
import com.monopoly.Lands.Land;
import com.monopoly.Players.Player;

/**
 * Created by matthew on 2016/11/5.
 */
public class UpgradeEvent extends Event{
    public void doEvent(Land myLand, Player myPlayer){
    //check balance
    System.out.println("you are in upgrade process");
    EstateTypeLand esLand = (EstateTypeLand) myLand;
    if(esLand.upgradePrice > myPlayer.getTotalAsset()){ 
        System.out.print("You don't have enough balance to upgrade the land.");
        return;
    }
    
    //choose purchase or not
    Scanner scan = new Scanner(System.in); 
    System.out.println("Do you want to upgrade this land? Please enter Yes or No.");
    String toPurchase = scan.next();
    scan.close();
    
    //no
    if(toPurchase == "No"){
        System.out.print("You chose not to upgrade, see you next time.");
        return;
    }
    //yes
    else if(toPurchase == "Yes"){
        myPlayer.updateBalance(-esLand.upgradePrice); //need to add updateBalance method in players
        esLand.Level = esLand.Level + 1;
        esLand.rentFee = esLand.rentFee * 1.5;
        System.out.print("You successfully upgrade the land.");
        return;
    }
 }
}
