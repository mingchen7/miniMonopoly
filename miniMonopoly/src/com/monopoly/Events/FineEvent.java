package com.monopoly.Events;

import com.monopoly.Players.Player;
import com.monopoly.Lands.Land;

/**
 * Created by matthew on 2016/11/5.
 */
public class FineEvent extends OpportunityEvent {
    public void doEvent(Land myLand, Player myPlayer){
        double fineAmount = 50;
        System.out.println("You got fine 50");
        myPlayer.updateBalance(-1 * fineAmount);
    }
}
