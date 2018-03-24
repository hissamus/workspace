package org.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.setVin(3);
		c1.setName("ZEN");
		
		Car c2=new Car();
		c2.setVin(1);
		c2.setName("ZEN");
		
		Car c3=new Car();
		c3.setVin(3);
		c3.setName("ZEN");
		
		Car c4=new Car();
		c4.setVin(4);
		c4.setName("ZEN");
		
		Set<Car> set=new HashSet<Car>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		
		Iterator<Car> iter=set.iterator();
		
		while(iter.hasNext())
		{
			Car temp=iter.next();
			
			System.out.println(temp);
		}

	}

}
