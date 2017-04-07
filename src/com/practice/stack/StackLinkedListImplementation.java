package com.practice.stack;

import java.util.Scanner;

public class StackLinkedListImplementation {

	public Node top;
	
	public int total;
	
	public StackLinkedListImplementation(){
		
	}
	
	public void push(int data){
		Node node = new Node(data);
		
		if(top != null){
			
			Node temp = top;
			top = node;
			top.next = temp;
			total ++;
		}
		else{
			top = node;
			total++;
		}
	}
	
	
	public Node pop(StackLinkedListImplementation list){
		Node node = new Node();
		if(list.top == null){
			System.out.println("stack is empty");
			return node;
		}
		else{
			
			node = list.top;
			list.top = list.top.next;
			list.total--;
		}
		System.out.println(node.ele);
		return node;
	}
	
	public int returnSize(){
		return total;
	}
	
	public void displayStack(){
	
		for(int i= 0;i<total; i++){
			System.out.print(top.ele);
			top = top.next;
		}
		
		
	}
	
	
	
	
	
}
