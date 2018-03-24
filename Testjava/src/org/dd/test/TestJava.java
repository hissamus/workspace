package org.dd.test;

public class TestJava {
	
	public static void main(String args[])
	{
		System.out.println("hello hissam");
		TestJava t=new TestJava();
		t.callMThread();
	}
	
	private void callMThread(){
		int i=1;
		Thread t1;
		while(true)
		{
			t1=new MyThread();
			
			t1.run();			
		}
	}
	
	

}


