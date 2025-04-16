package test_27_03_25;

import java.util.Scanner;

public class IntegersEqualOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = s.nextInt();
		System.out.println("Enter the Second Number");
		int b = s.nextInt();
		s.close();		
		if(a==b)
			System.out.println(a*b);
		else
			System.out.println(a/b);
	}
}
