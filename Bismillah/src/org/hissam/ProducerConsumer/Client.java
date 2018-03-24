package org.hissam.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Client {

	
	public static void main(String[] args) {
		
		List<Resource>queue=new ArrayList<Resource>();
		
		Thread producer=new Thread(new Producer(queue),"Producer1");
		Thread producer2=new Thread(new Producer(queue),"Producer2");
		Thread producer3=new Thread(new Producer(queue),"Producer3");
		Thread consumer=new Thread(new Consumer(queue),"consumer1");
		Thread consumer2=new Thread(new Consumer(queue),"consumer2");
		Thread consumer3=new Thread(new Consumer(queue),"consumer3");
		
		consumer.start();consumer2.start();consumer3.start();
		producer.start();producer2.start();producer3.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
