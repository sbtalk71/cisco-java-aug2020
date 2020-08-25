package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetDemo {

	public static void main(String[] args) {

		List<Integer> namesSet=new ArrayList<>();
		

		namesSet.add(1);
		namesSet.add(2);
		namesSet.add(3);
		namesSet.add(4);
		namesSet.add(5);
		namesSet.add(6);
		namesSet.add(7);
		namesSet.add(8);
		namesSet.add(7);
		

		namesSet.remove(new Integer(7));
		
		System.out.println(namesSet);

		

		

		namesSet.stream().forEach(s -> System.out.println(s));

	}

}
