package com.java.practice;

import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		for(int i=0; i<10; i++){
			array[i] = scan.nextInt();
		}
		
		selectsort(array);
	}
	
	public static void selectsort(int[] array){
		int small = 0;
		
	}

}
