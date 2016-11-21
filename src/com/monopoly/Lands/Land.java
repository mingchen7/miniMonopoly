package com.monopoly.Lands;

import com.monopoly.Players.Player;

/**
 * Created by matthew on 2016/11/5.
 */
abstract public class Land {
	public Player tenant;
    abstract public void trigger(Player tenant);
}
