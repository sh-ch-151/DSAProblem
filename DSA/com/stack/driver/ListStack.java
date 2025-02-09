package com.stack.driver;

import com.stack.stk.StackUsingList;

public class ListStack
{
	public static void main(String[] args)
	{
		StackUsingList s = new StackUsingList();
		s.push(10);
		s.push(20);
		int ele = s.pop();
		System.out.println(ele);
		s.print();
	}
}
