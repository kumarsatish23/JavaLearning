/*	Algorithm
 * 	----------------------------------------------------------------------
 * 
 * step 1:	declare an array A inside main method
 * 
 * 				call the static method by passing this array as parameter
 * 
 * step2:	create a static method that takes integer array as parameter
 * 
 * step3:	declare array length as N
 * 
 * step4:	For i=0 to N-1 repeat step 5 (for every element)
 * 
 * step5:	For j=1 to n-i repeat (compares with all the element)
 * 
 * step6: 	IF A[j-1]>A[j]	(checks with element next to it)
 * 
 * 				SWAP A[j-1] and A[j]
 * 
 * 				End of inner loop
 * 
 * 				End of outer loop
 * 
 * step7: 	Exit
 * 
 * 
 */



package main.core;

import java.util.Scanner;

public class Bubble {
	static void bubbleSort(String[] arr) {
		int n=arr.length;
		String temp=null;
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
/*if(A[j-1]>A[j])*/ if(arr[j-1].compareTo(arr[j]) > 0) {
						temp=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
			}
		}
	}
	
	public static void main(String[] args) {
			System.out.println("Enter length of array:");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			String[] arr=new String[n];
			System.out.println("Enter the elements:");
			for(int i=0;i<n;i++) {
				arr[i]=s.next();
			}
			System.out.println("Elements Before sorting:");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
			
			bubbleSort(arr);
			
			System.out.println("Elements After sorting:");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+"\t");
			}
	}

}
