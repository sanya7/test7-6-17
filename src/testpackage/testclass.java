package testpackage;

public class testclass {

	public String concatenate(String one,String two)
	{
		return one + two;//refactor variables(ALT +SHIFT + R)
	}
	
	public int multiply(int num1, int num2)
	{
		return mulnum(num1, num2);//extract method(ALT + SHIFT + M) --> mulnum is my method name
	}

	private int mulnum(int num1, int num2) {//refactor > inline (ALT + SHIFT + I)
		return num1 * num2;
	}
}
