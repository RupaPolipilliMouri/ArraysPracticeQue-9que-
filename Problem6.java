package Arrays9Problem;



public class Problem6 {

		/*
		6.Consider an integer array, the number of elements in which is determined by the user. 
		The elements are also taken as input from the user. 
		Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
		maximum difference = highest-lowest
		minimum difference = second lowest - lowest
		
	*/
	 public static void main (String[] args)
	{
        int A[] = {1, 2, 3, 4, 5};
        int min = A[0];
        int max = A[0];

        for (int i = 0; i < A.length; i++)
        {
            if (min > A[i])
            {
                min = A[i];
            }

            if (max < A[i])
            {
                max = A[i];
            }
        }
        System.out.println(max - min);
    }
}



