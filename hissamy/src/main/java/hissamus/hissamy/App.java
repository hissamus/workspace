package hissamus.hissamy;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App implements Runnable
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        ArrayList<Thread> tArr=new ArrayList<Thread>();
        for(int i=0;i<10;i++){
        	App a= new App();
        	Thread t=new Thread(a, "App Thread"+i);
        	t.start();        	     	
        	tArr.add(t);
        }
        
        for(Thread t:tArr){
        	t.join();   
        }
    }

	public void run() {
		try {
			
				while(true){
					System.out.println(this.toString() +" sleeping");
					Thread.sleep(200000000);
				}
					
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
	}
}
