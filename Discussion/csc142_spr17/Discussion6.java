package csc142_spr17;

import java.util.Arrays;

public class Discussion6 {

	public static void main(String[] args) {
		double[][] newArray = { { 99, 42, 74, 83, 100 }, { 90, 91, 72, 88, 95 } };
		double[] numbers = {100.0, 99.0, 79.0, 243.0};
		oneRowPerLine(newArray);
		double lowestValue = numbers[0];

		String[] names = {"mom", "cat", "beverage", "room", "shower", "tree"}; // Assume the array has been filled with values
		

				int[] nums1 = {7, 6, 5, 4};
				int[] nums2 = {7, 6, 5, 4};
				boolean ans1 = (nums1 == nums2);
				boolean ans2 = nums1.equals(nums2);
				boolean ans3 = Arrays.equals(nums1, nums2);
				//System.out.println( ans1 + "-" + ans2 + "-" + ans3 );
				
				
				
				int vSize = 5; 
				double[ ] v = new double[vSize]; 
				for (int i = 0; i < vSize; i++) 

				v[i] = 1.1;
				System.out.println( v[0] );
				int[ ] x = {3, 4, 5, 6, 7}; 
				int[ ] y = x; 
				for (int i = 0; i < 3; i++) 

				y[i + 2] = 3 * y[i];
				System.out.println( x[3] );
	}

	public static void oneRowPerLine(double[][] arrayInput) {
		
		for (int i = 0; i < arrayInput[0].length; i++) {
			for (int j = 0; j < arrayInput.length; j++) {
				System.out.print(arrayInput[j][i] + " ");
			}
			System.out.println();
		}
	}
}