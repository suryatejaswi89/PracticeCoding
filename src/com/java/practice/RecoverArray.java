package com.java.practice;

import java.util.Scanner;

public class RecoverArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i< n ; i++){
			array[i] = scan.nextInt();
		}
		int arraycount = 0;
		int m = 0;
		do{	
			int index =0;
			m = array[index];
			index = index+2;
			arraycount++;
		}while(m<n);
		System.out.println(arraycount);
	}

}
