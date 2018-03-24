

import java.lang.String;
import java.lang.System;

public class TestEQ {

	public TestEQ() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj1 = new String("xyz");

		String obj2 = new String("xyz");

		if(obj1 == obj2)
		   System.out.println("obj1==obj2 is TRUE");
		else
		  System.out.println("obj1==obj2 is FALSE");
		
		
		
		if(obj1.equals(obj2))
			   System.out.println("obj1 equals obj2 is TRUE");
			else
			  System.out.println("obj1  equals obj2 is FALSE");
		
		obj1="xyz";
		obj2="xyz";
		
		if(obj1 == obj2)
			   System.out.println("obj1==obj2 is TRUE");
			else
			  System.out.println("obj1==obj2 is FALSE");
	}

}
