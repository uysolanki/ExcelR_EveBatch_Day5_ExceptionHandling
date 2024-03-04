package day5;

public class FinallyDemo {

	public static void main(String[] args) {
		boolean result=test();
		System.out.println(result);
	}

	private static boolean test() {
		try
		{
			return true;
		}
		catch(Exception e1)
		{
			System.out.println("hi");
		}
		finally
		{		
		return false;
		}
	}

}
