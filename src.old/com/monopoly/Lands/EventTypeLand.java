package com.monopoly.Lands;

import com.monopoly.Events.Event;
import com.monopoly.Players.Player;
import com.monopoly.util.Map;

/**
 * Created by matthew on 2016/11/5.
 */
public class EventTypeLand extends Land {

	@Override
	public void trigger(Player tenant) {
		// TODO Auto-generated method stub
		Event eve = getEvent(tenant);
		eve.doEvent(this,tenant);
	}

	@Override
	protected Event getEvent(Player tenant){
		// TODO Auto-generated method stub
		return Map.pickAEvent();
	}
  
}
