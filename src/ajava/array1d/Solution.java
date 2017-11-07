package ajava.array1d;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number Of Elements In The Array");
		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter Element "+i);
			a[i] = input.nextInt();
		}
		input.close();
		for(int s:a) {
			System.out.println(s);
		}

	}

}
