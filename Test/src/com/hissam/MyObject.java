package com.hissam;

public class MyObject {
	ThreadLocal< String> localString=new ThreadLocal<String>(){
		@Override 
		protected String initialValue(){
			return "localString initialised";
		}	
	};
	
	
	
}
