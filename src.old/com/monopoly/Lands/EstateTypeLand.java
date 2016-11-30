package com.monopoly.Lands;
import com.monopoly.Events.BuyEvent;
import com.monopoly.Events.Event;
import com.monopoly.Events.PayRentEvent;
import com.monopoly.Events.UpgradeEvent;
import com.monopoly.Players.Player;

/**
 * Created by matthew on 2016/11/5.
 */
public class EstateTypeLand extends Land {

    public double purchasePrice;
    public double upgradePrice;
    public double rentFee;
    public Player owner;
    public int Level;
 
    protected Event getEvent(Player tenant){
    	if(owner == null){
    		return new BuyEvent();
    	}
    	else if(owner == tenant){
    		return new UpgradeEvent();
    	}
    	return new PayRentEvent();
    }

    @Override
	public void trigger(Player tenant) {
		// TODO Auto-generated method stub
		Event eve = getEvent(tenant);
		eve.doEvent(this,tenant);	
	}
	
}
