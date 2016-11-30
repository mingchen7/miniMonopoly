
package com.monopoly.Events;

import com.monopoly.Lands.EstateTypeLand;
import com.monopoly.Lands.Land;
import com.monopoly.Players.Player;

/**
 * Created by matthew on 2016/11/5.
 */
public class PayRentEvent extends Event {
    @Override
    public void doEvent(Land myLand, Player myPlayer) {
            // TODO Auto-generated method stub
            EstateTypeLand esLand = (EstateTypeLand) myLand;
            System.out.println("you are paying rent");
            if(myPlayer.getTotalAsset() <= esLand.rentFee){
                esLand.owner.updateBalance(myPlayer.getTotalAsset());
                myPlayer.exeWill();
            }
            else{
                myPlayer.updateBalance(-1 * myPlayer.getTotalAsset());
                esLand.owner.updateBalance(myPlayer.getTotalAsset());
            }
    }
}

