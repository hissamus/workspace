
public class WaitModel implements Runnable {
	private Model m;
	public WaitModel(Model m) {
		this.m=m;
	}

	public static void main(String[] args) {
		Model m=new Model();
		
		Thread t1=new Thread(new WaitModel(m),"T1");
		Thread t2=new Thread(new WaitModel(m),"T2");
		Thread t3=new Thread(new WaitModel(m),"T3");
		Thread t4=new Thread((new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+ " calling  notifyAll()" );
				synchronized (m) {
					m.incrementI();
					//m.notifyAll();	
					m.notify();
				}
			}
		}),"T4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			Thread.sleep(5000);
			if(t1.isAlive())t1.interrupt();
			if(t2.isAlive())t2.interrupt();
			if(t3.isAlive())t3.interrupt();
			if(t4.isAlive())t3.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
					System.out.println("System is shutting down");
			}
		});
		
		

	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("calling finalized......"+Thread.currentThread().getName());
		super.finalize();
		//o=null;
	}

	@Override
	public void run() {
			System.out.println(Thread.currentThread().getName()+ "going to wait now" );
			
			try{
				while(!Thread.currentThread().isInterrupted()){
					synchronized (m) {						
						//Thread.sleep(1000);
						m.wait();
						m.incrementI();
						System.out.println(Thread.currentThread().getName()+" Executing.. Done.");
						break;
					}					
				}
			}catch(InterruptedException e){
				System.out.println(Thread.currentThread().getName()+" got interuppted.. Done.");
				
			}
			catch (Exception e) {
			}
	}

}

class Model{
	
	private static int i=0;
	private Object o=new Object();
	
	public void incrementI(){
		i++;
		System.out.println("Value of i="+i);
	}
	
	public int getI(){
		return this.i;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("calling finalized");
		super.finalize();
		o=null;
		
	}
}
