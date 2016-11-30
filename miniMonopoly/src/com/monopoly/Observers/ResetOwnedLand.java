package com.monopoly.Observers;

import com.monopoly.Lands.Land;
import com.monopoly.Lands.EstateTypeLand;
import com.monopoly.Players.Player;

import java.util.*;

/**
 * Created by matthew on 2016/11/5.
 */
//the second item in each willList 
public class ResetOwnedLand implements Observer {
    public void execute(Player myPlayer){
        ArrayList<EstateTypeLand> ownedLands = myPlayer.getLands();

        // deprive myplayer's property
        for(EstateTypeLand myLand:ownedLands){            
            // terra nullius
            // update owner of a land            
            System.out.println("updating owner to null.");
            myLand.owner = null;            
        }
        
        // remove lands from myPlayer
        System.out.println("removing land from owner's lands");
        myPlayer.removeLand();

        System.out.println(myPlayer.getName() + " no longer owns any land!");
    }
}
