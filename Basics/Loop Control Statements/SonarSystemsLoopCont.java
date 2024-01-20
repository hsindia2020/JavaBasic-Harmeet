
public class SonarSystemsLoopCont {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++)
		{
			System.out.println(i);

			if (i == 7)
			{
				System.out.println("Break is calling");
				break;
			}
		}

		for (int i = 0; i < 10; i++)
		{
			if (i == 5)
			{
				System.out.println("Continue is calling");
				continue;
			}
			
			System.out.println(i);
		}
	}

}
