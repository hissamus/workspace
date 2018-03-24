/**
 * 
 */
package org.dd.observerT;

import java.util.Observable;
import java.util.Observer;

/**
 * @author dave
 *
 */
public class Watcher implements Observer {
private int id=0;	
	Watcher(int a){
		id=a;
	}
	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("update(" + arg0 + "," + arg1 + ")+id="+id+";");
	}

}
