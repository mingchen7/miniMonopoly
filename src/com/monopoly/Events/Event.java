package com.monopoly.Events;

import com.monopoly.Lands.Land;
import com.monopoly.Players.Player;

/**
 * Created by matthew on 2016/11/5.
 */
abstract public class Event {
	
	public abstract void doEvent(Land myLand, Player myPlayer);

}
