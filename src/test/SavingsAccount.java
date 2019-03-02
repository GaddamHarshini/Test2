package test;

import java.util.Scanner;

public class SavingsAccount extends FixedAccount {
	static double balance=sc.nextDouble();
	public static void calculateInterest()
	{
		float Interestrate = 4;
		System.out.println(balance*(Interestrate/100)+balance);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SavingsAccount s = new SavingsAccount();
	s.calculateInterest();
		
	}

}
