package org.hissam.ProducerConsumer;

import java.util.List;

public class Consumer implements Runnable{
	
	private List<Resource> queue;
	private static int MAX_LIMIT=1000;
	
	public Consumer(List<Resource> queue) {
	this.queue=queue;
	}
	@Override	
	public void run() {

		while(true){
			
			synchronized (queue) {				
				try {
					while(queue.size()==0)
						queue.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}	
				
				
			}
			consume();				
		}
		
	}
	private void consume() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (queue) {
			if(queue.size()>0){
			Resource n=queue.remove(0);
			System.out.print(Thread.currentThread().getName()+":");
			n.consumed();
			queue.notify();
			}
		}
	}

}
