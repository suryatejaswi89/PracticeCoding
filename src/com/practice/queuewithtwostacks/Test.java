package com.practice.queuewithtwostacks;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String shouldContinue = "Y";
		
		
		System.out.println("Please enter 1 for inserting and 2 for deleting");
		int usrinput = scan.nextInt();
		
		if(usrinput == 1){
			System.out.println("Please enter the number you want to insert");
			int eleToInsert = scan.nextInt();
			QueueWithTwoStacks.addElement(eleToInsert);
			//System.out.println(QueueWithTwoStacks.s1.pop().toString());
		}
		else{
			QueueWithTwoStacks.removeElement();
		}
			
		}
		
		
	}
	
	

