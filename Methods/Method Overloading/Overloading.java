
public class Overloading {

	public static void main(String[] args)
	{
		// Method Overloading is multiple calling.

		Hello();
		/*
		 * Hello(); Hello(); Hello();
		 */
		Hello(7);
		Hello(4, 7);
		Hello(true);
		Hello(false);
	}

	public static void Hello()
	{
		System.out.println("Hello World");
	}
	
	public static void Hello(int x)
	{
		System.out.println(x);
	}

	public static void Hello(boolean x)
	{
		if (x == true)
		{
			System.out.println("It is true");
		}
		else
		{
			System.out.println("It is false");
		}
	}

	public static void Hello(int x, int y)
	{
		System.out.println("Multiple of " + x + " X " + y + " = " + (x * y));
	}
	
}
