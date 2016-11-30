
package com.monopoly.Observers;

import com.monopoly.Players.Player;
/**
 * Created by matthew on 2016/11/5.
 */
// the last item to execute in a willList
public class DelFromPlayerList implements Observer {
    public void execute(Player myPlayer){
        myPlayer.goDie();
    }
}
