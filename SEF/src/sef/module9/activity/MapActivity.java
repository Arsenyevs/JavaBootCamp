package sef.module9.activity;
//Needs to be completed

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class MapActivity {

	static String temp = "My Testing " ;


		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String  and value is a name
			Map m1 = new HashMap();
			m1.put("Key1","Bruce");
			m1.put("Key6","Bruasassssasaas");
			m1.put("Key2","Lee");
			m1.put("Key3","Margarita");
			m1.put("Key4","Dainis");
			m1.put("Key5","Roland");



			print(temp);
			print1(10);
			print2(temp);
			print3(temp);
			//2 - Call print method to print the map passed as its parameter.
			System.out.println(m1);



		}


		static void print(String temp)

		{

			System.out.println(temp.toUpperCase());

		}
		static void print1(int a)
		{
			//int a = 10;
			for (int i = 0 ; i< a; i++) {


				
				
				
				
			}
		
		}
		static void print2(String test)
		{
//			int temp = Integer.valueOf(test);
			
			System.out.println(test.toUpperCase());
		
		}
		static void print3(String test)
		{
//			int temp = Integer.valueOf(test);
			
			System.out.println(test.toUpperCase());
		
		}
	}
