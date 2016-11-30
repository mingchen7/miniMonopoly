
package com.monopoly.Observers;

import com.monopoly.Players.Player;
/**
 * Created by matthew on 2016/11/5.
 */

// the first item in will list
public class DeathNotification implements Observer {
    public void execute(Player myPlayer){
        System.out.println(myPlayer.getName() + " fails!");		
    }
}
