package Assignments; //(1st int a ,2nd float a ,3rd char a ,4th string a ,5th boolean a) 

public class Assignment_5 //assignment 5 - create 5 constructor and call it in main method
{
	Assignment_5(int a)
	{
		System.out.println("1");
	}
	Assignment_5 (float a)
	{
		System.out.println("2");
	}
	Assignment_5 (char myLetter)
	{
		System.out.println("3");
	}
	Assignment_5 (String a)
	{
		System.out.println("4");
	}
	Assignment_5 (boolean a)
	{
		System.out.println("5");
	}
	
	public static void main(String[] args) 
	{
		new Assignment_5(11);
		new Assignment_5(8.90f);
		new Assignment_5('A');		
		new Assignment_5("Hello");
		new Assignment_5(true);
	}
}
