package Arrays9Problem;
 
public class Problem3 {
public static boolean areSame(Integer arr[])
    {
       Integer first = arr[0];
       for (int i=1; i<arr.length; i++)
           if (arr[i] != first)
                return false;
       return true;
    }
 
    // Driver code
public static void main(String[] args)
    {
        Integer[] arr = { 1, 2, 3, 2 };
        if (areSame(arr))
            System.out.println("All Elements are Same");
        else
            System.out.println("Not all Elements are Same");
    }
}