package day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {
								 
		int arr[]=new int[2];    
		
		Scanner sc=new Scanner(System.in);  
		
		try
		{
		System.out.println("Enter Number for zero index"); 
		arr[0]=sc.nextInt();
		System.out.println("Enter Number for one index"); 
		arr[1]=sc.nextInt();
			
			try
			{
			System.out.println("Enter Index for numerator"); 
			int k=sc.nextInt(); 
			int numerator=arr[k]; 
			
			System.out.println("Enter Index for denominator");//1
			int m=sc.nextInt();//1
			int denominator=arr[m]; //5
			
			int result=numerator/denominator;
			System.out.println(result); //2
			}
			catch(ArrayIndexOutOfBoundsException e2)
			{
				System.out.println("Please enter 0 or 1 only");
			}
			
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter int values only");
		}

	}

}
