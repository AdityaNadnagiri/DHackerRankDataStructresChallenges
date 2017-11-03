package aJava1DArray;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = input.nextInt();
		}
		input.close();
		for(int s:a) {
			System.out.println(s);
		}

	}

}
