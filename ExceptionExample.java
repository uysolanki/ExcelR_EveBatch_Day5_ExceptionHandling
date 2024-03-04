package day5;

import java.util.Arrays;

public class ExceptionExample {
public static void main(String[] args) {
	String s1="I am 23 years old and 34 my friend  99 is 21 years old";
	//count the number of integers in this string;
	String arr[]=s1.split(" ");
	//System.out.println(Arrays.toString(arr));
	int counter=0;
	for(String s:arr)
	{
		try
		{
		int x=Integer.parseInt(s);
		counter++;
		}
		catch(NumberFormatException e1)
		{
			
		}
	}
	System.out.println("Number of Integers are" + counter);
}
}
