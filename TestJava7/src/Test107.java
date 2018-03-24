public class Test107 implements Runnable 
{ 
    private int x; 
    private int y; 
    
    public Test107() {
		super();
	}

    public static void main(String args[]) 
    {
//        Test107 that = new Test107(); 
//        (new Thread(that,"T1")).start(); 
//        (new Thread(that,"T2")).start();

    	
        Test107  t = new Test107();
        Thread x = new Thread(t,"tt");
        x.start(); 
        
        Object o=new Object(){
        	public int value;
        	@Override
        	public int hashCode() {
        		return (int)value^5;
        	}
        	@Override
        	public boolean equals(Object obj) {
        		return super.equals(obj);
        	}
        };
        
        System.out.println(o.hashCode());
    } 
    public synchronized void run() 
    {
    	System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 10; i++) 
        { 
            x++; 
            y++; 
            System.out.println("x = " + x + ", y = " + y); /* Line 17 */
        } 
    } 
} 