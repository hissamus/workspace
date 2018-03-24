package org.hissam;

public class TD2 {
	public static void main(String[] args) {
		Thread t = new MyThreadss() {
			public void run() {
				System.out.println(" foo");
			}
		};
		t.start();
	}
}


class MyThreadss extends Thread {
	MyThreadss() {
		System.out.print(" MyThread");
	}

	public void run() {
		System.out.print(" bar");
	}

	public void run(String s) {
		System.out.println(" baz");
	}
}
