package com.practice.tree;

public class BinaryTreeTest {
	
	public static void main(String[] args){
		
		BinaryTree myTree = new BinaryTree();
		
		myTree.addNode(3);
		myTree.addNode(4);
		myTree.addNode(1);
		myTree.addNode(11);
		myTree.addNode(2);
		myTree.addNode(7);
		
		System.out.println("In Order");
		myTree.inOrderTraversal(myTree.root);
		System.out.println("Post Order");
		myTree.postOrderTraversal(myTree.root);
		System.out.println("Pre Order");
		myTree.preOrderTraversal(myTree.root);
		
		
	}

}
