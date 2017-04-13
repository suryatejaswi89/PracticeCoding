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
		
		public static int findMax(BinaryTree tree){
			int max =0;
			BinaryTreeNode focusNode = tree.root;
			while(focusNode.rightChild != null){
				focusNode = focusNode.rightChild;
			}
			
			max = focusNode.value;
			
			return max;
		}
		public static int findMin(BinaryTree tree){
			int min =0;
			BinaryTreeNode focusNode = tree.root;
			while(focusNode.leftChild != null){
				focusNode = focusNode.leftChild;
			}
			
			min = focusNode.value;
			
			return min;
		}
		
		
			public static BinaryTreeNode findNode(BinaryTree tree, int num){
				
				BinaryTreeNode focusNode = tree.root;
	
				while(focusNode != null){
				if(focusNode.value == num){
					return focusNode;
				}
				
				else if(focusNode.value < num){
					if(focusNode.rightChild.value == num)
						return focusNode.rightChild;
					focusNode = focusNode.rightChild;
					
				}
				else{
					if(focusNode.leftChild.value == num)
						return focusNode.leftChild;
					focusNode = focusNode.leftChild;
				}
				
				}
				return focusNode;
				
				
		
	}
}
	
	
	

