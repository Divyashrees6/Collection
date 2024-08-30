package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Set {
	public static void main(String[] args) {

		List l1 =new ArrayList();
		 l1.add(87);
		 l1.add(63);
		 l1.add(56);
		 l1.add(99);
		 l1.add(33);
		 l1.add(77);
		 Collections.sort(l1);  // Ascending sorting

		 System.out.println(l1);
		
		 //forward iteration
		 System.out.println("Iteration farward");
		Iterator i2=  l1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
	  ListIterator l4	= l1.listIterator();
		 System.out.println("farward iteration using list iterator");

	  
	  while(l4.hasNext())
	  {
		  System.out.println(l4.next());
	  }
		 System.out.println("backward iteration using list iterator");

	  while(l4.hasPrevious())
	  {
		  System.out.println(l4.previous());
	  }
	
	}

}
