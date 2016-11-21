package com.monopoly.Events;

/**
 * Created by matthew on 2016/11/5.
 */
public class FineEvent extends OpportunityEvent {
    public static void doEvent(Land myLand, Player myPlayer){
        private double fineAmount = 50;
        myPlayer.updateBalance(fineAmount);
    }
}
