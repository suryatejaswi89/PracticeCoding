package com.practice.queuewithtwostacks;

import java.util.Scanner;
import java.util.Stack;

public class QueueWithTwoStacks {

	static Stack s1 = new Stack();
	static Stack s2 = new Stack();
	Scanner scan = new Scanner(System.in);
	
	public QueueWithTwoStacks(){
		Stack stack1;
		Stack stack2;
	}
	
	
public static void addElement(int data){
	//System.out.println("Please enter the number you want to add");
	//int data = scan.nextInt();
	int size = s1.size();
	if(size == 0){
		s1.push(data);
	}
	else{
		
		for(int i=0; i<size ;i++){
			s2.push(s1.pop());
		}
		s1.push(data);
		
		for(int i=0 ; i<s2.size(); i++){
			s1.push(s2.pop());
		}

	}
}

public static void removeElement(){
	if(s1.size() == 0){
		System.out.println("Queue is empty");
	}
	else{
	 
	System.out.println(s1.pop().toString());
	}
}


	
	
}
