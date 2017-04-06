package com.java.practice;

import java.util.Scanner;

public class Bubblesort {
public static void main(String[] args){
	int[] array = new int[10];
	
	Scanner scan = new Scanner(System.in);
	for(int i=0 ; i<array.length;i++){
		System.out.println("Please enter the number");
		array[i] = scan.nextInt();
	}
	scan.close();
	sortbubble(array);
	for(int j=0; j< array.length ; j++){
		System.out.println(array[j]);
	}
	
}
public static void sortbubble(int[] array){
	for(int i=0; i<array.length-1;i++){
		for(int j=i+1; j<array.length;j++){
		if(array[i] > array[j]){
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}	
	}
	
	
}
}
}
