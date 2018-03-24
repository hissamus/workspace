package org.hissam;

class MyThreads extends Thread {
	MyThreads() {
	}

	MyThreads(Runnable r) {
		super(r);
	}

	public void run() {
		System.out.print("Inside Thread ");
	}
}

class RunnableDemo implements Runnable {
	public void run() {
		System.out.print(" Inside Runnable");
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		new MyThreads().start();
		new MyThreads(new RunnableDemo()).start();
	}
}
