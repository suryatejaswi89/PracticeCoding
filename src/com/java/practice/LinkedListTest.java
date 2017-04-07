package com.java.practice;

import java.util.Scanner;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node first = new Node(3);
		MyLinkedList mylist = new MyLinkedList();
		
		System.out.println(mylist.isEmpty());
		
		for(int i=0 ; i< 5; i++){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the data for the next node");
			int data = scan.nextInt();
			if(mylist.firstNode == null)
			{
			mylist.insertAtStart(data);
			}
			else{
				mylist.insertAtEnd(data);
			}
		}
		
		//mylist.insertAtPos(3, 5);
		//System.out.println(mylist.getSize());
		//mylist.displayList(mylist);
		//System.out.println("End");
		//mylist.deleteLastNode();
		//mylist.displayList(mylist);
		//System.out.println("End");
		//mylist.deleteAtPos(3);
		//mylist.displayList(mylist);
		
		//mylist.sortList(mylist);
		System.out.println("End");
		mylist.displayList(mylist);
		
		removeDuplicates(mylist);
		mylist.displayList(mylist);
		

	}
	
	
		 public static void removeDuplicates(MyLinkedList mylist) {
		        Node ptr1 = null, ptr2 = null, dup = null;
		        ptr1 = mylist.firstNode;
		 
		        /* Pick elements one by one */
		        while (ptr1 != null && ptr1.nextNode != null) {
		            ptr2 = ptr1;
		 
		            /* Compare the picked element with rest
		                of the elements */
		            while (ptr2.nextNode != null) {
		 
		                /* If duplicate then delete it */
		                if (ptr1.data == ptr2.nextNode.data) {
		 
		                    /* sequence of steps is important here */
		                    dup = ptr2.nextNode;
		                    ptr2.nextNode = ptr2.nextNode.nextNode;
		                    System.gc();
		                } else /* This is tricky */ {
		                    ptr2 = ptr2.nextNode;
		                }
		            }
		            ptr1 = ptr1.nextNode;
		        }
		    }
	
	
	

}
