package day5;

public class LowQtyException extends Exception {
	
	String errorMsg;
	
	public LowQtyException(String errorMsg)
	{
		this.errorMsg=errorMsg;
	}

	public String toString()
	{
		return this.errorMsg;
	}
}
