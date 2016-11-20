package com.monopoly.Events;

/**
 * Created by matthew on 2016/11/5.
 */
public class UpgradeEvent extends PurchaseEvent {
    public static void doEvent(Land myLand, Player myPlayer){
        private double upgradeCost = myLand.getPrice*0.15;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you want to purchase this land? Please enter Yes or No.");
        String toUpgrade = br.readLine();
        
        if(toUpgrade == 'No'){
            System.out.print("You chose not to upgrade, see you next time.");
        }else if(toUpgrade == 'Yes'){
            if(upgradeCost > myPlayer.getTotalAsset()){  
                System.out.print("You don't have enough balance to upgrade the land.");
            }else{
                myLand.setRent(myLand.getRent()*1.25); //add setRent method to land class
                myPlayer.updateBalance(-upgradeCost); 
                System.out.print("You successfully upgraded the land. Rent has been increased to " + myLand.getRent() + ".");
            }
        }

    }
}
