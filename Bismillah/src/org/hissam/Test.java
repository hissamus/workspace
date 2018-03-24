package org.hissam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

	private static int total = 0;
	private static int countT1 = 0;
	private static int countT2 = 0;
	private boolean run = true;

	public Test() {
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		newCachedThreadPool.execute(t1);
		newCachedThreadPool.execute(t2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
		}
		run = false;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println((countT1 + countT2 + " == " + total));
	}

	private Runnable t1 = new Runnable() {
		@Override
		public void run() {
			while (run) {
				total++;
				countT1++;
				System.out.println("Hello #" + countT1 + " from Thread 2! Total hello: " + total);
			}
		}
	};

	private Runnable t2 = new Runnable() {
		@Override
		public void run() {
			while (run) {
				total++;
				countT2++;
				System.out.println("Hello #" + countT2 + " from Thread 2! Total hello: " + total);
			}
		}
	};

	public static void main(String[] args) {
		// new Test();
		/*
		 * Read input from stdin and provide input before running Use either of
		 * these methods for input
		 * 
		 * //BufferedReader BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String line = br.readLine(); int N =
		 * Integer.parseInt(line);
		 * 
		 * //Scanner Scanner s = new Scanner(System.in); int N = s.nextInt();
		 * 
		 * for (int i = 0; i < N; i++) { System.out.println("hello world"); }
		 */
//		int[] aa = new int[] { 3, 5, 2, 6, 9, 8, 55, 8, 00, 845, 42, 55 };
//		Arrays.sort(aa);
//
//		Scanner s = new Scanner(System.in);
//		try {
//			String str = s.nextLine();
//			System.out.println(str);
//			int N = s.nextInt();
//			System.out.println(N);
//
//		} catch (NumberFormatException nfe) {
//			String str = s.nextLine();
//			System.out.println(str);
//		} catch (Exception e) {
//			System.out.println(e.getMessage() + "\n||" + e.getClass());
//		} finally {
//			s.close();
//		}

		// int NN = s.nextInt();
		// System.out.println(NN);

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			
			int NN = Integer.parseInt(line);
			System.out.println(NN);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage() + "\n||" + e.getClass());
		}

		int N = 15;
		for (int i = 1; i < 15; i++) {
			System.out.println(N % i);
		}
	}
}