package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
	
	public static void fillRandomArray(Random r, int [] a, int min, int bound)
	{
		for (int i = 0; i < a.length; ++i)
			a[i] = r.nextInt(min, bound);
	}
	
	public static void fillRandomArray(Random r, double [] a, double min, double bound)
	{
		for (int i = 0; i < a.length; ++i)
			a[i] = r.nextDouble(min, bound);
	}
	
	public static int [] getRandomArray(Random r, int cnt, int min, int bound)
	{
		int [] a = new int[cnt];
		
		fillRandomArray(r, a, min, bound);
		
		return a;
	}
	
	public static double [] getRandomArray(Random r, int cnt, double min, double bound)
	{
		double [] a = new double[cnt];
		
		fillRandomArray(r, a, min, bound);
		
		return a;
	}
	
	public static int [] join(int [] a, int [] b)
	{
		int [] arr = new int[a.length + b.length];
		int idx = 0;
		
		for (int i = 0; i < a.length; ++i)
			arr[idx++] = a[i];
		
		for (int i = 0; i < b.length; ++i)
			arr[idx++] = b[i];
		
		
		return arr;
	}
	
	public static int max(int [] a)
	{
		int result = a[0];
		
		for (int i = 1; i < a.length; ++i)
			if (a[i] > result)
				result = a[i];
		
		
		return result;
	}
	
	public static int min(int [] a)
	{
		int result = a[0];
		
		for (int i = 1; i < a.length; ++i)
			if (a[i] < result)
				result = a[i];
		
		
		return result;
	}
	
	public static void print(int [] a)
	{
		print(1, a);
	}
	
	public static void print(int n, int [] a)
	{
		String fmt = String.format("%%0%dd ", n);
		
		for (int i = 0; i < a.length; ++i)
			System.out.printf(fmt, a[i]);
		
		System.out.println();
		
	}
	
	public static void print(double [] a)
	{
		for (int i = 0; i < a.length; ++i)
			System.out.printf("%f ", a[i]);
		
		System.out.println();
		
	}
	
	public static void reverse(int [] a)
	{
		for (int i = 0; i < a.length / 2; ++i)
			swap(a, i, a.length - 1 - i);
		
	}
	
	public static void swap(int [] a, int i, int k)
	{
		int temp = a[i];
		a[i] = a[k];
		a[k] = temp;
		
	}
	
	public static void swap(double [] a, int i, int k)
	{
		double temp = a[i];
		a[i] = a[k];
		a[k] = temp;
		
	}
	
	public static int sum(int [] a)
	{
		int result = 0;
		for (int i = 0; i < a.length; ++i)
			result += a[i];
		
		return result;
	}
	

}
