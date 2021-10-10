package com.learning.services;

import java.util.Stack;

public class CheckBalanceService {

	//function to check whether String is balanced or not 
	public static boolean checkbalance(String expression) {
		// to check odd or even 
		if (expression.length() % 2 == 1)
			return false;

		Stack<Character> stack = new Stack<>();
		
		//traverse the input String
		for (int i = 0; i < expression.length(); i++) {
			char character = expression.charAt(i);

			// if current element is equal to opening brackets then push it on to the stack ,
			// else pop the top of stack  and compare with the current element
			if (character == '{' || character == '(' || character == '[') {
				stack.push(character);
			} else {
         
				char c = stack.pop();
				
				//compare popped element and current element 
				switch (character) {
				case '}':
					if (c != '{')
						return false;
					break;

				case ')':
					if (c != '(')
						return false;
					break;
				case ']':
					if (c != '[')
						return false;
					break;

				}
			}

		}
		
		// if return true, stack is empty that means String is balanced
		return stack.empty();
	}

}
