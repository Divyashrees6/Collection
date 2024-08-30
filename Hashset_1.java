package collection;
import java.util.HashSet;
public class Hashset_1 {
	public static void main(String[] args) {

		HashSet h1 = new HashSet();
		
		h1.add(56);
		h1.add(76);
		h1.add(56);
		h1.add(99);
		h1.add(33);
		h1.add(33);
		h1.add(null);
		h1.add(null);
		h1.add(null);
		h1.add(null);

		h1.add(true);
        h1.add("divya");
        h1.add("divya");
        
        System.out.println(h1);
	}

}
