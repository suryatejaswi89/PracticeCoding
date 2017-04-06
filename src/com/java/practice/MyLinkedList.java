package com.java.practice;


public class MyLinkedList {
	
	Node firstNode;
	Node lastNode;
	int size;
	
	public MyLinkedList(Node start, Node end, int size){
		this.firstNode = start;
		this.lastNode = end;
		this.size = size;
	}
	
	public MyLinkedList(){
		this.firstNode = null;
		this.lastNode = null;
		this.size =1;
	}
	
	public int getSize(){
		int size = 0;
		
		if(isEmpty()){
			return size;
		}
		else{
			Node pntr = firstNode;
			size =1;
			while(pntr.nextNode != null){
				size++;
			}
		}
		
		return size;
	}
	
	public boolean isEmpty(){
		return firstNode == null;
	}
	
	public void insertAtEnd(int data){
		Node newNode = new Node(data);
		size++;
		if(firstNode == null){
			firstNode = newNode;
			lastNode = firstNode;
		}
		else{
			lastNode.nextNode = newNode;
			lastNode = newNode;
		}
			
	}
	public void insertAtStart(int data){
		Node newNode = new Node(data);
		size++;
		if(firstNode == null){
			
			firstNode = newNode;
			lastNode = firstNode;
		}
		else{
			newNode.nextNode = firstNode;
			firstNode = newNode;
		}
	}
	
	public void insertAtPos(int data, int pos){
		Node newNode = new Node(data, null);
		Node pntr = firstNode;
		
		for(int i = 0; i<pos-1; i++){
			pntr = pntr.nextNode;
		}
		
		newNode.nextNode = pntr.nextNode;
		pntr.nextNode = newNode;
		size++;
		
	}
	
	public void deleteFirstNode(){
		firstNode = firstNode.nextNode;
		size--;
		
	}
	
	public void deleteLastNode(){
		Node pntr=firstNode;
		for(int i=0; i< size; i++){
			pntr= pntr.nextNode;
		}
		
		pntr.nextNode = null;
		size--;
	}
	
	public void deleteAtPos(int pos){
		Node pntr = firstNode;
		if(firstNode == null){
			return;
		}
		else{
		for(int i=0; i<pos-1; i++){
			pntr = pntr.nextNode;
		}
		pntr.nextNode = pntr.nextNode.nextNode;
		size--;
	}
	}
	
	public void displayList(MyLinkedList list){
		Node pntr = list.firstNode;
		if(list.isEmpty()){
			System.out.println("Its an empty list" );
		}
		else{
			for(int i=0; i< list.size-1; i++){
				System.out.println(pntr.data);
				pntr = pntr.nextNode;
			}
		}
		
		
	}
	

	

}
