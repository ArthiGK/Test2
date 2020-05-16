package javaPrograms;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[] = new int[5];
 int i=0,avg,sum=0;
 System.out.println("Enter the numbers to find the average:");
 for(i=0;i<a.length;i++)
 {
	 Scanner s =new Scanner(System.in);
	 a[i]=s.nextInt();
	 sum=sum+a[i];
 }
 avg=sum/a.length;
 System.out.println("The average is: " + avg);
 }
	}


