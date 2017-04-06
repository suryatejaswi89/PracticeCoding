package com.java.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Stringreversal {
	
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList<String> listofWords = new ArrayList<String>();
	
	//char[] array = new char[str.length()];
	
	System.out.println("Please enter the string you want to reverse");
	String str = scan.nextLine();
	
	
	reversestring(str);
	

}
	public static void reversestring(String string){
		for(int i = string.length()-1; i>=0; i--){
			System.out.print(string.charAt(i));
		}
	}
}
