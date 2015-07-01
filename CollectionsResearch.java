package general;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsResearch {

	public static void main(String[] args) {
		Set<String> xx = new TreeSet<String>();
		Set<Object> yy = new LinkedHashSet<>();
		List<String> aa = new LinkedList<String>();
		aa.add("Rama101");
		aa.add("Rama11");
		aa.add("Rama10");
		yy.add("Rama110");
		yy.add("Rama11");
		yy.add("Rama10");

		xx.add("XXa");
		xx.addAll(aa);
		System.out.println(yy);
		System.out.println(xx);
		xx.removeAll(aa);
		System.out.println(xx.size());
	}
}
