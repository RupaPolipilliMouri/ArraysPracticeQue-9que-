package Arrays9Problem;

import java.util.*;
import java.util.stream.*;
public class Problem5
{
    public static void main(String[] args) {
    Integer[] intArray = {10,20,33,44,56,60,70,80,90};
     
  //print array starting from first element
    System.out.println("Original Array:");
    for(int i=0;i<intArray.length;i++)
         System.out.print(intArray[i] + "  ");
     
    System.out.println();
     
    //print array starting from last element
    System.out.println("Original Array printed in reverse order:");
         for(int i=intArray.length-1;i>=0;i--)
         System.out.print(intArray[i] + "  ");
    }
}