package org.hissam;

public class TestThread implements Runnable {
	private Object o=new Object();
	
	public void call(){
		synchronized (o) {
			
		
		try {
			o.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public void call2(){
		synchronized (o) {
		try {
			System.out.println(Thread.currentThread().getName());
			o.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public static void main(String[] args) {
		
		
		TestThread t=new TestThread();
		
		t.call2();
//		Thread tt=new Thread(t);
//		tt.start();
//		
//		try {
//			tt.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public void run() {
		call();
		}

}
