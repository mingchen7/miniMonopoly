package com.monopoly.Events;

import com.monopoly.Lands.EstateTypeLand;
import com.monopoly.Lands.Land;
import com.monopoly.Players.Player;
import java.util.Scanner; 


/**
 * Created by matthew on 2016/11/5.
 */
public class BuyEvent extends Event {
    public void doEvent(Land myLand, Player myPlayer){
    	//check balance
    	EstateTypeLand esLand = (EstateTypeLand) myLand;
    	if(esLand.purchasePrice > myPlayer.getTotalAsset()){ 
    		System.out.print("You don't have enough balance to purchase the land.");
    		return;
    	}
    	//choose purchase or not
    	Scanner scan = new Scanner(System.in); 
        System.out.println("Do you want to purchase this land? Please enter Yes or No.");
        String toPurchase = scan.next();
        scan.close();
        //no
        if(toPurchase == "No"){
            System.out.print("You chose not to purchase, see you next time.");
            return;
        }
        //yes
        else if(toPurchase == "Yes"){
        	myPlayer.addLand(esLand); //need to add addLand method in players
            myPlayer.updateBalance(-esLand.purchasePrice); //need to add updateBalance method in players
            esLand.owner = myPlayer;  //need to add setOwner method in players
            System.out.print("You successfully purchased the land.");
            return;
        }
     }

 }

