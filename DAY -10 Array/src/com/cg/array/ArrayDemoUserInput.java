package com.cg.array;

import java.util.Scanner;

public class ArrayDemoUserInput {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		//to enter the elements in the array
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("Enter the "+i+" index");
			arr[i]=sc.nextInt();
		}
		//print the element of array
		/*for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}*/
		
		//enhanced for loop
		
		for(int j :arr) 
		{
			System.out.println(j);
		}
		

	}

}
