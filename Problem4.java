package Arrays9Problem;

import java.util.Scanner;

public class Problem4 {
	
	/*
	4. Take 20 integer inputs from user and print the following:
	number of positive numbers
	number of negative numbers
	number of odd numbers
	number of even numbers
	number of 0s.
	*/

	public static void main ( String ar [])

	{

	Scanner sc=new Scanner (System.in);

	int n,I,p=0,c=0,o=0,e=0,z=0;

	for(I=1;I<=20;I++);

	{

	System.out.println("Enter a number");

	n=sc.nextInt();

	if (n>0)

	p++; //count of positive no's.

	if (n<0)

	c++; //count of negative no's.

	if (n%2==0)

	e++; //count of even no's.

	if (n%2!=0)

	o++; //count of odd no's

	if (n==0)

	z++; //count of zeros

	}

	System.out.println("number of positive numbers"+p);

	System.out.println("number of negative numbers"+c);

	System.out.println("number of odd numbers"+o);

	System.out.println("number of even numbers"+e);

	System.out.println("number of zeroes"+z);

	}
}