/**
 * 
 */
package org.dd.observerT;

/**
 * @author dave
 *
 */
public class ObserverTest {

	/**
	 * 
	 */
	public ObserverTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeingWatched a=new BeingWatched();
		a.addObserver(new Watcher(1));
		a.addObserver(new Watcher(2));
		a.addObserver(new Watcher(3));
		a.addObserver(new Watcher(4));
		
		a.doSomething();
	}

}
