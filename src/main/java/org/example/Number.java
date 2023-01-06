package org.example;

public record Number(double a) implements operator<Number>
{
	public Number plus(Number b)
	{
		return new Number(a + b.a);
	}
}
