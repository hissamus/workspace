package org.hissam;

import java.util.ArrayList;
import java.util.List;

public class test2 {
	
	public static void main(String[] args) {
		
		
		List<String> myList = new ArrayList<String>();
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Orange");
		String[] myArray = myList.toArray(new String[2]);
		for (String myString : myArray) {
		   System.out.println(myString);
		}
	}

}
