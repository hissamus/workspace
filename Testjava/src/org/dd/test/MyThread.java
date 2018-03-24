package org.dd.test;

public class MyThread extends Thread {
	
	public void run(){
		super.run();
		try {
			sleep(0);
			System.out.print(this.getId());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("running thread" + this.getName());
	}
	public void finalize(){
		System.out.println("finalize thread" + this.getName());
	}

}
