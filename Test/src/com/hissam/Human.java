package com.hissam;

public class Human extends AbstractClass {

	public Human() {
		super();		
		run();
	}

	@Override
	public void run() {
			if(super.alive){
				System.out.println(" running with "+Math.random());
				try {
					Thread.sleep(1000);
					alive=false;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

}
