/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class FindInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create an integer array
		int[] nums = {300, 15, 400, 20};
		
		int result = nums[2];
		
		// Find smallest in an array
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < result) {
				result = nums[i];
			}
		}
		System.out.println("Smallest in array is "+result);
		
		result = nums[0];

		
		// Find largest in an array
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > result) {
				result = nums[i];
			}
		}
		System.out.println("Largest in array is "+result);

	}

}
