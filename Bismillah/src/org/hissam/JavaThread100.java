package org.hissam;

public class JavaThread100 implements Runnable {
	
	public static volatile int count=100;
	
	@Override
	public void run() {
	
		if(count!=0){
			System.out.println(Thread.currentThread().getName()+"|"+count--);
			Thread t= new Thread(new JavaThread100());
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args)throws Exception {
		
		//int count=100;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Thread t= new Thread(new JavaThread100());
				t.start();
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}

}
