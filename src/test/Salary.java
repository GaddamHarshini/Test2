package test;

import java.util.Scanner;

public class Salary {
	
	public static void calculateNetSalary()
	{
		Scanner sc =new Scanner(System.in);
		float a = sc.nextFloat();
		float hra = (a*50)/100;
		float spallowance = (a*75)/100;
		float pf = (a*12)/100;
		System.out.println((a+hra+spallowance)-pf);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       calculateNetSalary();
	}

}
