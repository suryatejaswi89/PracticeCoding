package com.practice.tree;

public class BinaryTree {

	public BinaryTreeNode root;
	
	public void addNode(int value){
		BinaryTreeNode newNode = new BinaryTreeNode(value);
		
		if(root == null){
			root = newNode;
		}
		else{
			BinaryTreeNode focusNode= root;
			BinaryTreeNode parentNode;
			while(true){
				parentNode = focusNode;
				
				if(value < focusNode.value){
					focusNode = focusNode.leftChild;
					if(focusNode == null){
						parentNode.leftChild = newNode;
						return;
					}
				}else{
					
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parentNode.rightChild = newNode;
						return;
					}
					
					
				}
				
				
				
			}
		}
	}
	
	public void inOrderTraversal(BinaryTreeNode focusNode){
		
		if(focusNode != null){
			inOrderTraversal(focusNode.leftChild);
			System.out.println(focusNode.value);
			inOrderTraversal(focusNode.rightChild);
		}
		
	}
	
	public void preOrderTraversal(BinaryTreeNode focusNode){
		if(focusNode != null){
			System.out.println(focusNode.value);
			preOrderTraversal(focusNode.leftChild);
			preOrderTraversal(focusNode.rightChild);
			
		}
	}
		public void postOrderTraversal(BinaryTreeNode focusNode){
			if(focusNode != null){
				postOrderTraversal(focusNode.leftChild);
				postOrderTraversal(focusNode.rightChild);
				System.out.println(focusNode.value);
				
				
				
			}
		
		}
	}
	
	
	

