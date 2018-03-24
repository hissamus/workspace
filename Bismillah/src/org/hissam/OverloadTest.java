package org.hissam;

public class OverloadTest {

	
	protected void overloadString(String s) {
		System.out.println(s);
	}
	protected void overloadString(StringBuffer s) {
		System.out.println(s);
	}
	protected void overloadString(StringBuilder s) {
		System.out.println(s);
	}
	protected void overloadString(Object s) {
		System.out.println(s);
	}
	
	protected void overloadInt(Integer s) {
		System.out.println(s);
	}
	protected void overloadInt(int s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		OverloadTest t=new OverloadTest();
		
		t.overloadInt(100);
		t.overloadString("close");
		//t.overloadString(null);
		
//		Thread tt=new Thread();
//		tt.start();
//		try {
//			tt.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Thread t1=new MyThread(){
			@Override
			public void run() {			
				super.run();
				System.out.println("t1 is running");
			}
		};
		
		t1.start();
	}

}

class MyThread extends Thread{
	
	
	public MyThread() {
	System.out.println("Mythread Constructor");
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread run() called");
	}
	
	
	public void run(String s) {
		super.run();
		System.out.println("MyThread run("+ s +") called");
	}
}
