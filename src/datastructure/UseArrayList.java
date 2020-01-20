package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> Student = new ArrayList<>();

		Student.add("Rizwan");
		Student.add("Shah");
		Student.add("Quazi");



		System.out.println("Printing elements from ArrayList: " + Student);


		System.out.println("Peek first element: " + Student.get(0));


		System.out.println("Remove element at index 1: " + Student.remove(1));


		System.out.println("Re-retrieving elements from ArrayList: " + Student);

		//Using 'forEach' loop
		System.out.println("Use of for each loop: ");
		for (String st : Student) {
			System.out.println(st);
		}

		//using iterator
		System.out.println("Use of iterator using while loop: ");
		Iterator it = Student.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}








	}

}
