<<<<<<< HEAD
package com.monopoly.Observers;

/**
 * Created by matthew on 2016/11/5.
 */
public class ResetOwnedLand implements Observer {

}
=======
package com.monopoly.Observers;

/**
 * Created by matthew on 2016/11/5.
 */
//the second item in each willList 
public class ResetOwnedLand implements Observer {
	public void execute(Player myPlayer){
		ArrayList<Land> ownedLands = myPlayer.getLands();
        
        // deprive myplayer's property
		for(Land myLand:ownedLands){            
            // terra nullius
            // update owner of a land
            myLand.setOwner((Object) null);

            // remove lands from myPlayer
            myPlayer.removeLand(myLand);
        }

        System.out.println(myPlayer.getName() + " no longer owns any land!");
	}
}
>>>>>>> 5ffa2f9d5c272ba8b0b0b19828d074cb9c773c95
