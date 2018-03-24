import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample implements Runnable {

	private Resource r;
	private Lock lock;
	public LockExample(Resource r, Lock l) {
		this.r=r;
		this.lock=l;
	}

	public static void main(String[] args) {
		 Resource r=new Resource();
		 Lock l=new ReentrantLock();
		 LockExample l1=new LockExample(r,l);
		 LockExample l2=new LockExample(r,l);
		 LockExample l3=new LockExample(r,l);
		 LockExample l4=new LockExample(r,l);
		 LockExample l5=new LockExample(r,l);
		 
		 Thread t1=new Thread(l1,"Thread-1");t1.start();
		 Thread t2=new Thread(l2,"Thread-2");t2.start();
		 //Thread t3=new Thread(l3,"Thread-3");t3.start();
		 //Thread t4=new Thread(l4,"Thread-4");t4.start();
		 //Thread t5=new Thread(l5,"Thread-5");t5.start();
		 
		 try {
			t1.join();
			t2.join();
			//t3.join();
			//t4.join();
			//t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 r.showN();
		
	}

	@Override
	public void run() {
		
		try {
			if(lock.tryLock(100,TimeUnit.MILLISECONDS)){				
				r.m();
				System.out.println(Thread.currentThread().getName() +" ... M() Entered");
			}
			else{
				r.n();
			}
			//r.showN();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				lock.unlock();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
	}
	

}


class Resource{
	
	private volatile int n=0;
	public void m() throws InterruptedException{
		//System.out.println("Doing m computations");
		Thread.sleep(10000);
		System.out.println(Thread.currentThread().getName() +" n="+n+"... Doing M() computations");
		n=n+1;
	}
	
	public void n(){
		System.out.println(Thread.currentThread().getName() +" n="+n+"... Doing N() computations");
		n=n-1;
	}
	
	public void showN(){
		System.out.println(Thread.currentThread().getName() +"N="+n);
	}
}
