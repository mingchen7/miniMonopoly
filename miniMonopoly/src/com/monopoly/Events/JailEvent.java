package com.monopoly.Events;

import com.monopoly.Lands.Land;
import com.monopoly.Players.Player;

/**
 * Created by matthew on 2016/11/5.
 */
public class JailEvent extends OpportunityEvent {
    public void doEvent(Land myLand, Player myPlayer){
        //need to add putInJail() method and isInJail variable in Player class.
        System.out.println("you are in jail!!!");
        myPlayer.setInJail(); 
    }
}
