/*	Algorithm
 * ----------------
 * step 1: Assume MIN element at index 0
 * 
 * step 2: Search MIN element by comparing with element at 0 index
 * 
 * step 3: if found swap that element with element at location 0
 * 
 * step 4: Increment Minimum element (Set MIn to index 1) and find next minimum element
 * 
 * step 5: repeat step4
 * 
 * step 6: exit
 * 
 */

package main.core;

public class SelectionSort {
	public static void selection(int A[]) {
		int n=A.length;
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			
			for(int j=i+1;j<n;j++) {
				if(A[j]<A[min]) {
					min=j;
				}
			}
			int temp=A[min];
			A[min]=A[i];
			A[i]=temp;
		}
	}
		public static void main(String args[]) {
			int arr[]= {12,2,10,3,56,34};
			
			selection(arr);
			
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}
}
