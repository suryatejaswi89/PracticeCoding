package com.java.practice;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string here");
		String s1 = scan.nextLine();
		
		isPalindrome(s1);
		makePalindrome();
		}
	
	public static void isPalindrome(String s1){
		String ans = " ";
		int i = 0;
		int j =0;
		for( i = 0; i<=s1.length()/2; ){
			j = s1.length()-1-i;
			if(s1.charAt(i) == s1.charAt(j)){
				System.out.println(s1.charAt(i)+" ,"+ s1.charAt(j));
				i++;
				
			}
			//System.out.println("Its a palindrome");
			else{
				break;
			}
				
		}
		System.out.println(i+" "+ j);
		if(i == j+1){
			System.out.println("It is a palindrome");
		}
		else{
			System.out.println("No, its not a palindrome");
		}
		
	}
	
	public static void makePalindrome(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string you wish to make palindrome");
		String s = scan.next();
		int length = s.length();
		String palindrome = s;
		String sub = " ";
		if(length == 1){
			System.out.println(s);
		}
		
		else if(length % 2 == 0){
			sub = s.substring(0,length-1);
			String revsub  = reverseString(sub);
			palindrome = s.concat(revsub);
		}
		else if(length % 2 != 0){
			sub = s.substring(0,length-1);
			String revsub  = reverseString(sub);
			palindrome = s.concat(revsub);
		}
		System.out.println(palindrome);
		
	}
	public static String reverseString(String sub){
		
		String reverse="";
		for(int i=sub.length()-1; i>=0; i-- ){
			reverse = reverse+sub.charAt(i);
		}
		return reverse;
	}
	}


