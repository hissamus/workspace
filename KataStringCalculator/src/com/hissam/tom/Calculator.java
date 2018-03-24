package com.hissam.tom;

public class Calculator {

	public int calculate(String string) {

		if(isEmpty(string)){
			return 0;
		}		
		else
		{
			String[] array=string.split(",");
			if(array.length==1){
				return Integer.parseInt(array[0]);
			}
			else{
				return Integer.parseInt(array[0])+Integer.parseInt(array[1]);	
			}
			
		}	
		//return Integer.parseInt(string);
	}
	
	private boolean isEmpty(String input){
		
		return input.isEmpty();
	}
	
	

	
	

}
