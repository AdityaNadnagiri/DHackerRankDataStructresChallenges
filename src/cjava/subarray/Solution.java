package cjava.subarray;

import java.util.Scanner;

public class Solution {

    	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter the Number of elements in the array");
		Scanner input = new Scanner(System.in);
		int[] a = new int[input.nextInt()];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		input.close();

		for (int j = 0; j < a.length; j++) 
		{
			for (int i = 0; i < (a.length - j); i++) 
			{
				int l = 0;
				int k = 0;
				while (l <= j) 
				{

					k += a[i + l];
					l++;

				}
				if (k < 0) 
				{
					count++;
				}

			}

		}
		System.out.println(count);
	}
}