package Arrays9Problem;

import java.util.Arrays;

public class Problem2 {
	
	public static void main(String[] args)
	{
		//able to find that the subarray lies between the indexes 3 and 8
		
		int[] arr = new int[] { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		int[] subArr = new int[6];
		
		for (int i = 0, j = 3; j <= 8; i++, j++) {
			subArr[i] = arr[j];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(subArr));


		
		
	}

}
