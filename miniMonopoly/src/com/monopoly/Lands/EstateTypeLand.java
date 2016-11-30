package com.monopoly.Lands;
import com.monopoly.Events.BuyEvent;
import com.monopoly.Events.Event;
import com.monopoly.Events.PayRentEvent;
import com.monopoly.Events.UpgradeEvent;
import com.monopoly.Players.Player;

import static com.monopoly.Constants.Constant.*;

/**
 * Created by matthew on 2016/11/5.
 */
public class EstateTypeLand extends Land {

    public double purchasePrice;
    public double upgradePrice;
    public double rentFee;
    public Player owner;
    public int Level;
    
    public EstateTypeLand () {
        this.purchasePrice = INITIAL_PURCHASE_PRICE;
        this.rentFee = INITIAL_RENT_PRICE;
        this.upgradePrice = INITIAL_UPGRADE_PRICE;
        this.Level = 1;
    }
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
        this.tenant = tenant;
        Event eve = getEvent(tenant);        
        eve.doEvent(this, this.tenant);	        
    }
	
}
