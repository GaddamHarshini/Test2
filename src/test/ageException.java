package test;

import java.util.Scanner;

public class ageException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter number");
		int ContactDetails=sc.nextInt();
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age<20||age>55)  
		{
			try {
				throw new AgeExcep();
			} catch (AgeExcep e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			System.out.println("details accepted");
		}

	}

}
