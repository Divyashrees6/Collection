package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Method_3 {

	public static void main(String[] args) {
		
		Collection c1      =        new ArrayList();
		c1.add("Age");
		c1.add("color");
		c1.add(56);
		c1.add(false);
		c1.add(45.77);
		System.out.println(c1);
		
		Collection c2      =        new ArrayList();
		c1.add("Hi");
		c1.add(false);
		c1.add(49.77);
		System.out.println(c2);
		
		System.out.println(c1.size());
		boolean b1 = c1.contains("divya");
		System.out.println(b1);
		
		boolean b3= c2.containsAll(c1);
		System.out.println(b3);
	}

}
