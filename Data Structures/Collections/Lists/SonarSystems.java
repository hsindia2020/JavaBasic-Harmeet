import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SonarSystems {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		List<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Lucid Motors");
		cars.add("Camaro");

		System.out.println(cars);
		//System.out.println(cars.get(0));

		for (int i = 0; i < cars.size(); i++)
		{
			System.out.println(cars.get(i));
		}

		List<String> cars2 = new LinkedList<String>();
		cars2.add("BMW");
		cars2.add("Tata Motors");
		cars2.add("Honda");

		System.out.println(cars2);
		//System.out.println(cars.get(0));

		for (int i = 0; i < cars2.size(); i++)
		{
			System.out.println(cars2.get(i));
			System.out.println("**************");
		}
		System.out.println(" "+cars2.size());
	}
}