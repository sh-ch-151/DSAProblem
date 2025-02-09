package com.stack.driver;

import com.stack.stk.BalancedParanthesis;

public class BalancedStack
{
	public static void main(String[] args)
	{
		BalancedParanthesis s = new BalancedParanthesis();
		boolean balanced = s.isBalanced("([)]");
		System.out.println(balanced);
	}
}
