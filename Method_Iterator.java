package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Method_Iterator {
	public static void main(String[] args) {


		Collection c1      =        new ArrayList();
		c1.add("Age");
		c1.add("color");
		c1.add(56);
		c1.add(false);
		c1.add(56);
		c1.add(56);
		c1.add(45.77);
		c1.add(null);
		
		System.out.println(c1);
		
		Iterator i1= c1.iterator();
		
		while(i1.hasNext())  //Indexing 0 is der or not
		{
			System.out.println(i1.next()); //Just go and print
		}
		
		
	}

}
