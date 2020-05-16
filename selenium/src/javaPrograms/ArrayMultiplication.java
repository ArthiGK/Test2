package javaPrograms;

import java.util.Scanner;

public class ArrayMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[20];
int i=0,j=0,k=0,mul=1;
System.out.println("Enter the number of numbers to be multiplied:");
Scanner s = new Scanner(System.in);
k=s.nextInt();
System.out.println("Enter the " + k + " numbers");

for(i=0;i<k;i++)
{
	a[i]=s.nextInt();
	//i++;
}

i=0;
for(i=0;i<k;i++)
{
	System.out.println(i);
	mul=mul*a[i];
}

System.out.println("The multiplied value is: " + mul);
}
	
}
