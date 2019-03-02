package test;

import java.util.Scanner;

public class FixedAccount {
	static Scanner sc = new Scanner(System.in);
	static double balance=sc.nextDouble();
	
	public static void calculateInterest()
	{
		float Interestrate = 2;
		System.out.println(balance*(Interestrate/100)+balance);
	}

}
