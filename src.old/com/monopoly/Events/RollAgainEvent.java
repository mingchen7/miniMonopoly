package com.monopoly.Events;

/**
 * Created by matthew on 2016/11/5.
 */
public class RollAgainEvent extends OpportunityEvent {
    public static void doEvent(Land myLand, Player myPlayer){
        myPlayer.play();
    }
}
