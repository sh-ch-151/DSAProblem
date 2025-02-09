package com.stack.stk;

import java.util.Stack;

public class BalancedParanthesis
{
	Stack<Character> stack = new Stack<>();

	public boolean isBalanced(String expression)
	{
		boolean balanced = false;
		for(int i = 0; i < expression.length(); i++)
		{
			if(expression.charAt(i) == '[' || expression.charAt(i) == '(' || expression.charAt(i) == '{')
			{
				stack.push(expression.charAt(i));
			}
			else
			{
				if(stack.empty())
				{
					System.out.println("Stack is empty");
				}
				else
				{
					if(stack.peek() == '(' && expression.charAt(i) == ')')
					{
						stack.pop();
					}
					else if(stack.peek() == '[' && expression.charAt(i) == ']')
					{
						stack.pop();
					}
					else if(stack.peek() == '{' && expression.charAt(i) == '}')
					{
						stack.pop();
					}
					if(stack.empty())
					{
						balanced = true;
					}
				}
			}
		}
		return balanced;
	}
}
