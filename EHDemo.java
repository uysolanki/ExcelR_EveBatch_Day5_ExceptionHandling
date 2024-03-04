package day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EHDemo {

	public static void main(String[] args) {
		int n;
		int d;
		double result;
		
		Scanner sc=new Scanner(System.in);
		try
		{
//		String a1="A123";
//		int n1=Integer.parseInt(a1);
//		System.out.println(n1);
			
			int arr[]=new int[2];
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
		
		System.out.println("Enter Numerator"); //10
		n=sc.nextInt();
		System.out.println("Enter Denominator"); //2
		d=sc.nextInt();
		
		result=n/d;
		
		String name=null;
		System.out.println(name.length());
		
		System.out.println(result);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Please enter valid Denominator");
		}
		catch(InputMismatchException e2)
		{
			System.out.println("Please enter valid Number");
		}
		catch(NumberFormatException e3)
		{
			System.out.println("Please enter valid String");
		}
		
		catch(ArrayIndexOutOfBoundsException e4)
		{
			System.out.println("Please enter valid Subscript/index");
		}
//		catch(RuntimeException e3)
//		{
//			System.out.println("Please allocate value to refernce");
//		}
		finally
		{
			System.out.println("Thank You! Visit Again");
		}

	}

}
