
public class SonarSystemsWhileLoop {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		   
		System.out.println("For Loop");
		
		for (int i = 0; i < 100; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("\nWhile Loop");
		
		int j = 0;
		
		while (j < 100)
		{
			System.out.println(j);
			
			j++;
		}
		
		System.out.println("\nDo While Loop");
		
		int k = 0;
		
		do
		{
			System.out.println(k);
			
			k++;
		} while(k < 100);
	}

}
