package org.csystem.app;

import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		var val = kb.nextInt();
		
		
		System.out.println(++val);
		
		
	}
}



