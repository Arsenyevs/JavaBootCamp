package sef.module9.activity;
//Needs to be completed

//import sef.module9.sample.ListSample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List a1 = new ArrayList();
		a1.add("one");
		a1.add("two");
		a1.add("four");
		a1.add("three");

		//2 - Call print method to print the list passed as its parameter.
		ListActivity b=new ListActivity();
		b.print(a1);




	}
	public void print (List a1)
	{
		Iterator i = a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//3 - Type code to print this list
		//Notice the order in which elements get printed.

	}
	

}
