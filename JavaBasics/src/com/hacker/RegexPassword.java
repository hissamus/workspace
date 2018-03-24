package com.hacker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPassword {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int test = Integer.parseInt(in.nextLine());
		Pattern p = null;
		if (test == 1) {// ip test
			p = ipRegex();
		} else if (test == 2) {
			p = passwordRegex();
		}

		while (true) {
			String testStr = in.nextLine();
			if (p.matcher(testStr).matches()) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
	
	public static Pattern passwordRegex(){
		String pattern = "^[a-zA-Z][a-zA-z0-9_]{2,29}$";
		return Pattern.compile(pattern);
	}
	
	public static Pattern ipRegex(){
		
		String pattern="(?=.*[0-255])(?=.[.])(?=.*[0-255])(?=.[.])(?=.*[0-255])(?=.[.])(?=.*[0-255])(?=.[.]).{4,19}";
		return Pattern.compile(pattern);
	}
}
