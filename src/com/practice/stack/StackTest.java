package com.practice.stack;

import com.sun.org.apache.bcel.internal.generic.POP;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedListImplementation newStack = new StackLinkedListImplementation();
		
		
		newStack.push(3);
		newStack.push(4);
		newStack.push(2);
		newStack.push(5);
		newStack.push(9);
		
		System.out.println(newStack.top.getNode());
		newStack.displayStack();
		newStack.pop(newStack);
		//newStack.displayStack();
		

	}

}
