package Java.Data_Structures.Others;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListandLists {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(0, 12);
		arrayList.add(2, 12);
		
		java.util.Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println(arrayList);
		
		System.out.println("Linked list");
		
		LinkedList<Object> linkedList = new LinkedList<>(arrayList);
		linkedList.add(1,"red");
		linkedList.removeLast();
		linkedList.addFirst("green");
		
		System.out.println(linkedList);
		
		System.out.println("#####Forward Sequence");
		ListIterator<Object> listIterator = linkedList.listIterator();
		while(listIterator.hasNext()){
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();
		System.out.println("#####Previous Sequence");
		while(listIterator.hasPrevious()){
			System.out.print(listIterator.previous() + " ");
		}
		
		Collection<String> collection1 = java.util.Arrays.asList("Red","Green","Blue");
		Collection<String> collection2 = java.util.Arrays.asList("Red","Yello","Black");
		System.out.println();
		System.out.println(Collections.max(collection1));
		System.out.println(Collections.min(collection1));
		System.out.println(Collections.max(collection2));
		System.out.println(Collections.min(collection2));
		System.out.println(Collections.disjoint(collection1, collection2));
		
		System.out.println(Collections.frequency(collection1, "Red"));
		
	}

}
