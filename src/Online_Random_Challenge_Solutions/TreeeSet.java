package Java_Helper_Codes;

import java.util.*;

public class TreeeSet {

	public static void main(String[] args) {
		//TreeSet is a set in which you can compare elements 
		//while performing operations on them
		Set<String> set = new HashSet<>();
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("Beijing");
		set.add("Lucknow");

		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println("first(): " + treeSet.first());
		System.out.println("last(): " + treeSet.last());
		System.out.println(treeSet);
		
		System.out.println(treeSet.headSet("New York"));
		System.out.println(treeSet.tailSet("London"));
		System.out.println(treeSet.ceiling("L"));
		System.out.println(treeSet.floor("L"));
	}

}
