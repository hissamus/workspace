package org.hissam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	//public class ThreadPoolExample {

	    public static void main(String args[]) {
	       ExecutorService service = Executors.newFixedThreadPool(2);
	       for (int i =0; i<10; i++){
	           service.submit(new Task(i));
	       }
	       
	       service.shutdown();
	       System.out.println("Shutting down");
	    }
	    
	    
	  
	}

	final class Task implements Runnable{
	    private int taskId;
	  
	    public Task(int id){
	        this.taskId = id;
	    }
	  
	    @Override
	    public void run() {
	       
	        try {
				Thread.sleep(2000);
				 System.out.println("Task ID : " + this.taskId +" performed by " 
                         + Thread.currentThread().getName()+"  Sleep done");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	  
	}
