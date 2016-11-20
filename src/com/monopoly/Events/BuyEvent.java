package com.monopoly.Events;

/**
 * Created by matthew on 2016/11/5.
 */
public class BuyEvent extends PurchaseEvent {
    public static void doEvent(Land myLand, Player myPlayer){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you want to purchase this land? Please enter Yes or No.");
        String toPurchase = br.readLine();
        
        if(toPurchase == 'No'){
            System.out.print("You chose not to purchase, see you next time.");
        }else if(toPurchase == 'Yes'){
            if(myLand.getPrice() > myPlayer.getTotalAsset()){   //need to add getPrice method in players
                System.out.print("You don't have enough balance to purchase the land.");
            }else{
                myPlayer.addLand(myLand); //need to add addLand method in players
                myPlayer.updateBalance(-myLand.getPrice()); //need to add updateBalance method in players
                myLand.setOwner(myPlayer);  //need to add setOwner method in players
                System.out.print("You successfully purchased the land.");
            }
        }

    }
}
