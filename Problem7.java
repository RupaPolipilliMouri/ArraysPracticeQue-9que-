package Arrays9Problem;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		/* Take an array of length n where all the numbers are nonnegative and unique. Find the element in the array possessing the highest value. Split the element into two parts where first part contains the next highest value in the array and second part hold the required additive entity to get the highest value. Print the array where the highest value get splitted into those two parts.
		Sample input: 4 8 6 3 2
		Sample output: 4 6 2 6 3 2*/
		
		
		Scanner sc= new Scanner(System.in);
	    System.out.println("define length of array");
	    int l =sc.nextInt();
	    int [] arr =new int[l];
	    System.out.println("enter elements");
	    for (int i =0;i<l;i++){
	        int flag=0;
	        int a = sc.nextInt();
	        for (int e : arr) {
	            if(e==a){
	                flag=1;
	                break;
	            }
	        }
	        if (flag==0){
	            arr[i]=a;
	        }
	        else {
	            System.out.println("enter unique no.");
	            break;
	        }
	    }
	    int [] arr2 = new int[l+1];
	    int max=arr[0];
	    int second_max=arr[0];
	    int j=0;
	    for (int i=0;i<l;i++){
	        if(arr[i]>max){
	            max=arr[i];
	            j=i;
	        }
	    }
	    for (int i =0;i<l;i++){
	        if (arr[i]>second_max && arr[i]<max){
	            second_max=arr[i];
	        }
	    }
	    for (int i= 0;i<j;i++){
	        arr2[i]=arr[i];
	    }
	    arr2[j]=second_max;
	    arr2[j+1]=max-second_max;
	    for (int i=j+2;i< arr2.length;i++){
	        arr2[i]=arr[i-1];
	    }
	    for (int e:arr2){
	        System.out.print(e+" ");
	    }
	}

}
