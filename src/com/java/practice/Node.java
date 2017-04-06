package com.java.practice;

public class Node {
	
	
	public Node nextNode = null;
	public int data;
	
	public Node(int d){
		this.nextNode = null;
		this.data = d;
	}
	
	public Node(int d, Node next){
		this.data = d;
		this.nextNode = next;
	}

	public void setNode(int d, Node nextNode){
		data = d;
		nextNode = nextNode;
	}
	
	public int getNode(){
		return data;
	}
	public Node getLink(){
		return nextNode;
	}
	
	
	
}
