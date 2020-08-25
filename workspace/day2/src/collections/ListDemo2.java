package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ListDemo2 {

	public static void main(String[] args) {

		// Set<String> namesSet=new HashSet<>();
		// Set<String> namesSet=new LinkedHashSet<>();
		SortedSet<String> namesSet = new TreeSet<>();

		namesSet.add("shantanu");
		namesSet.add("kamal");
		namesSet.add("raja");
		namesSet.add("chandra");
		namesSet.add("arun");
		namesSet.add("vipul");
		namesSet.add("raja");
		namesSet.add("kiran");

		System.out.println(namesSet);

		Iterator<String> itr = namesSet.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			if (name.contains("i"))
				System.out.println("Welcome " + name);
		}

		for (String s : namesSet) {
			if (s.contains("i"))
				System.out.println(s);
		}

		namesSet.parallelStream().filter(s -> s.contains("i")).forEach(s -> System.out.println(s));

	}

}
