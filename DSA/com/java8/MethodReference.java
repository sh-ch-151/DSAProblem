package com.java8;

@FunctionalInterface
interface Parser
{
	String parse(String s);
}

class StringParser
{
	public String convert(String str)
	{
		if(str.length() <= 8)
		{
			str = str.toUpperCase();
		}
		else
		{
			str = str.toLowerCase();
		}
		return str;
	}
}

class MyPrinter
{
	public void print(String str, Parser p)
	{
		str = p.parse(str);
		System.out.println(str);
	}
}

public class MethodReference
{
	public static void main(String[] args)
	{
		StringParser sp = new StringParser();
		String str = "shweta";
		MyPrinter mp = new MyPrinter();
		mp.print(str, sp::convert);
	}
}
