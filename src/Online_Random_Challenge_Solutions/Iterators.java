package Java_Helper_Codes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("Hello");
		collection.add("I am");
		collection.add("Dhananjay");
		collection.add("Trivedi");
		
		Iterator<String> iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next().toUpperCase()+" ");
		}

	}

}
