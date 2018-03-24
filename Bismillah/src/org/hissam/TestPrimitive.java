package org.hissam;

public class TestPrimitive {

	public TestPrimitive() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		long veryLargeNumber = Long.MAX_VALUE;
		long veryLargeNumber2 = veryLargeNumber+1;
		int fromLargeNumber = (int) veryLargeNumber;
		long i=Long.MIN_VALUE;
				
		int l= (int)i;
		
		System.out.println(veryLargeNumber+"||"+veryLargeNumber2+"||"+fromLargeNumber+"||"+l);
	Thread t=new Thread(new Runnable() {
		
		@Override
		public void run() {
			int i=0;
			while(true){
				System.out.println(++i);
			}
			
		}
	});
	
	
	t.start();
	t.stop();
	
	}

}
