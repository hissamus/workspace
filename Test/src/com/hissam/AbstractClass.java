package com.hissam;

public abstract class AbstractClass implements IAbstractInterface {
	volatile Boolean  alive=true;
	
	AbstractClass(){
		breath();
	}
	public abstract void run();
	public void breath(){
	Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(alive)
					System.out.println("Breathing");				
			}
		});
	t.setDaemon(true);
	t.start();
		
	}
}
