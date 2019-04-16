package test1;

public class test {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
	{
		if(equalOk)
			return (a <= b && b <= c);
		return (a < b && b < c);
	}
	public static void main(String[] args)
	
	{
		test ob = new test();
		boolean a=ob.inOrderEqual(7,5,5,true);
		System.out.println(a);
	}
}
