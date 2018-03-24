package org.hissam;

import java.util.LinkedList;
import java.util.List;

public class GenericsExample {

	public GenericsExample() {
	
	}
	
	
	public static void main(String[] args) {
	
		List<A> l=new LinkedList<A>();
		
		for (int i=0;i<10;i++){
			l.add(new B());
		}
		
	}

}

 class A{
	
	 
}
 
 class B extends A{
	 
 }
