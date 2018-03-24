package org.dd.test;

public class Task {
    public class Schedule {
    	private  long l=100;
        public   long getTimeToNextRun() {
            System.out.println("getTimeToNextRun called.."+l);
            return l++;
        }
        public void reset() {
        	System.out.println("task.schedule.reset called..");
        }
    }
    public Schedule getScheduler(){
    	return new Schedule();
    }
    public void reset() {
    	System.out.println("task.reset() called..");
    	 
    			for(int i=0;i<50;i++)
    			{
    				//hedule.getTimeToNextRun();
	    	    	//s.reset();
    			}
    	
    }
}
