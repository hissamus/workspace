import java.util.Scanner;

import javax.swing.JOptionPane;


public class HelloWorld {
	public static void main(String[] args) {
		String s1 = new String("Hello World");
		System.out.println(s1.toString());
		
		Emp e = new Emp();
		System.out.println(e.toString());
		int a=0;
		Scanner scan =null;
		scan=new Scanner(System.in);
		while(a!=9){
		 
		a = scan.nextInt();
		String s = scan.next();
		System.out.println(s);
		}
		if(scan!=null)
		{
			scan.close();
		}
		String name = JOptionPane.showInputDialog("Enter your name");
		System.out.println(name);
		
		
	}
}
