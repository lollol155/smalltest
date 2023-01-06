package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class calc<T extends operator<T>>
{
	int toUseSomeLombok;
	T  plus(T a, T b)
	{
		return a + b;
	}
}
