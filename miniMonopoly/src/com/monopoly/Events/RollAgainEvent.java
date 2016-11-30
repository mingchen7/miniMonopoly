package com.monopoly.Events;

import com.monopoly.Players.Player;
import com.monopoly.Lands.Land;

/**
 * Created by matthew on 2016/11/5.
 */
public class RollAgainEvent extends OpportunityEvent {
    public void doEvent(Land myLand, Player myPlayer){
        System.out.println("Roll again");
        myPlayer.play();
        
    }
}
