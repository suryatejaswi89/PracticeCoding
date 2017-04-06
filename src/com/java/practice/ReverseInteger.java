package com.java.practice;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = scan.nextInt();
		scan.close();
		
		while(n>0){
			System.out.print(n % 10);
			n = n/10;
		}
		// TODO Auto-generated method stub

	}

}
