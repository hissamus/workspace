
class MyThreader extends Thread 
{ 
	MyThreader() {} 
	MyThreader(Runnable r) {super(r); } 
    public void run() 
    { 
        System.out.print("Inside Thread ");
    } 
} 
class MyRunnable implements Runnable 
{ 
    public void run() 
    { 
        System.out.print(" Inside Runnable"); 
    } 
} 
public class Test 
{  
    public static void main(String[] args) 
    { 
        new MyThreader().start(); 
        new MyThreader(new MyRunnable()).start(); 
    } 
}
