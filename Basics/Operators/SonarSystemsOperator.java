public class SonarSystemsOperator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int num1 = 5;
		int num2 = 3;

		// Arithmetic operators
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num1 % num2);
		//System.out.println(++num1);
		//System.out.println(--num2);

		// Relational operators
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);

		// Bitwise operators
		System.out.println(num1 & num2);

		boolean var1 = true;
		boolean var2 = false;

		// Logical operators
		System.out.println(var1 && var2);
		System.out.println(var1 || var2);

		// Assignment operators
		int num3 = 4;
		num3 += 8; // num3 = num3 + 8;
		System.out.println(num3);

		// Conditional operator
		int num4 = 65;
		int num5 = 63;

		int result = (num4 == num5) ? 34 : 19;
		System.out.println(result);

		Operator01();
	}

	public static void Operator01() {
		boolean a = true;
		boolean b = false;
		boolean c = a | b;
		boolean d = a & b;
		boolean e = a ^ b;
		boolean f = (!a & b) | (a & !b);
		boolean g = !a;
		System.out.println("This the SECOND Prog****");
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" a|b = " + c);
		System.out.println(" a&b = " + d);
		System.out.println(" a^b = " + e);
		System.out.println("!a&b|a&!b = " + f);
		System.out.println(" !a = " + g);
	}

}
