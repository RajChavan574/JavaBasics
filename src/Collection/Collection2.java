package Collection; //Q. How to iterate using list iterator in list interface. 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection2 
{

	public static void main(String[] args) 
	{
		ArrayList a1 =new ArrayList();
		a1.add("8765");
		a1.add(321);
		a1.add("Raju");
		a1.add("Sun");
		a1.add("Moon");
		
		Iterator i1 = a1.iterator();
		while(i1.hasNext()==true)
		{
			System.out.println(i1.next());
		}
		System.out.println("===========");
		
		  ListIterator i2= a1.listIterator();
		  while(i2.hasNext()==true)
		  {
			  System.out.println("Farward Ineration->"+i2.next());
		  }
		  System.out.println("=========");
		  while(i2.hasPrevious()==true)
		  {
			  System.out.println("backward Ineration-> "+i2.previous());
		  }
	}
}
