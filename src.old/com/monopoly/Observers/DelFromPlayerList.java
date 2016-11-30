<<<<<<< HEAD
package com.monopoly.Observers;

/**
 * Created by matthew on 2016/11/5.
 */
public class DelFromPlayerList implements Observer {
}
=======
package com.monopoly.Observers;

/**
 * Created by matthew on 2016/11/5.
 */
// the last item to execute in a willList
public class DelFromPlayerList implements Observer {
	public void execute(Player myPlayer){
			myPlayer.goDie();
	}
}
>>>>>>> 5ffa2f9d5c272ba8b0b0b19828d074cb9c773c95
