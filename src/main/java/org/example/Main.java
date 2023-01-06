package org.example;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello world!");
		Number a = new Number(2);
		Number b = new Number(1);
		calc<Number> c = new calc(1);

		operator q = new Number(3);

		switch(q)
		{
			case Number n -> System.out.println(n);
			default -> throw new IllegalStateException("Unexpected value");
		}
		
		Number d = c.plus(a, b);
		System.out.println(d);
	}
}