/**
 * 
 */
package org.dd.test;

/**
 * @author dave
 *
 */
public class IManImpl implements IMan {

	/**
	 * 
	 */
	public IManImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.dd.test.IMan#call()
	 */
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println(m.isVirgin());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IManImpl im=new IManImpl();
		im.call();
	}

}
