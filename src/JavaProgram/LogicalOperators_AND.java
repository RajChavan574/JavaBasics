package JavaProgram;

public class LogicalOperators_AND
{

	public static void main(String[] args) 
	{
		int age=54;
		int salary=72000;
		if(age>18 && salary==50000)
		{
			System.out.println("r you talking about ram ?");
		}
		else if (age>18 && salary==72000)
		{
			System.out.println("R u talking about sita ?");
		}
		else
		{
			System.out.println("I got it, Its laxman ?");
		}

	}

}
// Syntax of or operators - if (c1 || c2)