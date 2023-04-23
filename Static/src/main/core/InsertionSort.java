/*	Algorithm
 * ---------------
 * 
 * step 1: Start from 1st index representing it as key and goes iterations
 * 
 * step 2: compare the current element with elements before that
 * 
 * step 3: if key is smaller than before elements, keep iterating to  the before elements
 * 
 * step 4: move the elements having greater value one position up to make space for the swapped elements.
 * 
 * 
 * 
 */

package main.core;

public class InsertionSort {
	public static void Insert(int A[]) {
		int n=A.length;
		
		for(int i=1;i<n;i++) {
			int key=A[i];
			int j=i-1;
			
			while(j>=0 && A[j]>key) {
				A[j+1]=A[j];
				j--;
			}
			A[j+1]=key;
		}
	}
	public static void main(String args[]) {
		int arr[]= {12,2,10,3,56,34};
		
		Insert(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
