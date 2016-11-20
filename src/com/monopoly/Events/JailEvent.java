package com.monopoly.Events;

/**
 * Created by matthew on 2016/11/5.
 */
public class JailEvent extends OpportunityEvent {
    public static void doEvent(Land myLand, Player myPlayer){
        myPlayer.putInJail(); //need to add putInJail() method and isInJail variable in Player class.
    }
}
