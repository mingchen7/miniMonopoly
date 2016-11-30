<<<<<<< HEAD
package com.monopoly.Observers;

/**
 * Created by matthew on 2016/11/5.
 */
public class DeathNotification implements Observer {
}
=======
package com.monopoly.Observers;

/**
 * Created by matthew on 2016/11/5.
 */
// the first item in will list
public class DeathNotification implements Observer {
	public void execute(Player myPlayer){
		System.out.println(myPlayer.getName() + " fails!");		
	}
}
>>>>>>> 5ffa2f9d5c272ba8b0b0b19828d074cb9c773c95
