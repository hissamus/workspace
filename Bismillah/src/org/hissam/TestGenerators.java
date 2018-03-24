package org.hissam;

public class TestGenerators {

	public static Resource lock = new Resource(){
		
	};

	public static void main(String[] args) throws InterruptedException {

		Thread odd1 = new Thread(new Runnable() {
			private Resource l = TestGenerators.lock;
			private int count = -1;

			@Override
			public void run() {
				while (true) {
					synchronized (l) {
						try {
							l.wait();
							System.out.print(increment());
							l.notify();
						} catch (Exception e) {
						}

					}

				}
			}

			private int increment() {
				count += 2;
				return count;
			}
		});

		Thread even1 = new Thread(new Runnable() {
			private Resource l = TestGenerators.lock;
			private int count = -2;

			@Override
			public void run() {
				while (true) {
					synchronized (l) {
						try {
							l.wait();
							System.out.print(increment());
							l.notify();
						} catch (Exception e) {
						}

					}

				}
			}

			private int increment() {
				count += 2;
				return count;
			}
		});

		Thread even=new Thread( new EvenGenerator(lock));
		Thread odd=new Thread(new OddGenerator(lock));
		

		even.start();
		odd.start();
		
		try {
			even.join();
			odd.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

	}

}

class Resource{
	protected volatile boolean isEvenPrinted;
}

class OddGenerator implements Runnable{
	private Resource l ;//= TestGenerators.lock;
	private int count = -1;
	
	OddGenerator(Resource l){
		this.l=l;
	}
	@Override
	public void run() {
		while (true) {
			synchronized (l) {
				try {
					if(!l.isEvenPrinted)
					l.wait();
					System.out.println(increment());
					Thread.currentThread().sleep(500);
					l.isEvenPrinted=false;
					l.notify();
					
					//Thread.sleep(1000);
				} catch (Exception e) {
				}

			}

		}
	}

	private int increment() {
		count += 2;
		return count;
	}
}

class EvenGenerator implements Runnable{
	private Resource l ;//= TestGenerators.lock;
	private int count = -2;
	
	EvenGenerator(Resource l){
		this.l=l;
	}
	@Override
	public void run() {
		while (true) {
			synchronized (l) {
				try {
					if(l.isEvenPrinted)
					l.wait();
					System.out.println(increment());
					Thread.currentThread().sleep(500);
					l.isEvenPrinted=true;
					l.notify();
				} catch (Exception e) {
				}

			}
			

		}
	}

	private int increment() {
		count += 2;
		return count;
	}
}
