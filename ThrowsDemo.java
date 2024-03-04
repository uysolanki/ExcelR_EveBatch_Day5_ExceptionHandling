package day5;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator"); //2
		int n=sc.nextInt();
		System.out.println("Enter Denominator"); //2
		int d=sc.nextInt();
		try {
			System.out.println(divide(n,d));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static double divide(int n, int d) throws IOException
	{
		return n/d;
	}

}
