package com.hacker;

import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		while(true){
			String str1=in.nextLine();
	        String str2=in.nextLine();
	        String A=str1.toLowerCase();
			String B=str2.toLowerCase();
			
			if(A.equals(B)){
			
				System.out.println(2*A.length());
				System.out.println("No");				
				System.out.println(camelCase(A)+" "+camelCase(B));
			}else{
		int l_a=A.length();
		int l_b=B.length(); 
		char[] charA=new char[l_a];
		char[] charB=new char[l_b];
		
		charA=A.toCharArray();
		charB=B.toCharArray();
		
		//int valA=strLexicalVal(charA,l_a);
		//int valB=strLexicalVal(charB,l_b);
		
		int valA=0;
		int valB=0;
		boolean lexicon=false;
		int l= l_a>=l_b?l_a:l_b;
		for(int i=0;i<l;i++){
			if(i<l_a)
				valA=(int)charA[i];
			else
			{
				lexicon=true;
				break;
			}
			if(i<l_b)
				valB=(int)charB[i];
			else
			{
				lexicon=true;
				break;
			}
			
			if(valA<valB){
				lexicon=true;
				break;
			}else if(valA>valB){
				lexicon=false;
				break;
			}			
		}
		
		
		System.out.println(l_a+l_b);
		if(lexicon)System.out.println("No");
		else System.out.println("Yes");
		System.out.println(camelCase(A)+" "+camelCase(B));
			}
		
		
		
		
//		if(valA<valB){
//			
//			//System.out.println(A +"is lexically greater than "+B);
//			System.out.println("Yes");
//		}
//		else{
//			//System.out.println(A +"is NOT lexically greater than "+B);
//			System.out.println("No");
//		}
			
			//Character.isupp
		
		}
	}
	
	private static String camelCase(String input){
		if(input==null || input.equals(""))
			return "";
		if(input.length()==1)
			return Character.toString(input.charAt(0)).toUpperCase();
		else
			return Character.toString(input.charAt(0)).toUpperCase()+  input.substring(1, input.length()).toLowerCase();
	}
	
	public static int strLexicalVal(char[] input, int inputLength){
		
		int val=0;
		for(int i=0;i<inputLength;i++){
			val+=(int)input[i];
		}
		
		return val;
	}

}
