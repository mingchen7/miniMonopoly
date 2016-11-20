package com.monopoly.Events;

/**
 * Created by matthew on 2016/11/5.
 */
public class PayRentEvent extends PurchaseEvent {
    public static void doEvent(Land myLand, Player myPlayer){
        myPlayer.updateBalance(-myLand.getRent()); //add getRent method in myLand;
        //negative balance triggers death, how?
    }
}
