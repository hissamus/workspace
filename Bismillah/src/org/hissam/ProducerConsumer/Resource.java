package org.hissam.ProducerConsumer;

public class Resource {
	
	private static int id=0; 
	
	private int identity=0;
	
	Resource(){
		identity=++id;
		System.out.println(this.identity +" produced...");
	}

	public void consumed() {		
		System.out.println(this.identity +" Consumed...");
	}

}
