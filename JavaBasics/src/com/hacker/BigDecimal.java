package com.hacker;

import java.util.*;

public class BigDecimal {

	
	

	    public static void main(String []args){
	        //Input
	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n+2];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	      	sc.close();
	      	
	      	Arrays.sort(s,Collections.reverseOrder( new Comparator<String>() {
	      		public int compare(String o1, String o2) {
	      			if(o1==null || o2==null) return 0;
	      			java.math.BigDecimal a=new java.math.BigDecimal(o1); 
	      			java.math.BigDecimal b=new java.math.BigDecimal(o2);
	      			return a.compareTo(b);
	      		};
			}));
	      	
	      //Output
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }
	    }


}