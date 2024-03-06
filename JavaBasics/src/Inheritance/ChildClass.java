package Inheritance;


class ParentClass
{
	static void add()
	{
		System.out.println("Hey I am parent class method");
	}
}


public class ChildClass extends ParentClass
{
	static void child()
	{
		System.out.println("Hey I am child class method");
	}

	public static void main(String[] args) 
	{
		child();
		parent();

	}

}
