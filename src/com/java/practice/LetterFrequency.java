package com.java.practice;

import java.util.Hashtable;
import java.util.Scanner;

public class LetterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to find frequency");
		String s = scan.nextLine();
		
		frequencyCalculator(s);
		
	}
	public static void frequencyCalculator(String s){
		
		Hashtable<Character,Integer> frequency = new Hashtable<Character,Integer>();
		
		int counter=1;
		int i=0;
		for(i=0; i< s.length()-1;){
			
			if(s.charAt(i) == s.charAt(i+1)){
				counter++;
				i++;
			}
			else{
				frequency.put(s.charAt(i-1),counter);
				counter = 1;
				i++;
			}
			
		}
		
		while(i<s.length()-1){
			
			if(s.charAt(i)==s.charAt(i+1)){
				counter++;
				i++;
			}
			else{
				frequency.put(s.charAt(i-1),counter);
				counter = 1;
				i++;
			}
			
		}
		
	}

}
