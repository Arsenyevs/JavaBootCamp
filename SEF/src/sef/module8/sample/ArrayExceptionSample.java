package sef.module8.sample;
// Needs to be completed
public class ArrayExceptionSample {

	public static void main(String arg[]) {

		//The valid indices for this array are from 0 to 4
		int scores[] = new int[5];
		scores[0] = 1;
		scores[1] = 2;
		scores[2] = 112;
		scores[3] = 123;
		scores[4] = 124;

		//But the the loop below will run from 0 to 5.
		//Last index is 4 so accessing scores[5] will cause an exception
		//1 - Create a for loop that runs from 0-5. Print elements of this array inside the loop.
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(scores[i]);
//				System.out.println(100/0);     // If you uncomment this, you will catch Arithmetic error after printing only 1 number
			}


			// The above loop is a logical error in the program which results in
			// ArrayIndexOutOfBoundsException. This is an example of Unchecked Exception.


		} catch (ArithmeticException ArithEx) {
			System.out.println("You are here because of arithmetic exception");
		} catch (ArrayIndexOutOfBoundsException ArrEx) {
			System.out.println("Oops , you are in catch block because of ArrayIndexOutOfBoundsException" + 10/0);
		}
		finally {
			System.out.println("It will be printed anyway even if there is error in exception statement");
		}
		System.out.println("It wont be printed if there is an error in exception statement");
	}
}
