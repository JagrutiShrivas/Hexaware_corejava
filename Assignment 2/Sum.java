// Sum of all elemenys in an array

//package practice;

import java.util.*;

public class Sum {
	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 	System.out.println("Enter size of array: ");
	 	int n= sc.nextInt();
	 	
	 	int arr[]= new int[n];
	 	int sum=0;
	 	
	 	System.out.println("Enter elements of array: ");
	 	for(int i=0; i<n; i++) {
	 		arr[i]= sc.nextInt();
	 		sum= sum+ arr[i];
	 		
	 	}
	 	
	 	System.out.println("Sum of elements in array: "+sum);
	}
	 	
 
}
