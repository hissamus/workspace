package org.dd.test;

public class InnerClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task t=new Task();
//		//t.reset();
//		Task.Schedule s=t.getScheduler();
//		s.getTimeToNextRun();
		
		InnerClassTest ict=new InnerClassTest();
		try{
		ict.catcher();
		}
		catch(Exception e){
			System.out.println(e.getClass());
		}
		finally{
			System.out.println("main Finally called.......");
		}
	}
	
	protected void catcher() throws Exception{
		throwException();
	}
	
	protected void throwException() throws Exception
	{
		try{
		//throw new Exception();
			System.out.println("calling exit");
			System.exit(0);
		}
		finally{
			System.out.println("throwException Excprion Finally called.......");
		}
	}

}
