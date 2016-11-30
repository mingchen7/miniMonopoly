<<<<<<< HEAD
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
		if(myPlayer.getTotalAsset() <= esLand.rentFee){
			esLand.owner.updateBalance(myPlayer.getTotalAsset());
			myPlayer.dead();
		}
		else{
			myPlayer.updateBalance(-myPlayer.getTotalAsset());
			esLand.owner.updateBalance(myPlayer.getTotalAsset());
		}
	}
}
=======
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
>>>>>>> 5ffa2f9d5c272ba8b0b0b19828d074cb9c773c95
