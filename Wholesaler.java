package day5;

import java.util.Scanner;

public class Wholesaler {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Order Quantity"); //2
		int qty=sc.nextInt();
		
		try
		{
			if(qty<500)
			{
				throw new ArithmeticException();
			}
			else
			{
			System.out.println("Order Placed");
			}
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Please enter quantity >500");
		}
		finally
		{
			System.out.println("Thank You! Visit Again");
		}
	}

}
