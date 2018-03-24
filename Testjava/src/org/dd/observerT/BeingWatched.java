/**
 * 
 */
package org.dd.observerT;

import java.util.Observable;

/**
 * @author dave
 *
 */
public class BeingWatched extends Observable {

	/**
	 * 
	 */
	public BeingWatched() {
		// TODO Auto-generated constructor stub
	}
	
	public void doSomething(){
		setChanged();
		notifyObservers();
	}
	
	

}
