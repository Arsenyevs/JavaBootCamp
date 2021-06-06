package sef.module9.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		Set s1 = new HashSet();
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class.
		s1.add("John");
		s1.add("Paul");
		s1.add("Jeccie");
		s1.add("Magnet");




		//Also try adding a few duplicate entries to this set.

		s1.add("Paul");
		s1.add("John");
		
		
		//2 - Call print method to print the set passed as its parameter.
		print(s1);
	}
	
	static void print(Set set)
	{
		Iterator q = set.iterator();
		while (q.hasNext()) {
			System.out.println(q.next());
		}
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
	}
}
