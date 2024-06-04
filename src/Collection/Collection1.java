package Collection; //Q. how to Itrate the data in Collections ?

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 
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

	}

}

