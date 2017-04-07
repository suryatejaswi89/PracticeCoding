package com.practice.stack;

//import com.java.practice.Node;

public class Node {
	
	public Node next;
	public int ele;
	
	public Node(){
		this.next = null;
		this.ele = ele;
	}
	
	public Node(int ele){
		this.ele = ele;
		this.next = null;
	}
	
	public Node(int ele, Node next){
		this.ele = ele;
		this.next = next;
	}
	
	public int getNode(){
		return ele;
	}
	
	public void setNode(int d){
		this.ele = d;
	}
	
	public Node getLink(Node node){
		return node.next;
	}
	

}
