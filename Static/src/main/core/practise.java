package main.core;

import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		System.out.println("Enter length of array");
		Scanner s=new Scanner(System.in);
		int length=s.nextInt();
		String[] str=new String[length];
		
		System.out.println("Elements of Array:");
		for(int i=0;i<length;i++) {
			str[i]=s.next();
		}
		
		for (int i = 0; i < length; i++)
        {
            for (int j = 1; j < i-1; j++)
            {
                System.out.println(str[j-1].compareTo(str[j]));
            }
        }
	}
}
