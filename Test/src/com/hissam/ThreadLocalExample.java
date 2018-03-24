package com.hissam;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadLocalExample implements Runnable {

	// SimpleDateFormat is not thread-safe, so give one to each thread
	// SimpleDateFormat is not thread-safe, so give one to each thread
	private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd HHmm");
		}
	};
	
	private ThreadLocal< String> localString=new ThreadLocal<String>(){
		@Override 
		protected String initialValue(){
			Callable<String> a;
			Runnable r;
			return "localString initialised";
		}	
	};

	public static void main(String[] args) throws InterruptedException {
		ThreadLocalExample obj = new ThreadLocalExample();
		//MyObject obj2=new MyObject();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(obj, "" + i);
			Thread.sleep(new Random().nextInt(1000));
			t.start();
		}
	}

	@Override
	public void run() {
		System.out.println("Thread Name= " + Thread.currentThread().getName() + " default Formatter = "
				+ formatter.get().toPattern());
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		formatter.set(new SimpleDateFormat());
		localString.set( Thread.currentThread().getName()+" changing value");

		System.out.println(
				//"Thread Name= " + Thread.currentThread().getName() + " formatter = " + formatter.get().toPattern());
				localString.get());
	}

}
