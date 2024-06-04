package Assignments;

public class Assignment_6 

{
	static //SIB
	{
		System.out.println("I am SIB");
	}
	
	{
		System.out.println("I am IIB");
	}
	
	Assignment_6()//constructor
	{
		System.out.println("I am Constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("I am your first main method");
		Assignment_6 s1= new Assignment_6();
		
		System.out.println("I am your second main method");
		Assignment_6 s2= new Assignment_6(); // Additional object creation

	}

}
