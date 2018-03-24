package org.hissam.ProducerConsumer;

import java.util.List;

public class Producer implements Runnable{
	
	private List<Resource> queue;
	private static int MAX_LIMIT=10;
	
	public Producer(List<Resource> queue) {
	this.queue=queue;
	}
	@Override	
	public void run() {

		while(true){
			
			synchronized (queue) {
				try {
				while(queue.size()==MAX_LIMIT)					
						queue.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
			}
			
			produce();
		}
	}
	private void produce() {		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(Thread.currentThread().getName()+":Current Q size="+queue.size() +":");
		Resource n=new Resource();
		synchronized (queue) {
			queue.add(n);
			queue.notifyAll();
		}
		
	}

}
