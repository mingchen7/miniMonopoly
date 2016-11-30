package com.monopoly.Observers;

import com.monopoly.Players.Player;

/**
 * Created by matthew on 2016/11/5.
 */
public interface Observer {
    public void execute(Player myPlayer);
}
