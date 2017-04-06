package com.java.practice;

import java.util.Scanner;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node first = new Node(3);
		MyLinkedList mylist = new MyLinkedList();
		
		for(int i=0 ; i< 10; i++){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the dat for the next node");
			int data = scan.nextInt();
			if(mylist.firstNode == null)
			{
			mylist.insertAtStart(data);
			}
			else{
				mylist.insertAtEnd(data);
			}
		}
		
		
		
		System.out.println(mylist.getSize());
		mylist.displayList(mylist);
		
		
		
		

	}

}
