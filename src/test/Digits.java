package test;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("number is");
     int n=sc.nextInt();
     System.out.println("digit is");
     int d = sc.nextInt();
     int rem=n;
     int q=0;
     while(d>=0)
     {
    	 rem=rem%10;
    	 q=n/10;
    	 
     }
	}

}
