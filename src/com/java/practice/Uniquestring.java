/**
 * 
 */
package com.java.practice;

import java.util.Scanner;

/**
 * @author Teja
 *
 */
public class Uniquestring {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the string here");
			String s = scan.nextLine();
			System.out.println(uniqueStringfinder(s));
	}
public static boolean uniqueStringfinder(String s){
	int checker =0;
	for(int i=0; i<s.length(); i++){
		int val = s.charAt(i) - 'a';
		if((checker & (1 << val)) >0){
			return false;
		}
		checker |= (1 << val);
	}
	return true;
}
}
